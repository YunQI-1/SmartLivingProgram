package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.entity.ProgrammingCapabilities;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProgrammingCapabilitiesMapper extends BaseMapper<ProgrammingCapabilities> {
    @Select("SELECT * from programming_capabilities where student_number=#{studentNumber}")
    ProgrammingCapabilities getAllByStudentNumber(String studentNumber);



    void createProgrammingCapabilities(ProgrammingCapabilities programmingCapabilities);


    void deleteProgrammingCapabilities(String studentNumber);

    void updateProgrammingCapabilities(ProgrammingCapabilities programmingCapabilities);
}
