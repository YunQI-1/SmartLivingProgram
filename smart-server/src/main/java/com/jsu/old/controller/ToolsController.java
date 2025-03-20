package com.jsu.old.controller;

import com.jsu.result.Result;
import com.jsu.utils.OssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
@Slf4j
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class ToolsController {


    @Autowired
    private OssUtil ossUtil;

    @PostMapping("/uploadOSS")
    public Result uploadOSS(@RequestParam("file") MultipartFile file) {
        try {
            log.info("上传文件{}",file.getOriginalFilename());
            // 获取文件输入流
            InputStream inputStream = file.getInputStream();
            // 获取原始文件名
            String originalFileName = file.getOriginalFilename();
            // 调用上传方法
            String fileUrl = ossUtil.upload(inputStream, originalFileName);
             return Result.success(fileUrl);
        } catch (IOException e) {
            return Result.error("上传失败");
        }
    }
}
