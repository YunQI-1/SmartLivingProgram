package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.query.PageQuery;
import com.jsu.vo.StudentAwardVO;
import com.jsu.vo.StudentInformationVO;

import java.util.List;


public interface StudentInformationService extends IService<StudentInformation> {



    PageDTO<StudentInformationVO> getStudentInformation(PageQuery pageQuery);

    List<StudentInformationVO> getStudentInformationDetail(QueryDTO queryDTO);
}
