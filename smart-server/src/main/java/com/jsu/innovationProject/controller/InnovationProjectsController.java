package com.jsu.innovationProject.controller;


import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.innovationProject.domain.po.InnovationProjects;
import com.jsu.innovationProject.service.IInnovationProjectsService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * <创新项目>
 * 创新项目 前端控制器
 * </创新项目>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@CrossOrigin(origins = "*")

@Slf4j
@RestController
@RequestMapping("/admin")
public class InnovationProjectsController {


    @Autowired
    private IInnovationProjectsService innovationProjectsService;

    /**
     * 获取所有创新项目
     * @param pageQuery
     * @return
     */
    @GetMapping("/getInnovationProjects")
    public Result getInnovationProjects(@RequestBody PageQuery pageQuery) {
        log.info("管理端获取所有创新项目");
        return Result.success(innovationProjectsService.getInnovationProjects(pageQuery));
    }


    /**
     * 获取创新项目详情
     */
    @GetMapping("/getInnovationProjectsDetail")
    public Result getInnovationProjectsDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端查询创新项目详情");
        return Result.success(innovationProjectsService.getInnovationProjectsDetail(queryDTO));
    }

    /**
     * 删除创新项目
     */
    @DeleteMapping("/deleteInnovationProject")
    public Result deleteInnovationProject(@RequestParam String id){
        log.info("管理端删除创新项目");
        return Result.success(innovationProjectsService.removeById(id));
    }

    /**
     * 更新创新项目
     *
     */
    @PostMapping("/updateInnovationProject")
    public Result updateInnovationProject(@RequestBody InnovationProjects innovationProjects){
        log.info("管理端更新创新项目");
        return Result.success(innovationProjectsService.updateById(innovationProjects));
    }

    /**
     * 创建创新项目
     */
    @PutMapping("/createInnovationProject")
    public Result createInnovationProject(@RequestBody InnovationProjects innovationProjects){
        log.info("管理端创建创新项目");
        return Result.success(innovationProjectsService.save(innovationProjects));
    }

    /**
     * 导入创新项目
     */
    @PostMapping("/importInnovationProject")
    public Result importInnovationProject(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("管理端导入创新项目");
        innovationProjectsService.importInnovationProject(file);
        return Result.success();
    }

    /**
     * 导出创新项目
     */
    @GetMapping("/exportInnovationProject")
    public Result exportInnovationProject(HttpServletResponse response, @RequestBody ExportConfigDTO exportConfigDTO){
        log.info("管理端导出创新项目");
        innovationProjectsService.exportInnovationProject(response, exportConfigDTO);
        return Result.success();
    }
}
