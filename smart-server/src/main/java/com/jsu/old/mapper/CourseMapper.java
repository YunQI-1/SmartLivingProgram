package com.jsu.old.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {

    void createCourse(@Param("list") List<Course> courseList);

    List<Course> getAllCourses();

    boolean updateByCourseNumber(Course course);
}
