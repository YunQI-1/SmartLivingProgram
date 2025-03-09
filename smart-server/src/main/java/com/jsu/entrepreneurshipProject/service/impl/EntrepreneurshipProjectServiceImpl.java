package com.jsu.entrepreneurshipProject.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entrepreneurshipProject.domain.po.EntrepreneurshipProject;
import com.jsu.entrepreneurshipProject.mapper.EntrepreneurshipProjectMapper;
import com.jsu.entrepreneurshipProject.service.IEntrepreneurshipProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.query.PageQuery;
import com.jsu.utils.ExcelUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@Slf4j
@Service
public class EntrepreneurshipProjectServiceImpl extends ServiceImpl<EntrepreneurshipProjectMapper, EntrepreneurshipProject> implements IEntrepreneurshipProjectService {

    @Autowired
    private EntrepreneurshipProjectMapper entrepreneurshipProjectMapper;

    @Override
    public PageDTO<EntrepreneurshipProject> getEntrepreneurshipProject(PageQuery pageQuery) {
        Page<EntrepreneurshipProject> page = pageQuery.toMpPage();

        Page<EntrepreneurshipProject> p = lambdaQuery().page(page);

        return PageDTO.of(p,EntrepreneurshipProject.class);
    }

    @Override
    public List<EntrepreneurshipProject> getEntrepreneurshipProjectDetail(QueryDTO queryDTO) {
        return entrepreneurshipProjectMapper.getEntrepreneurshipProjectDetail(queryDTO);
    }

    @Override
    public void importEntrepreneurshipProject(MultipartFile file) throws Exception {
        List<EntrepreneurshipProject> list= ExcelUtils.readMultipartFile(file,EntrepreneurshipProject.class);
        log.info(list.toString());
        entrepreneurshipProjectMapper.createEntrepreneurshipProject(list);
    }

    @Override
    public void exportEntrepreneurshipProject(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<EntrepreneurshipProject> list = lambdaQuery().list();

        ExcelUtils.exportWithDynamicColumns(
                response,
                "创业项目.xlsx",
                list,
                EntrepreneurshipProject.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
        log.info("导出成功");
    }
}
