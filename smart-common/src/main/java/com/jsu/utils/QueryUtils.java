package com.jsu.utils;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.lang.reflect.Field;

public class QueryUtils {
    /**
     * 动态构建模糊查询条件（非空字段自动like）
     * @param queryParams 查询条件DTO
     * @param wrapper 查询包装器
     */
    public static <T> void buildFuzzyQuery(T queryParams, QueryWrapper<?> wrapper) {
        if (queryParams == null) return;

        Class<?> clazz = queryParams.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value = field.get(queryParams);
                if (value != null && !value.toString().isEmpty()) {
                    String column = resolveColumnName(field); // 处理字段名到列名映射
                    wrapper.like(column, value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("反射获取字段值失败", e);
            }
        }
    }

    // 处理字段名到数据库列名的转换（支持MyBatis-Plus的@TableField注解）
    private static String resolveColumnName(Field field) {
        TableField tableField = field.getAnnotation(TableField.class);
        if (tableField != null && !tableField.value().isEmpty()) {
            return tableField.value();
        }
        System.out.println(field.getName());
        System.out.println(StringUtils.camelToUnderline(field.getName()));
        return StringUtils.camelToUnderline(field.getName()); // 驼峰转下划线
    }
}
