package com.jsu.vo;

import com.jsu.entity.ParticipateProjectDetail;
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
    private int projectNumber;  //参加项目数

    private List<ParticipateProjectDetail> participateProjectDetails;


}
