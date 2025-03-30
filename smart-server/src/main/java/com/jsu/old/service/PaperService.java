package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.Paper;
import com.jsu.query.PageQuery;
import com.jsu.vo.PaperVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface PaperService extends IService<Paper> {
    PageDTO<PaperVO> getPaperInformation(PageQuery pageQueryQ);

    boolean updateByDoi(Paper paper);

    void importPaper(MultipartFile file) throws Exception;

    void exportPaper(HttpServletResponse response, ExportConfigDTO<Paper> exportConfigDTO);

    boolean removeByDoi(String doi);

    List<Paper> getPaperDetail(QueryDTO queryDTO);
}
