package com.jsu.vo;

import com.jsu.entity.AcademicCompetitionDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcademicCompetitionVO {

    //获奖数
    private int awards;

    //奖品详细数据
    private List<AcademicCompetitionDetail> academicCompetitionDetails;


}
