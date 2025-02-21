package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.DevelopmentPatent;
import com.jsu.query.PageQuery;
import com.jsu.vo.DevelopmentPatentVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface DevelopmentPatentService extends IService<DevelopmentPatent> {
    PageDTO<DevelopmentPatentVO> getDevelopmentPatent(PageQuery pageQuery);

    boolean updateByPatentNumber(DevelopmentPatent developmentPatent);

    void importDevelopmentPatent(MultipartFile file) throws Exception;

    void exportDevelopmentPatent(HttpServletResponse response, ExportConfigDTO exportConfigDTO);
}
