package com.jsu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.PageDTO;
import com.jsu.dto.ProgrammingCapabilitiesDTO;
import com.jsu.entity.ProgrammingCapabilities;
import com.jsu.exception.BaseException;
import com.jsu.mapper.ProgrammingCapabilitiesMapper;
import com.jsu.query.PageQuery;
import com.jsu.service.ProgrammingCapabilitiesService;
import com.jsu.vo.ProgrammingCapabilitiesVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProgrammingCapabilitiesServiceImpl extends ServiceImpl<ProgrammingCapabilitiesMapper, ProgrammingCapabilities> implements ProgrammingCapabilitiesService {

    @Autowired
    ProgrammingCapabilitiesMapper programmingCapabilitiesMapper;
    @Override
    public PageDTO<ProgrammingCapabilitiesVO> getProgrammingCapabilities(PageQuery pageQuery) {
        //构造查询条件
        Page<ProgrammingCapabilities> page = pageQuery.toMpPage();
        //分页查询
        Page<ProgrammingCapabilities> p = lambdaQuery().page(page);

        //返回VO数据
        return PageDTO.of(p,ProgrammingCapabilitiesVO.class);
    }

    @Override
    public void createProgrammingCapabilities(ProgrammingCapabilitiesDTO programmingCapabilitiesDTO) {
        ProgrammingCapabilities p=programmingCapabilitiesMapper.getAllByStudentNumber(programmingCapabilitiesDTO.getStudentNumber());
        if(p!=null){
            throw new BaseException("该学生编程能力信息已存在！");
        }
        log.info("新增学生编程能力：{}",programmingCapabilitiesDTO);
        ProgrammingCapabilities newP=new ProgrammingCapabilities();
        BeanUtils.copyProperties(programmingCapabilitiesDTO,newP);
        programmingCapabilitiesMapper.createProgrammingCapabilities(newP);
    }

    @Override
    public void deleteProgrammingCapabilities(String studentNumber) {
        ProgrammingCapabilities p=programmingCapabilitiesMapper.getAllByStudentNumber(studentNumber);
        if(p==null){
            throw new BaseException("该学生编程能力信息已删除！");
        }
        log.info("删除学号为{}的学生的编程能力信息",studentNumber);
        programmingCapabilitiesMapper.deleteProgrammingCapabilities(studentNumber);
    }

    @Override
    public void updateProgrammingCapabilities(ProgrammingCapabilitiesDTO programmingCapabilitiesDTO) {
        ProgrammingCapabilities p=programmingCapabilitiesMapper.getAllByStudentNumber(programmingCapabilitiesDTO.getStudentNumber());
        if(p==null){
            throw new BaseException("该学生编程能力信息不存在！");
        }
        log.info("更新学号为{}的学生的编程能力信息",programmingCapabilitiesDTO.getStudentNumber());
        log.info("更新编程能力信息：{}",programmingCapabilitiesDTO);
        ProgrammingCapabilities newP=new ProgrammingCapabilities();
        BeanUtils.copyProperties(programmingCapabilitiesDTO,newP);
        programmingCapabilitiesMapper.updateProgrammingCapabilities(newP);
    }


}
