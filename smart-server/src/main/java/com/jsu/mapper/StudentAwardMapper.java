package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.StudentAwardDTO;
import com.jsu.entity.StudentAward;
import com.jsu.vo.StudentAwardVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentAwardMapper extends BaseMapper<StudentAward> {
    @Select("SELECT * from student_award")
    List<StudentAwardVO> getAllStudentAward();
    void createStudentAward(List<StudentAwardDTO> list);

    void updateStudentAward(StudentAwardDTO studentAwardDTO);

    @Delete("DELETE from student_award where student_number=#{studentNumber} and certificate_number=#{certificateNumber}")
    void deleteStudentAward(String studentNumber,String certificateNumber);

}
