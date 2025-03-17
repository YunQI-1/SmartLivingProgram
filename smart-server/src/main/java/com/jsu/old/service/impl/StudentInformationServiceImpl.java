package com.jsu.old.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.StudentInformationDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.old.mapper.StudentInformationMapper;
import com.jsu.old.service.StudentInformationService;
import com.jsu.query.PageQuery;

import com.jsu.utils.ExcelUtils;
import com.jsu.utils.QueryUtils;
import com.jsu.vo.StudentInformationVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class StudentInformationServiceImpl extends ServiceImpl<StudentInformationMapper, StudentInformation> implements StudentInformationService {

    @Autowired
    private StudentInformationMapper studentInformationMapper;


    /**
     * 管理端查询学生信息
     * @param pageQuery
     * @return
     */
    @Override
    public PageDTO<StudentInformationVO> getStudentInformation(PageQuery pageQuery) {
        // 构建分页条件
        Page<StudentInformation> page = pageQuery.toMpPage();

        //分页查询
        Page<StudentInformation> p = lambdaQuery().page(page);

        //封装结果返回
        return PageDTO.of(p,StudentInformationVO.class);
    }

    @Override
    public List<StudentInformationVO> getStudentInformationDetail(QueryDTO queryDTO) {
        log.info(studentInformationMapper.getStudentInformationDetail(queryDTO).toString());
        return studentInformationMapper.getStudentInformationDetail(queryDTO);
    }

    @Override
    public void importStudentInformation(MultipartFile file) throws Exception {
        List<StudentInformationDTO> list= ExcelUtils.readMultipartFile(file, StudentInformationDTO.class);
    }

    @Override
    public void exportStudentInformation(HttpServletResponse response, ExportConfigDTO<StudentInformationDTO> exportConfigDTO) {
        log.info("导出自选字段为：{}的学生成绩表",exportConfigDTO);
        log.info("导出查询DTO为:{}的字段",exportConfigDTO);
        QueryWrapper<StudentInformation> wrapper=new QueryWrapper<>();
        QueryUtils.buildFuzzyQuery(exportConfigDTO.getQueryParams(),wrapper);
        List<StudentInformation> studentInformation=studentInformationMapper.selectList(wrapper);
        log.info(studentInformation.toString());
        ExcelUtils.exportWithDynamicColumns(
                response,
                "学生信息表",
                studentInformation,
                StudentInformation.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }
}
