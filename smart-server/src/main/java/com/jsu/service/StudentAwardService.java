package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.StudentAward;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.vo.StudentAwardVO;

public interface StudentAwardService extends IService<StudentAward> {


    PageDTO<StudentAwardVO> getStudentAward(PageQuery pageQuery);
}
