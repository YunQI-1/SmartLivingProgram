package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Score;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.vo.ScoreVO;

public interface ScoreService extends IService<Score> {
    PageDTO<ScoreVO> getAllScore(PageQuery pageQuery);
}
