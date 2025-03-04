package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.old.mapper.StudentInformationMapper;
import com.jsu.old.service.StudentInformationService;
import com.jsu.query.PageQuery;

import com.jsu.vo.StudentInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return studentInformationMapper.getStudentInformationDetail(queryDTO);
    }
}
