package com.jsu.service;

import cn.hutool.http.server.HttpServerResponse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Course;
import com.jsu.query.PageQuery;
import com.jsu.vo.CourseVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface CourseService extends IService<Course> {
    PageDTO<CourseVO> getCourses(PageQuery pageQuery);


    void importCourse(MultipartFile file) throws Exception;

    void exportCourse(HttpServletResponse response, ExportConfigDTO exportConfigDTO);

    boolean updateByCourseNumber(Course course);
}
