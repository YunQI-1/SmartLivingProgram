package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.entity.Paper;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.PaperService;
import com.jsu.vo.PaperVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Slf4j
@CrossOrigin(origins = "*")
public class PaperController {


    @Autowired
    private PaperService paperService;
    /**
     * 获取所有学生的论文情况
     * @return
     */
    @GetMapping("/getAcademicPerformance/getPaperInformation")
    public Result<PageDTO<PaperVO>> getPaperInformation(PageQuery pageQueryQ){
        log.info("管理端查询学生论文情况");
        return Result.success(paperService.getPaperInformation(pageQueryQ));
    }
}
