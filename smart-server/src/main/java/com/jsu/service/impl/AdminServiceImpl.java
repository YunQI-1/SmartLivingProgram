package com.jsu.service.impl;

import com.jsu.dto.StudentDTO;
import com.jsu.entity.*;
import com.jsu.exception.BaseException;
import com.jsu.mapper.StudentMapper;
import com.jsu.result.PageResult;

import com.jsu.service.AdminService;
import com.jsu.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService {
    @Autowired
    StudentMapper studentMapper;

    /**

    /**
     *
     * 新增学生信息
     * @param studentDTO
     */

    @Override
    @Transactional
    public void createStudentInformation(StudentDTO studentDTO) {
        log.info("新增学生信息：{}",studentDTO);
         StudentInformationVO studentVO=studentMapper.getStudentInformationByStudentNumber(studentDTO.getStudentNumber());
         if(studentVO!=null){
             throw new BaseException("该学号学生已存在!");
         }
         StudentInformation student = new StudentInformation();
         BeanUtils.copyProperties(studentDTO,student);
         studentMapper.createStudentInformation(student);
    }



    @Override
    @Transactional
    public void updateStudentInformation(StudentDTO studentDTO) {
        log.info("修改学生信息:{}",studentDTO);
        StudentInformationVO studentVO=studentMapper.getStudentInformationByStudentNumber(studentDTO.getStudentNumber());
        if(studentVO==null){
            throw new BaseException("该学号学生不存在!");
        }
        StudentInformation student = new StudentInformation();
        BeanUtils.copyProperties(studentDTO,student);
        studentMapper.updateStudentInformation(student);
    }

    @Override
    public void deleteStudentInformation(String studentNumber) {
        log.info("删除学号为：{}的学生信息",studentNumber);
        StudentInformationVO studentVO=studentMapper.getStudentInformationByStudentNumber(studentNumber);
        if(studentVO==null){
            throw new BaseException("不存在该学号学生！");
        }
        //考虑到之后的多表的关联，之后需要完善多表之间的关联性删除
        studentMapper.deleteStudentInformation(studentNumber);
    }
}
