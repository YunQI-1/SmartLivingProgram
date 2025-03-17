package com.jsu.dto;

import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInformationDTO {
    @ExcelImport(value = "学号", required = true)
    private String studentNumber;//学号
    @ExcelImport(value = "学生姓名", required = true)
    private String studentName;//学生名
    @ExcelImport(value = "性别", required = true)
    private Integer sex;//性别
    @ExcelImport(value = "生日日期", required = true)
    private String birthday;
    @ExcelImport(value = "籍贯", required = true)
    private String nativePlace;//籍贯
    @ExcelImport(value = "身高")
    private Integer height;//身高
    @ExcelImport(value = "身份证号", required = true)
    private String idCard;//身份证号
    @ExcelImport(value = "家庭地址", required = true)
    private String familyPlace;//家庭住址
    @ExcelImport(value = "学生电话号码1", required = true)
    private String studentPhoneNumber1;
    @ExcelImport(value = "学生电话号码2")
    private String studentPhoneNumber2;
    @ExcelImport(value = "监护人1关系", required = true)
    private String guardianShip1;//监护人1关系
    @ExcelImport(value = "监护人1手机号", required = true)
    private String guardianPhoneNumber1;//监护人1手机号
    @ExcelImport(value = "监护人2")
    private String guardianShip2;//监护人2
    @ExcelImport(value = "监护人2手机号")
    private String guardianPhoneNumber2;//监护人2手机号
    @ExcelImport(value = "qq号", required = true)
    private String qqNumber;//qq号
    @ExcelImport(value = "邮箱号")
    private String email;//邮箱号
    @ExcelImport(value = "微信号")
    private String wechatNumber;//微信号
    @ExcelImport(value = "健康状态")
    private String healthStatus;//健康状态
    @ExcelImport(value = "特长")
    private String specialty;//特长
    @ExcelImport(value = "爱好")
    private String hobby;//爱好
    @ExcelImport(value = "政治面貌", required = true)
    private String politicalStatus;//政治面貌
    @ExcelImport(value = "学院", required = true)
    private String college;//学院
    @ExcelImport(value = "专业", required = true)
    private String major;//专业
    @ExcelImport(value = "年级", required = true)
    private String grade;//年级
    @ExcelImport(value = "班级", required = true)
    private String classes;//班级
    @ExcelImport(value = "职务1")
    private String job1;//职务1
    @ExcelImport(value = "职务2")
    private String job2;//职务2
    @ExcelImport(value = "职务3")
    private String job3;//职务3
    @ExcelImport(value = "寝室号")
    private String dormitoryNumber;//寝室号
    @ExcelImport(value = "个人照片")
    private String photo;

}
