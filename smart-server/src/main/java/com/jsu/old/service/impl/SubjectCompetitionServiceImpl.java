package com.jsu.old.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.SubjectCompetitionDTO;
import com.jsu.entity.SubjectCompetition;
import com.jsu.old.mapper.SubjectCompetitionMapper;
import com.jsu.old.service.SubjectCompetitionService;
import com.jsu.query.PageQuery;
import com.jsu.utils.ExcelUtils;
import com.jsu.utils.QueryUtils;
import com.jsu.vo.SubjectCompetitionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
@Slf4j
public class SubjectCompetitionServiceImpl extends ServiceImpl<SubjectCompetitionMapper, SubjectCompetition> implements SubjectCompetitionService {

    @Autowired
    private SubjectCompetitionMapper subjectCompetitionMapper;

    @Override
    public PageDTO<SubjectCompetitionVO> getSubjectCompetition(PageQuery pageQuery) {
        Page<SubjectCompetition> page = pageQuery.toMpPage();

        Page<SubjectCompetition> p  = subjectCompetitionMapper.getSubjectCompetition(page);

        return PageDTO.of(p,SubjectCompetitionVO.class);

    }

    @Override
    public void createSubjectCompetition(List<SubjectCompetitionDTO> list) {
        subjectCompetitionMapper.createSubjectCompetition(list);
    }

    @Override
    public void updateSubjectCompetition(SubjectCompetitionDTO subjectCompetitionDTO) {
       log.info("修改的数据为：{}",subjectCompetitionDTO);
       subjectCompetitionMapper.updateSubjectCompetition(subjectCompetitionDTO);
    }

    @Override
    public void deleteSubjectCompetition(List<SubjectCompetitionDTO> list) {
       list.forEach(s->subjectCompetitionMapper.deleteSubjectCompetition(s.getStudentNumber(),s.getCertificateNumber()));
    }

    @Override
    public void importSubjectCompetition(MultipartFile file) throws Exception {
       List<SubjectCompetitionDTO> list= ExcelUtils.readMultipartFile(file,SubjectCompetitionDTO.class);
       subjectCompetitionMapper.createSubjectCompetition(list);
    }

    @Override
    public void exportSubjectCompetition(HttpServletResponse response, ExportConfigDTO<SubjectCompetitionDTO> exportConfigDTO) {
        QueryWrapper<SubjectCompetition> wrapper=new QueryWrapper<>();
        QueryUtils.buildFuzzyQuery(exportConfigDTO.getQueryParams(),wrapper);
        List<SubjectCompetition> list=subjectCompetitionMapper.selectList(wrapper);
        ExcelUtils.exportWithDynamicColumns(
                response,
                "学科竞赛表.xlsx",
                list,
                SubjectCompetition.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }

    @Override
    public List<SubjectCompetition> getSubjectCompetitionDetail(QueryDTO queryDTO) {
        return subjectCompetitionMapper.getSubjectCompetitionDetail(queryDTO);
    }
}
