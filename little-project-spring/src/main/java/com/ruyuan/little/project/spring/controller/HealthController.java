package com.ruyuan.little.project.spring.controller;

import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;
import java.util.function.LongFunction;

@RestController
public class HealthController {

    @RequestMapping("/")
    public CommonResponse health() {
        return CommonResponse.success();
    }
}
