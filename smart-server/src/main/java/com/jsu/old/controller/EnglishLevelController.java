package com.jsu.old.controller;

import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.EnglishLevel;
import com.jsu.old.service.EnglishLevelService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.vo.EnglishLevelVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

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


    /**
     * 查询详细英语水平等级
     */
    @PostMapping("/getEnglishLevelDetail")
    public Result getEnglishLevelDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端查询英语水平详细信息");
        return Result.success(englishLevelService.getEnglishLevelDetail(queryDTO));
    }


    /**
     * 创建英语水平
     */
    @PostMapping("/createEnglishLevel")
    public Result createEnglishLevel(@RequestBody EnglishLevel englishLevel){
        log.info("创建英语水平");
        return Result.success(englishLevelService.save(englishLevel));
    }

    /**
     * 修改英语水平等级
     */
    @PostMapping("/updateEnglishLevel")
    public Result updateEnglishLevel(@RequestBody EnglishLevel englishLevel){
        log.info("修改英语水平等级");
        return Result.success(englishLevelService.updateByCertificateNumber(englishLevel)?"修改成功":"修改失败");
    }

    /**
     * 删除英语水平等级
     */
    @DeleteMapping("/deleteEnglishLevel")
    public Result deleteEnglishLevel(@RequestParam String certificateNumber){
        log.info("删除英语水平等级");
        return Result.success(englishLevelService.removeByCertificateNumber(certificateNumber)?"删除成功":"删除失败");
    }

    /**
     * 导入英语水平等级
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/importEnglishLevel")
    public Result importEnglishLevel(@RequestParam("file") MultipartFile file) throws Exception{
        log.info("导入英语水平等级");
        englishLevelService.importEnglishLevel(file);
        return Result.success("导入成功");
    }

    /**
     * 导出英语水平等级
     */
    @PostMapping("/exportEnglishLevel")
    public Result exportEnglishLevel(HttpServletResponse response, @RequestBody ExportConfigDTO exportConfigDTO){
        log.info("导出英语水平等级");
        englishLevelService.exportEnglishLevel(response,exportConfigDTO);
        return Result.success();
    }
}
