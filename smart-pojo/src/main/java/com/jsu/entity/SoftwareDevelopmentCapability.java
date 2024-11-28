package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class SoftwareDevelopmentCapability implements Serializable {
    //学业情况-软件开发能力
    private String studentNumber;

    private String studentName;

    private String idCard;

    private String major;//专业

    private String SoftwareSystemName;//软件系统名

    private String SoftwareSystemDisplayDiagram1;//软件系统展示图1

    private String SoftwareSystemDisplayDiagram2;//软件系统展示图2

    private String SoftwareSystemDisplayDiagram3;//软件系统展示图3

    private String DevelopmentDocuments;//开发文档

    private SoftwareCopyright softwareCopyright1;//软著1

    private SoftwareCopyright softwareCopyright2;//软著2

    private SoftwareCopyright softwareCopyright3;//软著3

    private SoftwareCopyright softwareCopyright4;//软著4

    private SoftwareCopyright softwareCopyright5;//软著5
}
