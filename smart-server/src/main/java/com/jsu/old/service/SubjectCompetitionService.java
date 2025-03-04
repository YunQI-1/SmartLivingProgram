package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.SubjectCompetitionDTO;
import com.jsu.entity.SubjectCompetition;
import com.jsu.query.PageQuery;
import com.jsu.vo.SubjectCompetitionVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface SubjectCompetitionService extends IService<SubjectCompetition> {
    PageDTO<SubjectCompetitionVO> getSubjectCompetition(PageQuery pageQuery);

    void createSubjectCompetition(List<SubjectCompetitionDTO> list);

    void updateSubjectCompetition(SubjectCompetitionDTO subjectCompetitionDTO);

    void deleteSubjectCompetition(List<SubjectCompetitionDTO> list);

    void importSubjectCompetition(MultipartFile file) throws Exception;

    void exportSubjectCompetition(HttpServletResponse response, ExportConfigDTO exportConfigDTO);

    List<SubjectCompetition> getSubjectCompetitionDetail(QueryDTO queryDTO);
}
