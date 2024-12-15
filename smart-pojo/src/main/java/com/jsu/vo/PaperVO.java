package com.jsu.vo;

import com.jsu.entity.Paper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaperVO implements Serializable {

    //论文数
    private int paperNumbers;

    //论文详情
    private List<Paper> paperList;
}
