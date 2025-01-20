package com.jsu.controller.admin;

import cn.hutool.db.Page;
import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.result.Result;
import com.jsu.service.ScoreService;
import com.jsu.vo.ScoreVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    /**
     * 获取学生成绩，其中的课程信息，通过用获取课程信息的接口获取课程信息，然后根据成绩实体类里的课程编号映射
     *
     * @return
     */
    @GetMapping("/getStudentsGrade")
    public Result<PageDTO<ScoreVO>> getStudentsGrade(PageQuery pageQuery){
        log.info("管理端分页查询所有学生成绩");
        return Result.success(scoreService.getAllScore(pageQuery));
    }

}
