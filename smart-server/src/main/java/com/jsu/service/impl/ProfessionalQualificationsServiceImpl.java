package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ProfessionalQualifications;
import com.jsu.entity.Score;
import com.jsu.mapper.ProfessionalQualificationsMapper;
import com.jsu.mapper.ScoreMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.ProfessionalQualificationsService;
import com.jsu.service.ScoreService;
import com.jsu.vo.ProfessionalQualificationsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}