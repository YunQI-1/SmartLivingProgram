package com.jsu.old.service;

import com.jsu.dto.StudentDTO;
import com.jsu.dto.StudentInformationDTO;
import com.jsu.result.PageResult;

public interface AdminService {

    /**
     *
     *  新增功能接口
     *
     */

    void createStudentInformation(StudentInformationDTO studentDTO);



    /**
     *
     *  修改功能接口
     *
     */

    void updateStudentInformation(StudentInformationDTO studentDTO);


    /**
     *
     *  删除功能接口
     *
     */
    void deleteStudentInformation(String studentNumber);
}
