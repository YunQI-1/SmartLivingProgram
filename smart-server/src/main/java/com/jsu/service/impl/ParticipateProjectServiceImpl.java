package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ParticipateProject;
import com.jsu.mapper.ParticipateProjectMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.ParticipateProjectService;
import com.jsu.vo.ParticipateProjectVO;
import org.springframework.stereotype.Service;

@Service
public class ParticipateProjectServiceImpl extends ServiceImpl<ParticipateProjectMapper, ParticipateProject> implements ParticipateProjectService {
    @Override
    public PageDTO<ParticipateProjectVO> getParticipateProject(PageQuery pageQuery) {
        Page<ParticipateProject> page = pageQuery.toMpPage();

        Page<ParticipateProject> p = lambdaQuery().page(page);

        return PageDTO.of(p,ParticipateProjectVO.class);
    }
}
