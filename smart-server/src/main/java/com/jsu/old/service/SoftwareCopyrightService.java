package com.jsu.old.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.dto.SoftwareCopyrightDTO;
import com.jsu.entity.SoftwareCopyright;
import com.jsu.query.PageQuery;
import com.jsu.vo.SoftwareCopyrightVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface SoftwareCopyrightService extends IService<SoftwareCopyright> {
    PageDTO<SoftwareCopyrightVO> getSoftwareCopyright(PageQuery pageQuery);

    void createSoftwareCopyright(List<SoftwareCopyrightDTO> softwareCopyrightDTOList);

    void updateSoftwareCopyright(SoftwareCopyrightDTO softwareCopyrightDTO);

    void deleteSoftwareCopyright(List<SoftwareCopyrightDTO> list);

    void importSoftwareCopyright(MultipartFile file) throws Exception;

    void exportSoftwareCopyright(HttpServletResponse response, ExportConfigDTO exportConfigDTO);

    List<SoftwareCopyrightVO> getSoftwareCopyrightDetail(QueryDTO queryDTO);
}
