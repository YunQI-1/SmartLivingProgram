
package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoftwareDevelopmentCapabilityVO implements Serializable {
    //学业情况-软件开发能力

    private List<SoftwareSystemVO> softwareSystem;//软件系统

    private List<SoftwareCopyrightVO> softwareCopyright;//软著,最多五个
}
