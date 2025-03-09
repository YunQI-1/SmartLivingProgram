package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.ScoreDTO;
import com.jsu.entity.Score;
import com.jsu.query.PageQuery;
import com.jsu.vo.ScoreVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {

    @Select("        select score.* ,\n" +
            "               student_information.major,grade,classes,\n" +
            "               course.course_name,course_module,study_method\n" +
            "        from score\n" +
            "        left join course on\n" +
            "        score.course_number=course.course_number\n" +
            "        left join student_information on\n" +
            "        score.student_number=student_information.student_number")
    Page<Score> getAllScore(Page<Score> page);

    void createStudentsGrade(@Param("list") List<ScoreDTO> scoreList);

    void updateStudentsGrade(ScoreDTO scoreDTO);

    @Delete("DELETE from score where student_number=#{studentNumber} and course_number=#{courseNumber}")
    void deleteStudentsGrade(String studentNumber,String courseNumber);
    @Select("select * from score")
    List<ScoreVO> getAllScores();

    List<Score> getStudentsGradeDetail(QueryDTO queryDTO);
}
