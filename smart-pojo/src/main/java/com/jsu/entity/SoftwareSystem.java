package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SoftwareSystem implements Serializable {
    private String studentNumber;

    private String SoftwareSystemName;//软件系统名

    private String SoftwareSystemDisplayDiagram1;//软件系统展示图1

    private String SoftwareSystemDisplayDiagram2;//软件系统展示图2

    private String SoftwareSystemDisplayDiagram3;//软件系统展示图3

    private String DevelopmentDocuments;//开发文档
}
