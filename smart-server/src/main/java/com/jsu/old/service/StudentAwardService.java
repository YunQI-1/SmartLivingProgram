package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.StudentAwardDTO;
import com.jsu.entity.StudentAward;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.vo.StudentAwardVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface StudentAwardService extends IService<StudentAward> {


    PageDTO<StudentAwardVO> getStudentAward(PageQuery pageQuery);

    void createStudentAward(List<StudentAwardDTO> list);

    void updateStudentAward(StudentAwardDTO studentAwardDTO);

    void deleteStudentAward(List<StudentAwardDTO> list);

    void importStudentAward(MultipartFile file) throws Exception;

    void exportStudentAward(HttpServletResponse response, ExportConfigDTO<StudentAwardDTO> exportConfigDTO);

    List<StudentAwardVO> getStudentAwardDetail(QueryDTO queryDTO);
}
