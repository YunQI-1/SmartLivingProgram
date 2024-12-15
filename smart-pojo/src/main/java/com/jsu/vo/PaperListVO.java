package com.jsu.vo;

import com.jsu.entity.Paper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaperListVO implements Serializable {
    private Integer paperNumber;  //论文数
    
    private List<Paper> paperList;//论文详细内容
}
