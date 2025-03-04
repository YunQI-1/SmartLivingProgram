package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ParticipateProject;
import com.jsu.old.mapper.ParticipateProjectMapper;
import com.jsu.old.service.ParticipateProjectService;
import com.jsu.query.PageQuery;

import com.jsu.utils.ExcelUtils;
import com.jsu.vo.ParticipateProjectVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class ParticipateProjectServiceImpl extends ServiceImpl<ParticipateProjectMapper, ParticipateProject> implements ParticipateProjectService {


    @Autowired
    private ParticipateProjectMapper participateProjectMapper;


    @Override
    public PageDTO<ParticipateProjectVO> getParticipateProject(PageQuery pageQuery) {
        Page<ParticipateProject> page = pageQuery.toMpPage();

        Page<ParticipateProject> p = lambdaQuery().page(page);

        return PageDTO.of(p,ParticipateProjectVO.class);
    }

    @Override
    public void updateByStudentNumberAndProjectName(ParticipateProject participateProject) {
        participateProjectMapper.updateByStudentNumberAndProjectName(participateProject);
    }

    @Override
    public void importParticipateProject(MultipartFile file) throws Exception {
        List<ParticipateProject> participateProjects = ExcelUtils.readMultipartFile(file, ParticipateProject.class);
        log.info(participateProjects.toString());
        participateProjectMapper.createParticipateProject(participateProjects);
    }

    @Override
    public void exportParticipateProject(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<ParticipateProject> participateProjects = participateProjectMapper.getAllParticipateProject();
        ExcelUtils.exportWithDynamicColumns(
                response,
                "参与项目表.xlsx",
                participateProjects,
                ParticipateProject.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }

    @Override
    public List<ParticipateProject> getParticipateProjectDetail(QueryDTO queryDTO) {
        return participateProjectMapper.getParticipateProjectDetail(queryDTO);
    }
}
