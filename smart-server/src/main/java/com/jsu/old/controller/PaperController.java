package com.jsu.old.controller;

import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.Paper;
import com.jsu.old.service.PaperService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.utils.OperationalJudgment;
import com.jsu.vo.PaperVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;


/**
 * <论文模块>
 *  前端控制器
 * <论文模块>
 *
 * @author authorXuan
 * @since 2025-03-04
 */


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
    public Result<PageDTO<PaperVO>> getPaperInformation(PageQuery pageQuery){
        log.info("管理端查询学生论文情况");
        return Result.success(paperService.getPaperInformation(pageQuery));
    }


    /**
     * 查询论文详细信息
     */
    @PostMapping("/getAcademicPerformance/getPaperDetail")
    public Result getPaperDetail(@RequestBody QueryDTO  queryDTO){
        log.info("管理端查询论文详细信息");
        return Result.success(paperService.getPaperDetail(queryDTO));
    }


    /**
     * 添加论文信息
     */
    @PutMapping("/getAcademicPerformance/createPaper")
    public Result createPaper(@RequestBody Paper paper){
        log.info("管理端添加论文信息");
        return OperationalJudgment.check(paperService.save(paper));
    }


    /**
     * 修改论文信息
     */
    @PutMapping("/getAcademicPerformance/updatePaper")
    public Result updatePaper(@RequestBody Paper paper){
        log.info("管理端修改论文信息");
        return Result.success(paperService.updateByDoi(paper)?"修改成功":"修改失败");
    }


    /**
     * 删除论文信息
     */
    @DeleteMapping("/getAcademicPerformance/deletePaper")
    public Result deletePaper(@RequestParam String doi){
        log.info("管理端删除论文信息");
        return Result.success(paperService.removeByDoi(doi)?"删除成功":"删除失败");
    }

    /**
     * 导入论文信息
     */
    @PostMapping("/getAcademicPerformance/importPaper")
    public Result importPaper(@RequestParam("file") MultipartFile file) throws Exception{
        log.info("管理端导入论文信息");
        paperService.importPaper(file);
        return Result.success("导入成功");
    }

    /**
     * 导出论文信息
     */
    @PostMapping("/getAcademicPerformance/exportPaper")
    public Result exportPaper(HttpServletResponse response, @RequestBody ExportConfigDTO<Paper> exportConfigDTO){
        log.info("管理端导出论文信息");
        paperService.exportPaper(response,exportConfigDTO);
        return Result.success();
    }
}
