package com.jsu.entity;

import com.jsu.enums.JoinType;
import lombok.Data;

@Data
public class JoinTable {
    private JoinType type;       // JOIN类型：LEFT/RIGHT/INNER
    private String mainTable;    // 主表别名
    private String joinTable;    // 关联表名
    private String onCondition; // ON条件（如 t1.id = t2.student_id）
}
