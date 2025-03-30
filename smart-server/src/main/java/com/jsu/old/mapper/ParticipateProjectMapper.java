package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ParticipateProject;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Mapper
public interface ParticipateProjectMapper extends BaseMapper<ParticipateProject> {
    void updateByStudentNumberAndProjectName(ParticipateProject participateProject);

    void createParticipateProject(List<ParticipateProject> participateProjects);


    List<ParticipateProject> getAllParticipateProject();

    List<ParticipateProject> getParticipateProjectDetail(QueryDTO queryDTO);
}
