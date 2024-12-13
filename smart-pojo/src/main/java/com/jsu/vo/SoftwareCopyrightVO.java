package com.jsu.vo;

import com.jsu.entity.SoftwareCopyright;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareCopyrightVO implements Serializable {
    //软著数
    private int copyrightNumbers;


    //软著细节
    private List<SoftwareCopyright> softwareCopyrights;

}
