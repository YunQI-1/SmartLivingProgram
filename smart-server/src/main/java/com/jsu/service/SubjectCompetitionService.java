package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.SubjectCompetition;
import com.jsu.query.PageQuery;
import com.jsu.vo.SubjectCompetitionVO;

public interface SubjectCompetitionService extends IService<SubjectCompetition> {
    PageDTO<SubjectCompetitionVO> getSubjectCompetition(PageQuery pageQuery);
}
