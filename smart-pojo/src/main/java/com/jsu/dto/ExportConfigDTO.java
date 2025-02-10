package com.jsu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
//选择导出字段DTO
public class ExportConfigDTO {
    // 要导出的字段列表（对应 ScoreDTO 属性名）
    private List<String> fields;

    // 自定义列名（非必填）
    private Map<String, String> columnNames;
}
