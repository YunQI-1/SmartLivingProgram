package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ProfessionalQualifications;
import com.jsu.query.PageQuery;
import com.jsu.vo.ProfessionalQualificationsVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface ProfessionalQualificationsService extends IService<ProfessionalQualifications> {


    PageDTO<ProfessionalQualificationsVO> getProfessionalQualifications(PageQuery pageQuery);

    void updateByCertificateNumber(ProfessionalQualifications professionalQualifications);

    void importProfessionalQualifications(MultipartFile file) throws Exception;

    void exportProfessionalQualifications(HttpServletResponse response, ExportConfigDTO exportConfigDTO);
}
