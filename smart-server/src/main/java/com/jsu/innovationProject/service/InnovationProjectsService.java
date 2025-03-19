package com.jsu.innovationProject.service;

import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.innovationProject.domain.po.InnovationProjects;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.query.PageQuery;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 创新项目 服务类
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
public interface InnovationProjectsService extends IService<InnovationProjects> {

    PageDTO<InnovationProjects> getInnovationProjects(PageQuery pageQuery);

    List<InnovationProjects> getInnovationProjectsDetail(QueryDTO queryDTO);

    void importInnovationProject(MultipartFile file) throws Exception;

    void exportInnovationProject(HttpServletResponse response, ExportConfigDTO<InnovationProjects> exportConfigDTO);
}
