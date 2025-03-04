package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ProfessionalQualifications;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfessionalQualificationsMapper extends BaseMapper<ProfessionalQualifications> {

    void updateByCertificateNumber(ProfessionalQualifications professionalQualifications);

    void createProfessionalQualifications(List<ProfessionalQualifications> professionalQualificationsList);

    List<ProfessionalQualifications> getAllProfessionalQualifications();

    List<ProfessionalQualifications> getProfessionalQualificationsDetail(QueryDTO queryDTO);
}
