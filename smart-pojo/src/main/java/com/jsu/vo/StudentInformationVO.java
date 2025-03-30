package com.jsu.vo;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentInformationVO implements Serializable {
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;
    @ExcelExport(value = "性别", sort = 2)
    private Integer sex;
    @ExcelExport(value = "生日", sort = 3)
    private String birthday;
    @ExcelExport(value = "籍贯", sort = 4)
    private String nativePlace;//籍贯
    @ExcelExport(value = "身高", sort = 5)
    private Integer height;//身高
    @ExcelExport(value = "身份证号", sort = 6)
    private String idCard;
    @ExcelExport(value = "家庭住址", sort = 7)
    private String familyPlace;//家庭住址
    @ExcelExport(value = "学生电话号码1", sort = 8)
    private String studentPhoneNumber1;
    @ExcelExport(value = "学生电话号码2", sort = 9)
    private String studentPhoneNumber2;
    @ExcelExport(value = "监护人1关系", sort = 10)
    private String guardianShip1;//监护人1关系
    @ExcelExport(value = "监护人1手机号", sort = 11)
    private String guardianPhoneNumber1;//监护人1手机号
    @ExcelExport(value = "监护人2", sort = 12)
    private String guardianShip2;//监护人2
    @ExcelExport(value = "监护人2手机号", sort = 13)
    private String guardianPhoneNumber2;//监护人2手机号
    @ExcelExport(value = "学号", sort = 14)
    private String qqNumber;//qq号
    @ExcelExport(value = "邮箱号", sort = 15)
    private String email;//邮箱号
    @ExcelExport(value = "微信号", sort = 16)
    private String wechatNumber;//微信号
    @ExcelExport(value = "健康状态", sort = 17)
    private String healthStatus;//健康状态
    @ExcelExport(value = "特长", sort = 18)
    private String specialty;//特长
    @ExcelExport(value = "爱好", sort = 19)
    private String hobby;//爱好
    @ExcelExport(value = "政治面貌", sort = 20)
    private String politicalStatus;//政治面貌
    @ExcelExport(value = "学院", sort = 21)
    private String college;//学院
    @ExcelExport(value = "专业", sort = 22)
    private String major;//专业
    @ExcelExport(value = "年级", sort = 23)
    private String grade;//年级
    @ExcelExport(value = "学号", sort = 24)
    private String classes;//班级
    @ExcelExport(value = "职务1", sort = 25)
    private String firstJob;//职务1
    @ExcelExport(value = "职务2", sort = 26)
    private String secondJob;//职务2
    @ExcelExport(value = "职务3", sort = 27)
    private String thirdJob;//职务3
    @ExcelExport(value = "寝室号", sort = 28)
    private String dormitoryNumber;//寝室号
    @ExcelExport(value = "个人照片", sort = 29)
    private String photo;
}
