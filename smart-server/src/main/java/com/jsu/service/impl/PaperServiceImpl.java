package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Paper;
import com.jsu.mapper.PaperMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.PaperService;
import com.jsu.vo.PaperVO;
import org.springframework.stereotype.Service;

@Service
public class PaperServiceImpl extends ServiceImpl<PaperMapper, Paper> implements PaperService {


    @Override
    public PageDTO<PaperVO> getPaperInformation(PageQuery pageQuery) {
        Page<Paper> page = pageQuery.toMpPage();

        Page<Paper> p = lambdaQuery().page(page);

        return PageDTO.of(p,PaperVO.class);
    }
}
