package com.jsu.controller.admin;
import com.jsu.dto.PageDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.SoftwareCopyrightService;
import com.jsu.vo.SoftwareCopyrightVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class SoftwareCopyrightController {
    @Autowired
    private SoftwareCopyrightService softwareCopyrightService;

    /**
     * 查询所有学生的软著情况
     */
    @GetMapping("/getAcademicPerformance/getSoftwareCopyright")
    public Result<PageDTO<SoftwareCopyrightVO>> getSoftwareCopyright(PageQuery pageQuery){
        log.info("管理端查询所有学生的软著情况");
        return Result.success(softwareCopyrightService.getSoftwareCopyright(pageQuery));
    }

}
