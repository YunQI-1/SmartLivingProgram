package com.jsu.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {
    private String studentNumber;//学号

    private String studentName;//学生名

    private Integer sex;//性别

    private LocalDateTime birthday;

    private String nativePlace;//籍贯

    private Integer height;//身高

    private String idCard;//身份证号

    private String familyPlace;//家庭住址

    private String studentPhoneNumber1;

    private String studentPhoneNumber2;

    private String guardianShip1;//监护人1关系

    private String guardianPhoneNumber1;//监护人1手机号

    private String guardianShip2;//监护人2

    private String guardianPhoneNumber2;//监护人2手机号

    private String qqNumber;//qq号

    private String email;//邮箱号

    private String wechatNumber;//微信号

    private String healthStatus;//健康状态

    private String specialty;//特长

    private String hobby;//爱好

    private String politicalStatus;//政治面貌

    private String college;//学院

    private String major;//专业

    private String grade;//年级

    private String classes;//班级

    private String job1;//职务1

    private String job2;//职务2

    private String job3;//职务3

    private String dormitoryNumber;//寝室号
}
