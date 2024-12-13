package com.jsu.vo;

import com.jsu.entity.SubjectCompetition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCompetitionVO implements Serializable {
    //竞赛数
    private int competitionNumbers;

    //竞赛详情
    private List<SubjectCompetition> subjectCompetitions;

}
