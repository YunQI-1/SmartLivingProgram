package com.jsu.vo;

import com.jsu.entity.StudentAwardDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAwardVO {

    //获奖数
    private int awards;

    //奖品详细数据
    private List<StudentAwardDetail> studentAwardDetails;


}
