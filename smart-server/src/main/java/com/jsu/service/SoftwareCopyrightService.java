package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.query.PageQuery;
import com.jsu.vo.SoftwareCopyrightVO;
import lombok.extern.slf4j.Slf4j;


public interface SoftwareCopyrightService extends IService<SoftwareCopyright> {
    PageDTO<SoftwareCopyrightVO> getSoftwareCopyright(PageQuery pageQuery);
}
