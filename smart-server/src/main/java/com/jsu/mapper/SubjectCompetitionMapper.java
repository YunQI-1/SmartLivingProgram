package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jsu.entity.SubjectCompetition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;

@Mapper
public interface SubjectCompetitionMapper extends BaseMapper<SubjectCompetition> {


    @Select("select * from subject_competition")
    Page<SubjectCompetition> getSubjectCompetition(Page<SubjectCompetition> page);
}
