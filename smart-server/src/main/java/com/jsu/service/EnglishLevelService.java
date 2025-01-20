package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.EnglishLevel;
import com.jsu.query.PageQuery;
import com.jsu.vo.EnglishLevelVO;

public interface EnglishLevelService extends IService<EnglishLevel> {

    PageDTO<EnglishLevelVO> getEnglishLevel(PageQuery pageQuery);
}
