package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.SoftwareCopyrightDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.mapper.SoftwareCopyrightMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.SoftwareCopyrightService;
import com.jsu.utils.ExcelUtils;
import com.jsu.vo.SoftwareCopyrightVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
@Slf4j
public class SoftwareCopyrightServiceImpl extends ServiceImpl<SoftwareCopyrightMapper, SoftwareCopyright> implements SoftwareCopyrightService{
    @Autowired
    SoftwareCopyrightMapper softwareCopyrightMapper;
    @Override
    public PageDTO<SoftwareCopyrightVO> getSoftwareCopyright(PageQuery pageQuery) {
        // 构造查询条件
        Page<SoftwareCopyright> page = pageQuery.toMpPage();

        //分页查询
        Page<SoftwareCopyright> p = lambdaQuery().page(page);

        //返回VO结果回去
        return PageDTO.of(p,SoftwareCopyrightVO.class);
    }

    @Override
    public void createSoftwareCopyright(List<SoftwareCopyrightDTO> softwareCopyrightDTOList) {
       softwareCopyrightMapper.createSoftwareCopyright(softwareCopyrightDTOList);
    }

    @Override
    public void updateSoftwareCopyright(SoftwareCopyrightDTO softwareCopyrightDTO) {
       softwareCopyrightMapper.updateSoftwareCopyright(softwareCopyrightDTO);
    }

    @Override
    public void deleteSoftwareCopyright(List<SoftwareCopyrightDTO> list) {
        list.forEach(s->softwareCopyrightMapper.deleteSoftwareCopyright(s.getStudentNumber(),s.getRegistrationNumber()));
    }

    @Override
    public void importSoftwareCopyright(MultipartFile file) throws Exception {
        List<SoftwareCopyrightDTO> list= ExcelUtils.readMultipartFile(file,SoftwareCopyrightDTO.class);
        log.info(list.toString());
        softwareCopyrightMapper.createSoftwareCopyright(list);
    }

    @Override
    public void exportSoftwareCopyright(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
         List<SoftwareCopyrightVO> list=softwareCopyrightMapper.getAllSoftwareCopyrights();
         log.info("导出自选字段为：{}的学生软著表",exportConfigDTO);
         ExcelUtils.exportWithDynamicColumns(
          response,
                 "软著表.xlsx",
                 list,
                 SoftwareCopyrightVO.class,
                 exportConfigDTO.getFields(),
                 exportConfigDTO.getColumnNames()
         );
    }
}