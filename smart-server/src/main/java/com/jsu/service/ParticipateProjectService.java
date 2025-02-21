package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ParticipateProject;
import com.jsu.query.PageQuery;
import com.jsu.vo.ParticipateProjectVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface ParticipateProjectService extends IService<ParticipateProject> {
    PageDTO<ParticipateProjectVO> getParticipateProject(PageQuery pageQuery);

    void updateByStudentNumberAndProjectName(ParticipateProject participateProject);

    void importParticipateProject(MultipartFile file) throws Exception;

    void exportParticipateProject(HttpServletResponse response, ExportConfigDTO exportConfigDTO);
}
