package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jsu.dto.SubjectCompetitionDTO;
import com.jsu.entity.SubjectCompetition;
import com.jsu.vo.SubjectCompetitionVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SubjectCompetitionMapper extends BaseMapper<SubjectCompetition> {


    @Select("select * from subject_competition")
    Page<SubjectCompetition> getSubjectCompetition(Page<SubjectCompetition> page);
    @Select("SELECT * from subject_competition")
    List<SubjectCompetitionVO> getAllSubjectCompetitionVO();

    void createSubjectCompetition(List<SubjectCompetitionDTO> list);

    void updateSubjectCompetition(SubjectCompetitionDTO subjectCompetitionDTO);

    @Delete("delete from subject_competition where student_number=#{studentNumber} and certificate_number=#{certificateNumber} ")
    void deleteSubjectCompetition(String studentNumber,String certificateNumber);
}
