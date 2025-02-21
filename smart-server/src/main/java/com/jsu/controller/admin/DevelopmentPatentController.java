package com.jsu.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Course;
import com.jsu.entity.DevelopmentPatent;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.DevelopmentPatentService;
import com.jsu.vo.DevelopmentPatentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})

@RequestMapping("/admin")
public class DevelopmentPatentController {

    @Autowired
    private DevelopmentPatentService developmentPatentService;

    /**
     * 获取发明专利情况

     * @return
     */
    @GetMapping("/getAcademicPerformance/getDevelopmentPatent")
    public Result<PageDTO<DevelopmentPatentVO>> getDevelopmentPatent(PageQuery pageQuery){
        log.info("管理端查询学生软著情况");
        return Result.success(developmentPatentService.getDevelopmentPatent(pageQuery));
    }

    /**
     * 根据专利号查询详细发明专利
     */
    @GetMapping("/getAcademicPerformance/getDevelopmentPatentDetail")
    public Result getDevelopmentPatentDetail(@RequestParam String patentNumber){
        log.info("管理端根据专利号查询详细发明专利");
        return Result.success(developmentPatentService.getOne(new QueryWrapper<DevelopmentPatent>().eq("patent_number",patentNumber)));
    }

    /**
     * 新增专利信息
     */
    @PutMapping("//createDevelopmentPatent")
    public Result createDevelopmentPatent(@RequestBody DevelopmentPatent developmentPatent) {
        log.info("管理端新增专利信息");
        return Result.success(developmentPatentService.save(developmentPatent) ? "新增成功" : "新增失败");
    }

    /**
     * 修改专利信息
     */
    @PostMapping("/getAcademicPerformance/updateDevelopmentPatent")
    public Result updateDevelopmentPatent(@RequestBody DevelopmentPatent developmentPatent) {
        log.info("管理端修改专利信息");
        return Result.success(developmentPatentService.updateByPatentNumber(developmentPatent) ? "修改成功" : "修改失败");
    }

    /**
     * 删除专利信息
     */
    @DeleteMapping("/getAcademicPerformance/deleteDevelopmentPatent")
    public Result deleteDevelopmentPatent(@RequestParam String patentNumber) {
        log.info("管理端删除专利信息");
        return Result.success(developmentPatentService.removeById(patentNumber) ? "删除成功" : "删除失败");
    }

    /**
     * 导入专利数据
     *
     */
    @PostMapping("/getAcademicPerformance/importDevelopmentPatent")
    public Result importDevelopmentPatent(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("管理端导入专利数据");
        developmentPatentService.importDevelopmentPatent(file);
        return Result.success("导入成功");
    }

    /**
     * 导出专利数据
     */
    @PostMapping("/getAcademicPerformance/exportDevelopmentPatent")
    public Result exportDevelopmentPatent(HttpServletResponse response, @RequestBody ExportConfigDTO exportConfigDTO){
        developmentPatentService.exportDevelopmentPatent(response,exportConfigDTO);
        return Result.success();
    }
}
