package com.jsu.innovationProject.domain.po;

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
 * 创新项目
 * </p>
 *
 * @author authorXuan
 * @since 2025-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("innovation_projects")
public class InnovationProjects implements Serializable {

    /**
     * 主键id
     */
    @ExcelExport(value = "id", sort = 0)
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学号
     */
    @ExcelImport(value = "学号")
    @ExcelExport(value = "学号", sort = 1)
    private String studentNumber;

    /**
     * 学生姓名
     */
    @ExcelImport(value = "学生姓名")
    @ExcelExport(value = "学生姓名", sort = 2)
    private String studentName;


    /**
     * 项目名称
     */
    @ExcelImport(value = "项目名称")
    @ExcelExport(value = "项目名称", sort = 3)
    private String projectName;
    /**
     * 项目来源
     */
    @ExcelImport(value = "项目来源")
    @ExcelExport(value = "项目来源", sort = 4)
    private String projectSource;

    /**
     * 创建时间
     */
    @ExcelImport(value = "创建时间")
    @ExcelExport(value = "创建时间", sort = 5)
    private String createDate;

    /**
     * 截止时间
     */
    @ExcelImport(value = "截止时间")
    @ExcelExport(value = "截止时间", sort = 6)
    private String deadline;

    /**
     * 个人排名
     */
    @ExcelImport(value = "个人排名")
    @ExcelExport(value = "个人排名", sort = 7)
    private String personalRanking;

    /**
     * 指导老师
     */
    @ExcelImport(value = "指导老师")
    @ExcelExport(value = "指导老师", sort = 8)
    private String instructor;

    /**
     * 文档
     */
    @ExcelImport(value = "文档")
    @ExcelExport(value = "文档", sort = 9)
    private String file;


}
