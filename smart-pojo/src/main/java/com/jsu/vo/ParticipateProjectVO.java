package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipateProjectVO implements Serializable {
    private String studentNumber;
    private String studentName;

    //项目名
    private String projectName;
    //类型
    private String type;
}
