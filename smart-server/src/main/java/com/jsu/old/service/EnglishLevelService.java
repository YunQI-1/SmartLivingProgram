package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.EnglishLevel;
import com.jsu.query.PageQuery;
import com.jsu.vo.EnglishLevelVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface EnglishLevelService extends IService<EnglishLevel> {

    PageDTO<EnglishLevelVO> getEnglishLevel(PageQuery pageQuery);

    boolean updateByCertificateNumber(EnglishLevel englishLevel);

    void importEnglishLevel(MultipartFile file) throws Exception;

    void exportEnglishLevel(HttpServletResponse response, ExportConfigDTO<EnglishLevel> exportConfigDTO);

    boolean removeByCertificateNumber(String certificateNumber);

    List<EnglishLevel> getEnglishLevelDetail(QueryDTO queryDTO);
}
