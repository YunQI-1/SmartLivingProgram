package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.ParticipateProjectService;
import com.jsu.vo.ParticipateProjectVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Slf4j
@CrossOrigin(origins = "*")
public class ParticipateProjectController {



    @Autowired
    private ParticipateProjectService participateProjectService;
    /**
     * 获取所有学生的参加项目的情况
     * @return
     */
    @GetMapping("/getAcademicPerformance/getParticipateProject")
    public Result<PageDTO<ParticipateProjectVO>> getParticipateProject(PageQuery pageQuery){
        log.info("管理端查询学生参加项目的情况");
        return Result.success(participateProjectService.getParticipateProject(pageQuery));
    }


}
