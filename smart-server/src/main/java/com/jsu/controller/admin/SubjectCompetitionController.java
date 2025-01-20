package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.SubjectCompetitionService;
import com.jsu.vo.SubjectCompetitionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@RestController
@CrossOrigin(origins =  "*")
@Slf4j
public class SubjectCompetitionController {

    @Autowired
    private SubjectCompetitionService subjectCompetitionService;
    /**
     * 查询所有学生的学科竞赛
     * @return
     */
    @GetMapping("/getAcademicPerformance/getSubjectCompetition")
    public Result<PageDTO<SubjectCompetitionVO>> getSubjectCompetition(PageQuery pageQuery){
        log.info("管理端查询所有学生的学科竞赛");
        return Result.success(subjectCompetitionService.getSubjectCompetition(pageQuery));
    }
}
