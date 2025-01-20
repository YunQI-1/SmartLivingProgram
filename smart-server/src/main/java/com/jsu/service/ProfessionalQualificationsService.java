package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ProfessionalQualifications;
import com.jsu.query.PageQuery;
import com.jsu.vo.ProfessionalQualificationsVO;
import org.apache.ibatis.annotations.Mapper;

public interface ProfessionalQualificationsService extends IService<ProfessionalQualifications> {


    PageDTO<ProfessionalQualificationsVO> getProfessionalQualifications(PageQuery pageQuery);
}
