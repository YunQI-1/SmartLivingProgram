package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.crypto.SecretKey;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademicPerformanceVO implements Serializable {
    //学业情况(总体)
    private String studentNumber;

    private String studentName;

    private String classes;
}
