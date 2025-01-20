package com.jsu.vo;

import com.jsu.entity.ParticipateProject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

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

    private String projectSource;

    private String teamRank;//团队排名

    private String developTechnology;

    private String signUpFile;

    private String instructor;

    private LocalDateTime developTime;

    private String duration;

    private Integer numberOfValidCodes;

    private String mainInnovations;

    private String mainFunction;


}
