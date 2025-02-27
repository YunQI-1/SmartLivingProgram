package com.jsu.controller.admin;

import cn.hutool.http.server.HttpServerResponse;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Course;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.CourseService;
import com.jsu.utils.OperationalJudgment;
import com.jsu.vo.CourseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/admin")
public class CourseController {


    @Autowired
    private CourseService courseService;

    @GetMapping("/getCourses")
    public Result getCourses(PageQuery pageQuery){
        log.info("管理端查询课表信息");
        return Result.success(courseService.getCourses(pageQuery));
    }


    /**
     * 新增课程信息
     */
    @PostMapping("/createCourse")
    public Result createCourse(@RequestBody Course course){
        log.info("管理端新增课程信息");
        return Result.success(courseService.save(course)?"新增成功":"新增失败");
    }

    /**
     * 根据课程名查询课程信息
     */
    @GetMapping("/getCourseByCourseName")
    public Result getCourseByCourseName(@RequestParam String courseName){
        log.info("管理端根据课程名查询课程信息");
        return Result.success(courseService.list(new QueryWrapper<Course>().eq("course_name",courseName)));
/*
        return Result.success(courseService.getOne(new QueryWrapper<Course>().eq("course_name",courseName)));
*/

    }

    /**
     * 修改课程列表
     */
    @PostMapping
    public Result updateCourse(@RequestBody Course course){
        log.info("管理端修改课程信息");


        return OperationalJudgment.check(courseService.updateByCourseNumber(course));
/*
        return Result.success(courseService.update(new QueryWrapper<Course>().eq("course_name",course.getCourseName())));
*/
    }

    /**
     * 删除课程
     */
    @DeleteMapping("/deleteCourse")
    public Result deleteCourse(@RequestParam String CourseNumber){
        log.info("管理端删除课程信息");
        return OperationalJudgment.check(courseService.remove(new QueryWrapper<Course>().eq("course_number",CourseNumber)));
/*
        return Result.success(courseService.remove(new QueryWrapper<Course>().eq("course_number",CourseNumber))?"删除成功":"删除失败");
*/
    }

    /**
     * 导入课程数据
     */
    @PostMapping("/importCourse")
    public Result importCourse(@RequestParam("file") MultipartFile file) throws Exception{
        log.info("管理端导入课程信息");
        courseService.importCourse(file);
        return Result.success();
    }

    /**
     * 导出课程数据
     */
    @GetMapping("/exportCourse")
    public Result exportCourse(HttpServletResponse response, @RequestBody ExportConfigDTO exportConfigDTO){
        courseService.exportCourse(response,exportConfigDTO);
        return Result.success();
    }
}
