package com.jsu.old.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ProfessionalQualifications;
import com.jsu.old.service.ProfessionalQualificationsService;
import com.jsu.query.PageQuery;

import com.jsu.result.Result;
import com.jsu.vo.ProfessionalQualificationsVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class ProfessionalQualificationsController {

    @Autowired
    private ProfessionalQualificationsService profQualService;


    /**
     * 获取所有学生的职业资格情况
     *
     * @return
     */
    @GetMapping("/getAcademicPerformance/getProfessionalQualifications")
    public Result<PageDTO<ProfessionalQualificationsVO>> getProfessionalQualifications(PageQuery pageQuery){
        log.info("管理端查看所有学生的职业资格");
        return Result.success(profQualService.getProfessionalQualifications(pageQuery));
    }

    /**
     * 获取详细学生职业资格情况
     */
    @PostMapping("/getAcademicPerformance/getProfessionalQualificationsDetail")
    public Result getProfessionalQualificationsDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端根据学生学号和职业资格名称查询学生职业资格情况");
        return Result.success(profQualService.getProfessionalQualificationsDetail(queryDTO));
    }

    /**
     * 新增学生的职业资格情况
     */
    @PostMapping("/getAcademicPerformance/createProfessionalQualifications")
    public Result createProfessionalQualifications(@RequestBody ProfessionalQualifications professionalQualifications){
        log.info("管理端新增学生职业资格");
        profQualService.save(professionalQualifications);
        return Result.success();
    }

    /**
     * 修改学生职业资格情况
     */
    @PostMapping("/getAcademicPerformance/updateProfessionalQualifications")
    public Result updateProfessionalQualifications(@RequestBody ProfessionalQualifications professionalQualifications){
        log.info("管理端修改学生职业资格");
        profQualService.updateByCertificateNumber(professionalQualifications);
        return Result.success();
    }

    /**
     * 删除学生职业资格情况
     */
    @DeleteMapping("/getAcademicPerformance/deleteProfessionalQualifications")
    public Result deleteProfessionalQualifications( String certificateNumber){
        log.info("管理端删除学生职业资格");
        profQualService.remove(new QueryWrapper<ProfessionalQualifications>().eq("certificate_number",certificateNumber));
        return Result.success();
    }

    /**
     * 导入学生职业资格情况
     */
    @PostMapping("/getAcademicPerformance/importProfessionalQualifications")
    public Result importProfessionalQualifications(@RequestParam("file") MultipartFile file) throws Exception{
        log.info("管理端导入学生职业资格");
        profQualService.importProfessionalQualifications(file);
        return Result.success();
    }

    /**
     * 导出学生职业资格情况
     */
    @PostMapping("/getAcademicPerformance/exportProfessionalQualifications")
    public Result exportProfessionalQualifications(HttpServletResponse response, @RequestBody ExportConfigDTO exportConfigDTO){
        log.info("管理端导出学生职业资格");
        profQualService.exportProfessionalQualifications(response,exportConfigDTO);
        return Result.success();
    }
}
