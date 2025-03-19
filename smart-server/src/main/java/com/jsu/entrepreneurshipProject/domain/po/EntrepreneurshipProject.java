package com.jsu.entrepreneurshipProject.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.jsu.annotation.ExcelExport;
import com.jsu.annotation.ExcelImport;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("entrepreneurship_project")
public class EntrepreneurshipProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学号
     */
    @ExcelImport(value = "学号")
    @ExcelExport(value = "学号",sort = 1)
    private String studentNumber;

    /**
     * 姓名
     */
    @ExcelImport(value = "姓名")
    @ExcelExport(value = "姓名",sort = 2)
    private String studentName;

    /**
     * 项目名
     */
    @ExcelImport(value = "项目名")
    @ExcelExport(value = "项目名",sort = 3)
    private String projectName;

    /**
     * 项目介绍
     */
    @ExcelImport(value = "项目介绍")
    @ExcelExport(value = "项目介绍",sort = 4)
    private String projectIntroduction;

    /**
     * 项目领域
     */
    @ExcelImport(value = "项目领域")
    @ExcelExport(value = "项目领域",sort = 5)
    private String projectAreas;

    /**
     * 指导老师
     */
    @ExcelImport(value = "指导老师")
    @ExcelExport(value = "指导老师",sort = 6)
    private String instructor;

    /**
     * 团队成员
     */
    @ExcelImport(value = "团队成员")
    @ExcelExport(value = "团队成员",sort = 7)
    private String groupMember;

    /**
     * 创业计划书
     */
    @ExcelImport(value = "创业计划书")
    @ExcelExport(value = "创业计划书",sort = 8)
    private String file;

    /**
     * 开始时间
     */
    @ExcelImport(value = "开始时间")
    @ExcelExport(value = "开始时间",sort = 9)
    private String startDate;


}
