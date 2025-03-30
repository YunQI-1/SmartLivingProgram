package com.jsu.dto;

import com.jsu.entity.JoinQueryParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
//选择导出字段DTO
public class ExportConfigDTO<T> {
    // 要导出的字段列表（对应 DTO 属性名）
    private List<String> fields;

    // 自定义列名（非必填）
    private Map<String, String> columnNames;

    private T queryParams;

    private PageDTO<T> pageDTO;
}
