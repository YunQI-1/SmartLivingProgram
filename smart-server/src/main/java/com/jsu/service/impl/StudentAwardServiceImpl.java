package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.StudentAward;
import com.jsu.mapper.StudentAwardMapper;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.service.StudentAwardService;
import com.jsu.vo.StudentAwardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentAwardServiceImpl extends ServiceImpl<StudentAwardMapper, StudentAward> implements StudentAwardService {

    @Autowired
    private StudentAwardMapper studentAwardMapper;


    /**
     * 分页查询学生荣誉信息
     * @param pageQuery
     * @return
     */
    @Override
    public PageDTO<StudentAwardVO> getStudentAward(PageQuery pageQuery) {
        //1.构建查询提交
        Page<StudentAward> page = pageQuery.toMpPage();

        //2 分页查询
        Page<StudentAward> p =lambdaQuery().page(page);

        //3 封装VO结果返回
        return PageDTO.of(p,StudentAwardVO.class);
    }
}
