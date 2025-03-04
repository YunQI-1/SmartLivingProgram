package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.EnglishLevel;
import com.jsu.old.mapper.EnglishLevelMapper;
import com.jsu.old.service.EnglishLevelService;
import com.jsu.query.PageQuery;

import com.jsu.utils.ExcelUtils;
import com.jsu.vo.EnglishLevelVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Service
public class EnglishLevelServiceImpl extends ServiceImpl<EnglishLevelMapper, EnglishLevel> implements EnglishLevelService {



    @Autowired
    private EnglishLevelMapper englishLevelMapper;


    @Override
    public PageDTO<EnglishLevelVO> getEnglishLevel(PageQuery pageQuery) {
        //构建分页条件
        Page<EnglishLevel> page =pageQuery.toMpPage();

        //分页查询
        Page<EnglishLevel> p = lambdaQuery().page(page);

        //封装结果返回
        return PageDTO.of(p,EnglishLevelVO.class);
    }

    @Override
    public boolean updateByCertificateNumber(EnglishLevel englishLevel) {
        return englishLevelMapper.updateByCertificateNumber(englishLevel);
    }

    @Override
    public void importEnglishLevel(MultipartFile file) throws Exception {
        List<EnglishLevel> englishLevelList = ExcelUtils.readMultipartFile(file, EnglishLevel.class);
        log.info(englishLevelList.toString()+"123123");
        englishLevelMapper.createEnglishLevel(englishLevelList);

    }

    @Override
    public void exportEnglishLevel(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<EnglishLevel> englishLevelList = englishLevelMapper.getAllEnglishLevel();
        ExcelUtils.exportWithDynamicColumns(
                response,
                "英语水平等级.xlsx",
                englishLevelList,
                EnglishLevel.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }

    @Override
    public boolean removeByCertificateNumber(String certificateNumber) {
        return englishLevelMapper.removeByCertificateNumber(certificateNumber);
    }

    @Override
    public List<EnglishLevel> getEnglishLevelDetail(QueryDTO queryDTO) {
        return englishLevelMapper.getEnglishLevelDetail(queryDTO);
    }
}
