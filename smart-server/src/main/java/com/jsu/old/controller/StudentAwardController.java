package com.jsu.old.controller;


import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.StudentAwardDTO;
import com.jsu.old.service.StudentAwardService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.vo.StudentAwardVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin/getAcademicPerformance")
public class StudentAwardController {

    @Autowired
    private StudentAwardService studentAwardService;

    /**
     * 管理端查找学生的荣誉信息
     * @return
     */
    @GetMapping("/getStudentAward")
    public Result<PageDTO<StudentAwardVO>> getStudentAward(PageQuery pageQuery){
        log.info("管理端查询所有学生的荣誉情况");
        return Result.success(studentAwardService.getStudentAward(pageQuery));
    }

    /**
     * 查找学生荣誉的详细信息
     */
    @PostMapping("/getStudentAward/getStudentAwardDetail")
    public Result getStudentAwardDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端根据学生学号和荣誉名称查询学生荣誉情况");
        return Result.success(studentAwardService.getStudentAwardDetail(queryDTO));
    }


    /**
     * 新增学生荣誉
     * @param list
     * @return
     */
    @PostMapping("/createStudentAward")
    public Result createStudentAward(@RequestBody List<StudentAwardDTO> list){
        studentAwardService.createStudentAward(list);
        return Result.success();
    }

    /**
     * 修改学生荣誉
     * @param studentAwardDTO
     * @return
     */
    @PutMapping("/updateStudentAward")
    public Result updateStudentAward(@RequestBody StudentAwardDTO studentAwardDTO){
        studentAwardService.updateStudentAward(studentAwardDTO);
        return Result.success();
    }

    /**
     * 删除学生荣誉
     * @param list
     * @return
     */
    @DeleteMapping("/deleteStudentAward")
    public Result deleteStudentAward(@RequestBody List<StudentAwardDTO> list){
        studentAwardService.deleteStudentAward(list);
        return Result.success();
    }

    /**
     * 导入学生荣誉
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/importStudentAward")
    public Result importStudentAward(@RequestParam("file")MultipartFile file) throws Exception {
        studentAwardService.importStudentAward(file);
        return Result.success();
    }

    /**
     * 导出学生荣誉
     * @param response
     * @param exportConfigDTO
     * @return
     */
    @PostMapping("/exportStudentAward")
    public Result exportStudentAward(HttpServletResponse response,@RequestBody ExportConfigDTO<StudentAwardDTO> exportConfigDTO){
        studentAwardService.exportStudentAward(response,exportConfigDTO);
        return Result.success();
    }
}
