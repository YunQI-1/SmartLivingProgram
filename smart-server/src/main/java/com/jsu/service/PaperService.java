package com.jsu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.entity.Paper;
import com.jsu.query.PageQuery;
import com.jsu.vo.PaperVO;

public interface PaperService extends IService<Paper> {
    PageDTO<PaperVO> getPaperInformation(PageQuery pageQueryQ);

}
