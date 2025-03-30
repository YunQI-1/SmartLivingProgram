package com.jsu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Course;
import com.jsu.old.mapper.CourseMapper;
import com.jsu.old.service.CourseService;
import com.jsu.query.PageQuery;

import com.jsu.utils.ExcelUtils;
import com.jsu.utils.QueryUtils;
import com.jsu.vo.CourseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public PageDTO<CourseVO> getCourses(PageQuery pageQuery) {
        //构建分页查询条件
        Page<Course> page = pageQuery.toMpPage();

        //分页查询
        Page<Course> p = lambdaQuery().page(page);

        //返回VO结果
        return PageDTO.of(p,CourseVO.class);
    }

    @Override
    public void importCourse(MultipartFile file) throws Exception {
        List<Course> courseList = ExcelUtils.readMultipartFile(file, Course.class);
        log.info(courseList.toString());
        courseMapper.createCourse(courseList);
    }

    @Override
    public void exportCourse(HttpServletResponse response, ExportConfigDTO<Course> exportConfigDTO) {
        QueryWrapper<Course> wrapper=new QueryWrapper<>();
        QueryUtils.buildFuzzyQuery(exportConfigDTO.getQueryParams(),wrapper);
        List<Course> courses=courseMapper.selectList(wrapper);
        ExcelUtils.exportWithDynamicColumns(
                response,
                "课程表.xlsx",
                courses,
                Course.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }

    @Override
    public boolean updateByCourseNumber(Course course) {
        log.info("修改课程信息"+course);
        if (courseMapper.updateByCourseNumber(course)){
            log.info("修改成功返回的是true!");
        }else{
            log.info("修改失败返回的是false!");
        }
        return courseMapper.updateByCourseNumber(course);
    }

}
