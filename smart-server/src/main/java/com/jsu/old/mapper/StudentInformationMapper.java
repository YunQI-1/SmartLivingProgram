package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.vo.StudentInformationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentInformationMapper extends BaseMapper<StudentInformation> {

    List<StudentInformationVO> getStudentInformationDetail(QueryDTO queryDTO);
}
