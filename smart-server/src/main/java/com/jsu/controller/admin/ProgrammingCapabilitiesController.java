package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.entity.ProgrammingCapabilities;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.ProgrammingCapabilitiesService;
import com.jsu.vo.ProgrammingCapabilitiesVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class ProgrammingCapabilitiesController {

    @Autowired
    private ProgrammingCapabilitiesService programmingCapabilitiesService;

    /**
     * 查询所有学生的编程能力* @return
     *
     */
    @GetMapping("/getAcademicPerformance/getProgrammingCapabilities")
    public Result<PageDTO<ProgrammingCapabilitiesVO>> getProgrammingCapabilities(PageQuery pageQuery){
        log.info("管理端查询所有学生的编程能力");
        return Result.success(programmingCapabilitiesService.getProgrammingCapabilities(pageQuery));

    }
}
