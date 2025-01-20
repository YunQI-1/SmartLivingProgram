package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.DevelopmentPatentService;
import com.jsu.vo.DevelopmentPatentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/admin/getAcademicPerformance/getDevelopmentPatent")
    public Result<PageDTO<DevelopmentPatentVO>> getDevelopmentPatent(PageQuery pageQuery){
        log.info("管理端查询学生软著情况");
        return Result.success(developmentPatentService.getDevelopmentPatent(pageQuery));
    }
}
