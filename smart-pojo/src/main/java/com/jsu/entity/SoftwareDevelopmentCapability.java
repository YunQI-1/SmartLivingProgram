package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SoftwareDevelopmentCapability implements Serializable {
    //学业情况-软件开发能力

    private List<SoftwareSystem> softwareSystem;//软件系统

    private List<SoftwareCopyright> softwareCopyright;//软著,最多五个
}
