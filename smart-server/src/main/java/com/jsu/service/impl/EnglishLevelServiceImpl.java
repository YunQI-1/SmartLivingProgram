package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.EnglishLevel;
import com.jsu.mapper.EnglishLevelMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.EnglishLevelService;
import com.jsu.vo.EnglishLevelVO;
import org.springframework.stereotype.Service;

@Service
public class EnglishLevelServiceImpl extends ServiceImpl<EnglishLevelMapper, EnglishLevel> implements EnglishLevelService {


    @Override
    public PageDTO<EnglishLevelVO> getEnglishLevel(PageQuery pageQuery) {
        //构建分页条件
        Page<EnglishLevel> page =pageQuery.toMpPage();

        //分页查询
        Page<EnglishLevel> p = lambdaQuery().page(page);

        //封装结果返回
        return PageDTO.of(p,EnglishLevelVO.class);
    }
}
