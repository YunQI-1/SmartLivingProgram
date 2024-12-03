package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareCopyrightVO implements Serializable {
    private String studentNumber;

    private String studentName;

    private String softwareName;//软件名

    private String InventionPatent;//发明专利
}
