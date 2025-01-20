package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Course;
import com.jsu.query.PageQuery;
import com.jsu.vo.CourseVO;

public interface CourseService extends IService<Course> {
    PageDTO<CourseVO> getCourses(PageQuery pageQuery);


}
