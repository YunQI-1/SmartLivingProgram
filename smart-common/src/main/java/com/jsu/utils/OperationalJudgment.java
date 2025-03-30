package com.jsu.utils;

import com.jsu.result.Result;

public class OperationalJudgment {
    public static Result check(boolean flag){
        if (flag){
            return Result.success("操作成功!");
        }else{
            return Result.error("操作失败");
        }
    }

}
