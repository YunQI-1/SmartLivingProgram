package com.jsu.old.controller;

import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.SubjectCompetitionDTO;
import com.jsu.old.service.SubjectCompetitionService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.vo.SubjectCompetitionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/admin/getAcademicPerformance")
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
    @GetMapping("/getSubjectCompetition")
    public Result<PageDTO<SubjectCompetitionVO>> getSubjectCompetition(PageQuery pageQuery){
        log.info("管理端查询所有学生的学科竞赛");
        return Result.success(subjectCompetitionService.getSubjectCompetition(pageQuery));
    }

    /**
     * 查询学科竞赛详细数据
     * @return
     */
    @PostMapping("/getSubjectCompetitionDetail")
    public Result getSubjectCompetitionDetail(@RequestBody QueryDTO queryDTO){
        log.info("查询学科详细数据");
        return Result.success(subjectCompetitionService.getSubjectCompetitionDetail(queryDTO));
    }
    /**
     * 新增学科竞赛信息
     * @param list
     * @return
     */
    @PostMapping("/createSubjectCompetition")
    public Result createSubjectCompetition(@RequestBody List<SubjectCompetitionDTO> list){
        subjectCompetitionService.createSubjectCompetition(list);
        return Result.success();
    }

    /**
     * 更新学科竞赛信息
     * @param subjectCompetitionDTO
     * @return
     */
    @PutMapping("/updateSubjectCompetition")
    public Result updateSubjectCompetition(@RequestBody SubjectCompetitionDTO subjectCompetitionDTO){
        subjectCompetitionService.updateSubjectCompetition(subjectCompetitionDTO);
        return Result.success();
    }

    /**
     * 删除学科竞赛信息
     * @param list
     * @return
     */
    @DeleteMapping("/deleteSubjectCompetition")
    public Result deleteSubjectCompetition(@RequestBody List<SubjectCompetitionDTO> list){
        subjectCompetitionService.deleteSubjectCompetition(list);
        return Result.success();
    }

    /**
     * 导入学科竞赛信息
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/importSubjectCompetition")
    public Result importSubjectCompetition(@RequestParam("file") MultipartFile file) throws Exception {
        subjectCompetitionService.importSubjectCompetition(file);
        return Result.success();
    }

    /**
     * 导出学科竞赛信息
     * @param response
     * @param exportConfigDTO
     * @return
     */
    @GetMapping("/exportSubjectCompetition")
    public Result exportSubjectCompetition(HttpServletResponse response,@RequestBody ExportConfigDTO exportConfigDTO){
        subjectCompetitionService.exportSubjectCompetition(response,exportConfigDTO);
        return Result.success();
    }
}
