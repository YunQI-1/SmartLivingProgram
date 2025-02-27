package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.entity.Paper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperMapper extends BaseMapper<Paper> {
    boolean updateByDoi(Paper paperList);

    void createPaper(List<Paper> paperList);

    List<Paper> getAllPaper();

    boolean removeByDoi(String doi);
}
