package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.ProgrammingCapabilitiesDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ProgrammingCapabilities;
import com.jsu.vo.ProgrammingCapabilitiesVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProgrammingCapabilitiesMapper extends BaseMapper<ProgrammingCapabilities> {
    @Select("SELECT * from programming_capabilities where student_number=#{studentNumber}")
    ProgrammingCapabilities getAllByStudentNumber(String studentNumber);



    void createProgrammingCapabilities(ProgrammingCapabilities programmingCapabilities);


    void deleteProgrammingCapabilities(String studentNumber);

    void updateProgrammingCapabilities(ProgrammingCapabilities programmingCapabilities);

    List<ProgrammingCapabilities> getProgrammingCapabilitiesDetail(QueryDTO queryDTO);
    @Select("select * from programming_capabilities")
    List<ProgrammingCapabilitiesVO> getAll();

    void creat(List<ProgrammingCapabilitiesDTO> list);
}
