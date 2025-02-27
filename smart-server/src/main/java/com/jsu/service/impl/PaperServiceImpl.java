package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Paper;
import com.jsu.mapper.PaperMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.PaperService;
import com.jsu.utils.ExcelUtils;
import com.jsu.vo.PaperVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class PaperServiceImpl extends ServiceImpl<PaperMapper, Paper> implements PaperService {


    @Autowired
    private PaperMapper paperMapper;

    @Override
    public PageDTO<PaperVO> getPaperInformation(PageQuery pageQuery) {
        Page<Paper> page = pageQuery.toMpPage();

        Page<Paper> p = lambdaQuery().page(page);

        return PageDTO.of(p,PaperVO.class);
    }

    @Override
    public boolean updateByDoi(Paper paper) {
        return paperMapper.updateByDoi(paper);
    }

    @Override
    public void importPaper(MultipartFile file) throws Exception {
        List<Paper> paperList = ExcelUtils.readMultipartFile(file, Paper.class);
        log.info(paperList.toString());
        paperMapper.createPaper(paperList);

    }

    @Override
    public void exportPaper(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<Paper> paperList = paperMapper.getAllPaper();
        ExcelUtils.exportWithDynamicColumns(
                response,
                "论文信息.xlsx",
                paperList,
                Paper.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );

    }

    @Override
    public boolean removeByDoi(String doi) {
        return paperMapper.removeByDoi(doi);
    }
}
