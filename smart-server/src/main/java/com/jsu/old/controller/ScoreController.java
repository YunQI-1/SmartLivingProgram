package com.jsu.old.controller;

import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.ScoreDTO;
import com.jsu.old.service.ScoreService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.vo.ScoreVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/admin")
@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    /**
     * 获取学生成绩
     *
     * @return
     */
    @GetMapping("/getStudentsGrade")
    public Result<PageDTO<ScoreVO>> getStudentsGrade(PageQuery pageQuery){
        log.info("管理端分页查询所有学生成绩");
        return Result.success(scoreService.getAllScore(pageQuery));
    }
    /**
     * 新增学生成绩
     *
     * @return
     */
    @PostMapping("/createStudentsGrade")
    public Result createStudentsGrade(@RequestBody List<ScoreDTO> scoreDTOList){
        scoreService.createStudentsGrade(scoreDTOList);
        return Result.success();
    }

    /**
     * 获取学习详细成绩信息
     */
    @PostMapping("/getStudentsGradeDetail")
    public Result getStudentsGradeDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端根据学生学号和课程名称查询学生成绩");
        return Result.success(scoreService.getStudentsGradeDetail(queryDTO));
    }


    /**
     * 更新学生成绩
     *
     * @return
     */
    @PutMapping("/updateStudentsGrade")
    public Result updateStudentsGrade(@RequestBody ScoreDTO scoreDTO){
        scoreService.updateStudentsGrade(scoreDTO);
        return Result.success();
    }
    /**
     * 删除学生成绩
     *
     * @return
     */
    @DeleteMapping("/deleteStudentsGrade")
    public Result deleteStudentsGrade(@RequestBody List<ScoreDTO> list){
        scoreService.deleteStudentsGrade(list);
        return Result.success();
    }
    /**
     * 导入学生成绩
     *
     * @return
     */
    @PostMapping("/importStudentsGrade")
    public Result importStudentsGrade(@RequestParam("file") MultipartFile file) throws Exception {
        scoreService.importStudentsGrade(file);
        return Result.success();
    }
    /**
     * 导出学生成绩
     *
     * @return
     */
    @PostMapping("/exportStudentsGrade")
    public Result exportStudentsGrade(HttpServletResponse response,@RequestBody ExportConfigDTO<ScoreDTO> exportConfigDTO){
        scoreService.exportStudentsGrade(response,exportConfigDTO);
        return Result.success();
    }
}
