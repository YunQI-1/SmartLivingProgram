package com.jsu.vo;

import com.jsu.entity.DevelopmentPatent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevelopmentPatentVO implements Serializable {
    //专利数
    private int developmentPatentNumbers;

    private List<DevelopmentPatent> developmentPatents;


}
