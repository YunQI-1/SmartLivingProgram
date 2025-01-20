package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ProgrammingCapabilities;
import com.jsu.mapper.ProgrammingCapabilitiesMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.ProgrammingCapabilitiesService;
import com.jsu.vo.ProgrammingCapabilitiesVO;
import org.springframework.stereotype.Service;

@Service
public class ProgrammingCapabilitiesServiceImpl extends ServiceImpl<ProgrammingCapabilitiesMapper, ProgrammingCapabilities> implements ProgrammingCapabilitiesService {

    @Override
    public PageDTO<ProgrammingCapabilitiesVO> getProgrammingCapabilities(PageQuery pageQuery) {
        //构造查询条件
        Page<ProgrammingCapabilities> page = pageQuery.toMpPage();
        //分页查询
        Page<ProgrammingCapabilities> p = lambdaQuery().page(page);

        //返回VO数据
        return PageDTO.of(p,ProgrammingCapabilitiesVO.class);
    }
}
