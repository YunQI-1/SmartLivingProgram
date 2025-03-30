package com.jsu.innovationProject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.innovationProject.domain.po.InnovationProjects;
import com.jsu.innovationProject.mapper.InnovationProjectsMapper;
import com.jsu.innovationProject.service.InnovationProjectsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.query.PageQuery;
import com.jsu.utils.ExcelUtils;
import com.jsu.utils.QueryUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 创新项目 服务实现类
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@Slf4j
@Service
public class InnovationProjectsServiceImpl extends ServiceImpl<InnovationProjectsMapper, InnovationProjects> implements InnovationProjectsService {

    @Autowired
    private InnovationProjectsMapper innovationProjectsMapper;

    @Override
    public PageDTO<InnovationProjects> getInnovationProjects(PageQuery pageQuery) {
        //构建分页查询条件
        Page<InnovationProjects> page = pageQuery.toMpPage();

        //分页查询
        Page<InnovationProjects>  p = lambdaQuery().page(page);

        return PageDTO.of(p,InnovationProjects.class);
    }

    @Override
    public List<InnovationProjects> getInnovationProjectsDetail(QueryDTO queryDTO) {
        return innovationProjectsMapper.getInnovationProjectsDetail(queryDTO);

    }

    @Override
    public void importInnovationProject(MultipartFile file) throws Exception {
        List<InnovationProjects> list= ExcelUtils.readMultipartFile(file,InnovationProjects.class);
        log.info(list.toString());
        innovationProjectsMapper.createInnovationProject(list);
    }

    @Override
    public void exportInnovationProject(HttpServletResponse response, ExportConfigDTO<InnovationProjects> exportConfigDTO) {
        QueryWrapper<InnovationProjects> wrapper=new QueryWrapper<>();
        QueryUtils.buildFuzzyQuery(exportConfigDTO.getQueryParams(),wrapper);
        List<InnovationProjects> list=innovationProjectsMapper.selectList(wrapper);
        ExcelUtils.exportWithDynamicColumns(
                response,
                "创新项目.xlsx",
                list,
                InnovationProjects.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }


}
