package com.jsu.vo;

import com.jsu.entity.ProfessionalQualifications;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ProfessionalQualificationsVO {
    private int professionalNumbers;

    private  List<ProfessionalQualifications>  professionalQualificationsList;
}
