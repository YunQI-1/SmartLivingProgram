package com.jsu.entrepreneurshipProject.controller;


import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entrepreneurshipProject.domain.po.EntrepreneurshipProject;
import com.jsu.entrepreneurshipProject.service.EntrepreneurshipProjectService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * <创业项目>
 *  前端控制器
 * <创业项目>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@CrossOrigin(origins = "*")

@Slf4j
@RestController
@RequestMapping("/admin")
public class EntrepreneurshipProjectController {
    @Autowired
    private EntrepreneurshipProjectService entrepreneurshipProjectService;


    /**
     * 获取所有创业项目
     */
    @GetMapping("/getEntrepreneurshipProject")
    public Result getEntrepreneurshipProject(@RequestBody PageQuery pageQuery){
        log.info("管理端获取所有创业项目");
        return Result.success(entrepreneurshipProjectService.getEntrepreneurshipProject(pageQuery));
    }

    /**
     * 获取创业项目详情
     */
    @GetMapping("/getEntrepreneurshipProjectDetail")
    public Result getEntrepreneurshipProjectDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端获取创业项目详情");
        return Result.success(entrepreneurshipProjectService.getEntrepreneurshipProjectDetail(queryDTO));
    }

    /**
     * 创建创业项目
     */
    @PutMapping("/createEntrepreneurshipProject")
    public Result createEntrepreneurshipProject(@RequestBody EntrepreneurshipProject entrepreneurshipProject){
        log.info("管理端创建创业项目");
        entrepreneurshipProjectService.save(entrepreneurshipProject);
        return Result.success();
    }


    /**
     * 删除创业项目
     */
    @DeleteMapping("/deleteEntrepreneurshipProject")
    public Result deleteEntrepreneurshipProject(@RequestParam String id){
        log.info("管理端删除创业项目");
        entrepreneurshipProjectService.removeById(id);
        return Result.success();
    }

    /**
     * 更新创业项目
     */
    @PostMapping("/updateEntrepreneurshipProject")
    public Result updateEntrepreneurshipProject(@RequestBody EntrepreneurshipProject entrepreneurshipProject){
        log.info("管理端更新创业项目");
        entrepreneurshipProjectService.updateById(entrepreneurshipProject);
        return Result.success();
    }

    /**
     * 导入创业项目信息
     */
    @PostMapping("/importEntrepreneurshipProject")
    public Result importEntrepreneurshipProject(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("管理端导入创业项目信息");
        entrepreneurshipProjectService.importEntrepreneurshipProject(file);
        return Result.success("导入成功");
    }


    /**
     * 导出创业项目信息
     */
    @GetMapping("/exportEntrepreneurshipProject")
    public Result exportEntrepreneurshipProject(HttpServletResponse response, @RequestBody ExportConfigDTO<EntrepreneurshipProject> exportConfigDTO){
        log.info("管理端导出创业项目信息");
        entrepreneurshipProjectService.exportEntrepreneurshipProject(response, exportConfigDTO);
        return Result.success();
    }
}
