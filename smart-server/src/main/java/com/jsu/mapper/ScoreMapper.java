package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jsu.entity.Score;
import com.jsu.query.PageQuery;
import com.jsu.vo.ScoreVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}
