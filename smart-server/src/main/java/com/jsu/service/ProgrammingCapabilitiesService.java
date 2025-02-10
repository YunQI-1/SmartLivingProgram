package com.jsu.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.PageDTO;
import com.jsu.dto.ProgrammingCapabilitiesDTO;
import com.jsu.entity.ProgrammingCapabilities;
import com.jsu.query.PageQuery;
import com.jsu.vo.ProgrammingCapabilitiesVO;


public interface ProgrammingCapabilitiesService extends IService<ProgrammingCapabilities> {
    PageDTO<ProgrammingCapabilitiesVO> getProgrammingCapabilities(PageQuery pageQuery);
    void createProgrammingCapabilities(ProgrammingCapabilitiesDTO programmingCapabilitiesDTO);

    void deleteProgrammingCapabilities(String studentNumber);

    void updateProgrammingCapabilities(ProgrammingCapabilitiesDTO programmingCapabilitiesDTO);
}
