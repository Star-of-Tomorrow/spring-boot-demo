package com.xkcoding.swagger.controller;

import com.xkcoding.swagger.common.ApiResponse;
import com.xkcoding.swagger.common.DataType;
import com.xkcoding.swagger.common.ParamType;
import com.xkcoding.swagger.entity.Activity;
import com.xkcoding.swagger.entity.Comment;
import com.xkcoding.swagger.entity.Information;
import com.xkcoding.swagger.entity.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Info;
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


    //活动部分接口
    @PostMapping(value = "/activity")
    @ApiOperation(value = "创建活动")
    public Activity createActivity(@RequestBody Activity activity) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return activity;
    }

    @GetMapping("/activity/{userId}")
    @ApiOperation(value = "活动列表查询", notes = "")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "用户Id", dataType = DataType.STRING, paramType = ParamType.PATH)})
    public ApiResponse<List<Activity>> getActivities(@PathVariable String userId) {
        log.info("单个参数用  @ApiImplicitParam");
        return ApiResponse.<List<Activity>>builder().code(200).message("操作成功").data(new ArrayList()).build();
    }


    // 留言部分接口
    @PostMapping(value = "/comments")
    @ApiOperation(value = "发布留言")
    public Information postComment(@RequestBody Information information) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return information;
    }

    @GetMapping("/comments/{userId}")
    @ApiOperation(value = "留言列表查询", notes = "")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "用户Id", dataType = DataType.STRING, paramType = ParamType.PATH)})
    public ApiResponse<List<Comment>> getComments(@PathVariable String userId) {
        log.info("单个参数用  @ApiImplicitParam");
        return ApiResponse.<List<Comment>>builder().code(200).message("操作成功").data(new ArrayList()).build();
    }







}
