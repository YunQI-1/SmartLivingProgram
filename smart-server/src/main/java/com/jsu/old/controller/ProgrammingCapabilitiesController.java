package com.jsu.old.controller;

import com.jsu.dto.PageDTO;
import com.jsu.dto.ProgrammingCapabilitiesDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.old.service.ProgrammingCapabilitiesService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

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

    /**
     * 查询详细编程能力* @return
     */
    @PostMapping("/getAcademicPerformance/getProgrammingCapabilitiesDetail")
    public Result getProgrammingCapabilitiesDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端查询详细编程能力");
        return Result.success(programmingCapabilitiesService.getProgrammingCapabilitiesDetail(queryDTO));
    }


    /**
     *
     * 新增学生编程能力
     * @return
     */
    @PostMapping("/createProgrammingCapabilities")
    public Result createProgrammingCapabilities(@RequestBody ProgrammingCapabilitiesDTO programmingCapabilitiesDTO){
        log.info("新增学生编程能力");
        log.info(String.valueOf(programmingCapabilitiesDTO));
        programmingCapabilitiesService.createProgrammingCapabilities(programmingCapabilitiesDTO);
        return Result.success();
    }
    /**
     *
     * 删除学生编程能力
     * @return
     */
    @DeleteMapping("/deleteProgrammingCapabilities")
    public Result deleteProgrammingCapabilities(@RequestParam String studentNumber){
        programmingCapabilitiesService.deleteProgrammingCapabilities(studentNumber);
        return Result.success();
    }

    /**
     * 修改学生编程能力信息
     * @param programmingCapabilitiesDTO
     * @return
     */
    @PutMapping("/updateProgrammingCapabilities")
    public Result updateProgrammingCapabilities(@RequestBody ProgrammingCapabilitiesDTO programmingCapabilitiesDTO){
        programmingCapabilitiesService.updateProgrammingCapabilities(programmingCapabilitiesDTO);
        return Result.success();
    }


}
