package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipateProject {
    private String studentNumber;
    private String studentName;

    //项目名
    private String projectName;
    //类型
    private String type;

}
