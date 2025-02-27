package com.jsu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsu.entity.EnglishLevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnglishLevelMapper extends BaseMapper<EnglishLevel> {


    boolean updateByCertificateNumber(EnglishLevel englishLevel);

    void createEnglishLevel(List<EnglishLevel> englishLevelList);

    List<EnglishLevel> getAllEnglishLevel();

    boolean removeByCertificateNumber(String certificateNumber);
}
