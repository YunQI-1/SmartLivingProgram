package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.ScoreDTO;
import com.jsu.entity.Score;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.vo.ScoreVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ScoreService extends IService<Score> {
    PageDTO<ScoreVO> getAllScore(PageQuery pageQuery);

    void createStudentsGrade(List<ScoreDTO> scoreDTOList);

    void updateStudentsGrade(ScoreDTO scoreDTO);

    void deleteStudentsGrade(List<String> list);

    void importStudentsGrade(MultipartFile file) throws Exception;

    void exportStudentsGrade(HttpServletResponse response, ExportConfigDTO exportConfigDTO);
}
