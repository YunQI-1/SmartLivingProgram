package com.jsu.old.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.ProgrammingCapabilitiesDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ProgrammingCapabilities;
import com.jsu.query.PageQuery;
import com.jsu.vo.ProgrammingCapabilitiesVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface ProgrammingCapabilitiesService extends IService<ProgrammingCapabilities> {
    PageDTO<ProgrammingCapabilitiesVO> getProgrammingCapabilities(PageQuery pageQuery);
    void createProgrammingCapabilities(ProgrammingCapabilitiesDTO programmingCapabilitiesDTO);

    void deleteProgrammingCapabilities(String studentNumber);

    void updateProgrammingCapabilities(ProgrammingCapabilitiesDTO programmingCapabilitiesDTO);

    List<ProgrammingCapabilities> getProgrammingCapabilitiesDetail(QueryDTO queryDTO);

    void importProgrammingCapabilities(MultipartFile file) throws Exception;

    void exportProgrammingCapabilities(HttpServletResponse response, ExportConfigDTO<ProgrammingCapabilitiesDTO> exportConfigDTO);
}
