package com.xkcoding.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author:maidang
 * @date:2021/10/30
 **/
@RestController
@RequestMapping("/operation")
@Api(tags = "1.0.0-SNAPSHOT", description = "操作管理", value = "操作管理")
@Slf4j
public class OperationController {

}
