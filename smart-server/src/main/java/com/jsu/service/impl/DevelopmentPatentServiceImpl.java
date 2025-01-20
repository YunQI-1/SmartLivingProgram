package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.DevelopmentPatent;
import com.jsu.mapper.DevelopmentMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.DevelopmentPatentService;
import com.jsu.vo.DevelopmentPatentVO;
import org.springframework.stereotype.Service;

@Service
public class DevelopmentPatentServiceImpl extends ServiceImpl<DevelopmentMapper, DevelopmentPatent> implements DevelopmentPatentService {
    @Override
    public PageDTO<DevelopmentPatentVO> getDevelopmentPatent(PageQuery pageQuery) {
        Page<DevelopmentPatent> page = pageQuery.toMpPage();

        Page<DevelopmentPatent> p = lambdaQuery().page(page);

        return PageDTO.of(p,DevelopmentPatentVO.class);
    }
}
