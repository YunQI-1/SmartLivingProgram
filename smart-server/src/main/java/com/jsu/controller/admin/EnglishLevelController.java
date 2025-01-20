package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.EnglishLevelService;
import com.jsu.vo.EnglishLevelVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class EnglishLevelController {


    @Autowired
    private EnglishLevelService englishLevelService;

    /**
     * 获取所有学生英语等级水平
     *
     * @return
     */
    @GetMapping("/getEnglishLevel")
    public Result<PageDTO<EnglishLevelVO>> getEnglishLevel(PageQuery pageQuery){
        log.info("管理端查询所有学生的英语水平");
        return Result.success(englishLevelService.getEnglishLevel(pageQuery));
    }
}
