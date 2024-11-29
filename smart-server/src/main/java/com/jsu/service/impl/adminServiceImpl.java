package com.jsu.service.impl;

import com.jsu.mapper.StudentMapper;
import com.jsu.result.PageResult;
import com.jsu.service.adminService;
import com.jsu.vo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class adminServiceImpl implements adminService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public PageResult getStudentInformation() {
        List<StudentVO> list=studentMapper.getStudentInformation();
        Long total=studentMapper.getStudentInformationCount();
        return new PageResult(total, list);
    }
}
