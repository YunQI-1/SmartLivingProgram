package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.DevelopmentPatent;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DevelopmentMapper extends BaseMapper<DevelopmentPatent> {
    boolean updateByPatentNumber(DevelopmentPatent developmentPatent);

    void createDevelopmentPatent(List<DevelopmentPatent> developmentPatents);

    List<DevelopmentPatent> getAllDevelopmentPatent();

    @Delete("delete from development_patent where patent_number=#{patentNumber}")
    void deleteByPatentNumber(String patentNumber);


    List<DevelopmentPatent> getDevelopmentPatentDetail(QueryDTO queryDTO);
}
