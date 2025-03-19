package com.jsu.entrepreneurshipProject.service;

import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entrepreneurshipProject.domain.po.EntrepreneurshipProject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.query.PageQuery;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
public interface EntrepreneurshipProjectService extends IService<EntrepreneurshipProject> {

    PageDTO<EntrepreneurshipProject> getEntrepreneurshipProject(PageQuery pageQuery);

    List<EntrepreneurshipProject> getEntrepreneurshipProjectDetail(QueryDTO queryDTO);

    void importEntrepreneurshipProject(MultipartFile file) throws Exception;

    void exportEntrepreneurshipProject(HttpServletResponse response, ExportConfigDTO<EntrepreneurshipProject> exportConfigDTO);
}
