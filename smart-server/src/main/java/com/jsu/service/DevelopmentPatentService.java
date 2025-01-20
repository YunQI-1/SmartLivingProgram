package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.DevelopmentPatent;
import com.jsu.query.PageQuery;
import com.jsu.vo.DevelopmentPatentVO;

public interface DevelopmentPatentService extends IService<DevelopmentPatent> {
    PageDTO<DevelopmentPatentVO> getDevelopmentPatent(PageQuery pageQuery);
}
