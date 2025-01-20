package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.ParticipateProject;
import com.jsu.query.PageQuery;
import com.jsu.vo.ParticipateProjectVO;

public interface ParticipateProjectService extends IService<ParticipateProject> {
    PageDTO<ParticipateProjectVO> getParticipateProject(PageQuery pageQuery);
}
