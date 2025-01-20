package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.ProfessionalQualificationsService;
import com.jsu.vo.ProfessionalQualificationsVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


}
