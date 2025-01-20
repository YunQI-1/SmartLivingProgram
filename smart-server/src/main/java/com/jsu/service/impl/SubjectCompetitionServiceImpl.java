package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.SubjectCompetition;
import com.jsu.mapper.SubjectCompetitionMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.SubjectCompetitionService;
import com.jsu.vo.SubjectCompetitionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectCompetitionServiceImpl extends ServiceImpl<SubjectCompetitionMapper, SubjectCompetition> implements SubjectCompetitionService {

    @Autowired
    private SubjectCompetitionMapper subjectCompetitionMapper;

    @Override
    public PageDTO<SubjectCompetitionVO> getSubjectCompetition(PageQuery pageQuery) {
        Page<SubjectCompetition> page = pageQuery.toMpPage();

        Page<SubjectCompetition> p  = subjectCompetitionMapper.getSubjectCompetition(page);

        return PageDTO.of(p,SubjectCompetitionVO.class);

    }
}
