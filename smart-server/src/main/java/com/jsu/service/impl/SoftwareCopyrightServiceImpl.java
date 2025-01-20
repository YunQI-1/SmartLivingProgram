package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.mapper.SoftwareCopyrightMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.SoftwareCopyrightService;
import com.jsu.vo.SoftwareCopyrightVO;
import org.springframework.stereotype.Service;

@Service
public class SoftwareCopyrightServiceImpl extends ServiceImpl<SoftwareCopyrightMapper, SoftwareCopyright> implements SoftwareCopyrightService{

    @Override
    public PageDTO<SoftwareCopyrightVO> getSoftwareCopyright(PageQuery pageQuery) {
        // 构造查询条件
        Page<SoftwareCopyright> page = pageQuery.toMpPage();

        //分页查询
        Page<SoftwareCopyright> p = lambdaQuery().page(page);

        //返回VO结果回去
        return PageDTO.of(p,SoftwareCopyrightVO.class);
    }
}