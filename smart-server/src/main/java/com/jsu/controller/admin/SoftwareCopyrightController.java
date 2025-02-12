package com.jsu.controller.admin;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.SoftwareCopyrightDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.SoftwareCopyrightService;
import com.jsu.vo.SoftwareCopyrightVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/admin/getAcademicPerformance")
@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class SoftwareCopyrightController {
    @Autowired
    private SoftwareCopyrightService softwareCopyrightService;

    /**
     * 查询所有学生的软著情况
     */
    @GetMapping("/getSoftwareCopyright")
    public Result<PageDTO<SoftwareCopyrightVO>> getSoftwareCopyright(PageQuery pageQuery){
        log.info("管理端查询所有学生的软著情况");
        return Result.success(softwareCopyrightService.getSoftwareCopyright(pageQuery));
    }

    /**
     * 新增学生软著信息
     * @param softwareCopyrightDTO
     * @return
     */
    @PostMapping("/createSoftwareCopyright")
    public Result createSoftwareCopyright(@RequestBody List<SoftwareCopyrightDTO> softwareCopyrightDTO){
        softwareCopyrightService.createSoftwareCopyright(softwareCopyrightDTO);
        return Result.success();
    }

    /**
     * 修改学生软著信息
     * @param softwareCopyrightDTO
     * @return
     */
    @PutMapping("/updateSoftwareCopyright")
    public Result updateSoftwareCopyright(@RequestBody SoftwareCopyrightDTO softwareCopyrightDTO){
        softwareCopyrightService.updateSoftwareCopyright(softwareCopyrightDTO);
        return Result.success();
    }

    /**
     * 删除学生软著信息
     * @param list
     * @return
     */
    @DeleteMapping("/deleteSoftwareCopyright")
    public Result deleteSoftwareCopyright(@RequestBody List<SoftwareCopyrightDTO> list){
        softwareCopyrightService.deleteSoftwareCopyright(list);
        return Result.success();
    }

    /**
     * 导入学生软著信息
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/importSoftwareCopyright")
    public Result importSoftwareCopyright(@RequestParam("file") MultipartFile file) throws Exception {
        softwareCopyrightService.importSoftwareCopyright(file);
        return Result.success();
    }

    /**
     * 导出学生软著信息
     * @param response
     * @param exportConfigDTO
     * @return
     */
    @GetMapping("/exportSoftwareCopyright")
    public Result exportSoftwareCopyright(HttpServletResponse response,@RequestBody ExportConfigDTO exportConfigDTO){
        softwareCopyrightService.exportSoftwareCopyright(response,exportConfigDTO);
        return Result.success();
    }
}
