package com.jsu.controller.admin;

import com.jsu.dto.StudentDTO;
import com.jsu.result.PageResult;
import com.jsu.result.Result;
import com.jsu.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class AdminController {
    @Autowired
    AdminService adminService;


    /*

     增加功能

     */


}