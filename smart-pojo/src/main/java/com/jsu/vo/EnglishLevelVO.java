package com.jsu.vo;

import com.jsu.entity.EnglishExamDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnglishLevelVO implements Serializable {
    private int examNumber;  //参加考试数


    //考试详细内容
    private List<EnglishExamDetail> EnglishExamDetails;


}
