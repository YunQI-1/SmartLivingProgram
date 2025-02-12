package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.SoftwareCopyrightDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.vo.SoftwareCopyrightVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SoftwareCopyrightMapper extends BaseMapper<SoftwareCopyright> {
    @Select("SELECT * from software_copyright")
    List<SoftwareCopyrightVO> getAllSoftwareCopyrights();

    void createSoftwareCopyright(List<SoftwareCopyrightDTO> list);

    void updateSoftwareCopyright(SoftwareCopyrightDTO softwareCopyrightDTO);
    @Delete("delete from software_copyright where student_number=#{studentNumber} and registration_number=#{registrationNumber}")
    void deleteSoftwareCopyright(String studentNumber,String registrationNumber);


}
