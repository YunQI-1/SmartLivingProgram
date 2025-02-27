package com.jsu.service.impl;

import cn.hutool.poi.excel.ExcelUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.StudentAwardDTO;
import com.jsu.entity.StudentAward;
import com.jsu.mapper.StudentAwardMapper;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.service.StudentAwardService;
import com.jsu.utils.ExcelUtils;
import com.jsu.vo.StudentAwardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class StudentAwardServiceImpl extends ServiceImpl<StudentAwardMapper, StudentAward> implements StudentAwardService {

    @Autowired
    private StudentAwardMapper studentAwardMapper;


    /**
     * 分页查询学生荣誉信息
     * @param pageQuery
     * @return
     */
    @Override
    public PageDTO<StudentAwardVO> getStudentAward(PageQuery pageQuery) {
        //1.构建查询提交
        Page<StudentAward> page = pageQuery.toMpPage();

        //2 分页查询
        Page<StudentAward> p =lambdaQuery().page(page);

        //3 封装VO结果返回
        return PageDTO.of(p,StudentAwardVO.class);
    }

    @Override
    public void createStudentAward(List<StudentAwardDTO> list) {
          studentAwardMapper.createStudentAward(list);
    }

    @Override
    public void updateStudentAward(StudentAwardDTO studentAwardDTO) {
        studentAwardMapper.updateStudentAward(studentAwardDTO);
    }

    @Override
    public void deleteStudentAward(List<StudentAwardDTO> list) {
        list.forEach(s->studentAwardMapper.deleteStudentAward(s.getStudentNumber(),s.getCertificateNumber()));
    }

    @Override
    public void importStudentAward(MultipartFile file) throws Exception {
        List<StudentAwardDTO> list= ExcelUtils.readMultipartFile(file, StudentAwardDTO.class);
        studentAwardMapper.createStudentAward(list);
    }

    @Override
    public void exportStudentAward(HttpServletResponse response, ExportConfigDTO exportConfigDTO) {
        List<StudentAwardVO> list=studentAwardMapper.getAllStudentAward();
        ExcelUtils.exportWithDynamicColumns(
                response,
                "学生荣誉表.xlsx",
                list,
                StudentAwardVO.class,
                exportConfigDTO.getFields(),
                exportConfigDTO.getColumnNames()
        );
    }
}
