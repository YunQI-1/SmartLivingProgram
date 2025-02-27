package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ProfessionalQualifications;
import com.jsu.entity.Score;
import com.jsu.mapper.ProfessionalQualificationsMapper;
import com.jsu.mapper.ScoreMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.ProfessionalQualificationsService;
import com.jsu.service.ScoreService;
import com.jsu.utils.ExcelUtils;
import com.jsu.vo.ProfessionalQualificationsVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class ProfessionalQualificationsServiceImpl extends ServiceImpl<ProfessionalQualificationsMapper, ProfessionalQualifications> implements ProfessionalQualificationsService {

    @Autowired
    private ProfessionalQualificationsMapper professionalQualificationsMapper;


    @Override
    public PageDTO<ProfessionalQualificationsVO> getProfessionalQualifications(PageQuery pageQuery) {
        //构建分页查询条件
        Page<ProfessionalQualifications> page =pageQuery.toMpPage();

        //分页查询
        Page<ProfessionalQualifications> p =lambdaQuery().page(page);

        //封装VO结果返回
        return PageDTO.of(p,ProfessionalQualificationsVO.class);
    }

    @Override
    public void updateByCertificateNumber(ProfessionalQualifications professionalQualifications) {
        professionalQualificationsMapper.updateByCertificateNumber(professionalQualifications);
    }

    @Override
    public void importProfessionalQualifications(MultipartFile file) throws Exception {
        List<ProfessionalQualifications> professionalQualificationsList = ExcelUtils.readMultipartFile(file, ProfessionalQualifications.class);
        professionalQualificationsMapper.createProfessionalQualifications(professionalQualificationsList);
    }

    @Override
    public void exportProfessionalQualifications(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<ProfessionalQualifications> professionalQualifications = professionalQualificationsMapper.getAllProfessionalQualifications();
        log.info(professionalQualifications.toString());
        ExcelUtils.exportWithDynamicColumns(
                response,
                "专业资质信息表.xlsx",
                professionalQualifications,
                ProfessionalQualifications.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }
}