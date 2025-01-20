package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Course;
import com.jsu.entity.StudentInformation;
import com.jsu.mapper.CourseMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.CourseService;
import com.jsu.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService{

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
}
