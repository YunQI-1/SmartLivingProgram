package com.jsu.entrepreneurshipProject.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
    private String studentNumber;

    /**
     * 姓名
     */
    private String studentName;

    /**
     * 项目名
     */
    private String projectName;

    /**
     * 项目介绍
     */
    private String projectIntroduction;

    /**
     * 项目领域
     */
    private String projectAreas;

    /**
     * 指导老师
     */
    private String instructor;

    /**
     * 团队成员
     */
    private String groupMember;

    /**
     * 创业计划书
     */
    private String file;

    /**
     * 开始时间
     */
    private String startDate;


}
