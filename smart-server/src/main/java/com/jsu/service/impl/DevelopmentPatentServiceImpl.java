package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.DevelopmentPatent;
import com.jsu.mapper.DevelopmentMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.DevelopmentPatentService;
import com.jsu.utils.ExcelUtils;
import com.jsu.vo.DevelopmentPatentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class DevelopmentPatentServiceImpl extends ServiceImpl<DevelopmentMapper, DevelopmentPatent> implements DevelopmentPatentService {

    @Autowired
    private DevelopmentMapper developmentMapper;

    @Override
    public PageDTO<DevelopmentPatentVO> getDevelopmentPatent(PageQuery pageQuery) {
        Page<DevelopmentPatent> page = pageQuery.toMpPage();

        Page<DevelopmentPatent> p = lambdaQuery().page(page);

        return PageDTO.of(p,DevelopmentPatentVO.class);
    }

    @Override
    public boolean updateByPatentNumber(DevelopmentPatent developmentPatent) {
        return developmentMapper.updateByPatentNumber(developmentPatent);
    }

    @Override
    public void importDevelopmentPatent(MultipartFile file) throws Exception {
        List<DevelopmentPatent> developmentPatents = ExcelUtils.readMultipartFile(file, DevelopmentPatent.class);
        log.info(developmentPatents.toString());
        developmentMapper.createDevelopmentPatent(developmentPatents);

    }

    @Override
    public void exportDevelopmentPatent(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<DevelopmentPatent> developmentPatents = developmentMapper.getAllDevelopmentPatent();
        ExcelUtils.exportWithDynamicColumns(
                response,
                "专利表",
                developmentPatents,
                DevelopmentPatent.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }
}
