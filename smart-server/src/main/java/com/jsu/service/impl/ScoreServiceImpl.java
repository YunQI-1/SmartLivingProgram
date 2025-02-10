package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.ScoreDTO;
import com.jsu.entity.Score;
import com.jsu.mapper.ScoreMapper;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.service.ScoreService;
import com.jsu.utils.ExcelUtils;
import com.jsu.vo.ScoreVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
@Slf4j
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {


    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public PageDTO<ScoreVO> getAllScore(PageQuery pageQuery) {
        //构建分页查询条件
        Page<Score> page = pageQuery.toMpPage();

        // ✅ 传入 Page 对象，而不是 pageNo 和 pageSize
        Page<Score> p = scoreMapper.getAllScore(page);


        //封装结果返回
        return PageDTO.of(p, ScoreVO.class);
    }

    @Override
    public void createStudentsGrade(List<ScoreDTO> scoreDTOList) {
        scoreMapper.createStudentsGrade(scoreDTOList);
    }

    @Override
    public void updateStudentsGrade(ScoreDTO scoreDTO) {
        scoreMapper.updateStudentsGrade(scoreDTO);
    }

    @Override
    public void deleteStudentsGrade(List<String> list) {
        list.forEach(s->scoreMapper.deleteStudentsGrade(s));
    }

    @Override
    public void importStudentsGrade(MultipartFile file) throws Exception {
        List<ScoreDTO> scoreList = ExcelUtils.readMultipartFile(file, ScoreDTO.class);
        log.info(scoreList.toString());
        scoreMapper.createStudentsGrade(scoreList);
    }

    @Override
    public void exportStudentsGrade(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<ScoreVO> scoreVOList=scoreMapper.getAllScores();
        log.info("导出自选字段为：{}的学生成绩表",exportConfigDTO);
        ExcelUtils.exportWithDynamicColumns(
                response,
                "成绩表",
                scoreVOList,
                ScoreVO.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }
}
