package com.jsu.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Paper;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.PaperService;
import com.jsu.utils.OperationalJudgment;
import com.jsu.vo.PaperVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

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

    /**
     *根据studentNumber 查询论文信息
     */
    @GetMapping("/getAcademicPerformance/getStudentNumber")
    public Result getPaperByDoi(@RequestParam String studentNumber){
        log.info("管理端根据studentNumber查询论文信息");
        return Result.success(paperService.list(new QueryWrapper<Paper>().eq("student_number",studentNumber)));
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
    public Result exportPaper(HttpServletResponse response, @RequestBody ExportConfigDTO exportConfigDTO){
        log.info("管理端导出论文信息");
        paperService.exportPaper(response,exportConfigDTO);
        return Result.success();
    }
}
