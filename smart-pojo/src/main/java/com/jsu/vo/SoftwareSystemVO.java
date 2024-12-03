package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareSystemVO implements Serializable {
    private String studentNumber;

    private String SoftwareSystemName;//软件系统名

    private String SoftwareSystemDisplayDiagram1;//软件系统展示图1

    private String SoftwareSystemDisplayDiagram2;//软件系统展示图2

    private String SoftwareSystemDisplayDiagram3;//软件系统展示图3

    private String DevelopmentDocuments;//开发文档
}
