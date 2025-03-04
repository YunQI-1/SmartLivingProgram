package com.jsu.innovationProject.mapper;

import com.jsu.dto.QueryDTO;
import com.jsu.innovationProject.domain.po.InnovationProjects;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 创新项目 Mapper 接口
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@Mapper
public interface InnovationProjectsMapper extends BaseMapper<InnovationProjects> {

    List<InnovationProjects> getInnovationProjectsDetail(QueryDTO queryDTO);

    void createInnovationProject(@Param("list") List<InnovationProjects> list);
}
