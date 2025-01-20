package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Score;
import com.jsu.mapper.ScoreMapper;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.service.ScoreService;
import com.jsu.vo.ScoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {


    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public PageDTO<ScoreVO> getAllScore(PageQuery pageQuery) {
        //构建分页查询条件
        Page<Score> page = pageQuery.toMpPage();

        // ✅ 传入 Page 对象，而不是 pageNo 和 pageSize
        Page<Score> p = scoreMapper.getAllScore(page);


        //封装结果返回
        return PageDTO.of(p, ScoreVO.class);
    }
}
