package com.jsu.entrepreneurshipProject.mapper;

import com.jsu.dto.QueryDTO;
import com.jsu.entrepreneurshipProject.domain.po.EntrepreneurshipProject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@Mapper
public interface EntrepreneurshipProjectMapper extends BaseMapper<EntrepreneurshipProject> {

    List<EntrepreneurshipProject> getEntrepreneurshipProjectDetail(QueryDTO queryDTO);

    void createEntrepreneurshipProject(@Param("list") List<EntrepreneurshipProject> list);
}
