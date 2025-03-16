package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.query.PageQuery;
import com.jsu.vo.StudentAwardVO;
import com.jsu.vo.StudentInformationVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface StudentInformationService extends IService<StudentInformation> {



    PageDTO<StudentInformationVO> getStudentInformation(PageQuery pageQuery);

    List<StudentInformationVO> getStudentInformationDetail(QueryDTO queryDTO);

    void importStudentInformation(MultipartFile file) throws Exception;

    void exportStudentInformation(HttpServletResponse response, ExportConfigDTO exportConfigDTO);
}
