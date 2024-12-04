package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCompetitionVO implements Serializable {
    private String studentNumber;
    private String studentName;

    //证书名
    private String certificateName;
    //证书编号
    private String certificateNumber;
    //证书id
    private String certificationId;
    //举办单位
    private String organizer;
    //获奖等级
    private int awardLevel;
    //参加形式
    private int participateForm;
    //获取时间
    private Date getTime;
    //证书照片
    private String certificationPhoto;
    //参赛文件
    private String signUpFile;
}
