package com.xspace.springBootDemo.business.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
//说明接口文件
@Api(value = "测试接口", tags = "用户管理相关的接口")
public class UserController {

    /**
     * 保存数据
     * @return
     */
    @PostMapping(value = "/save")
    //方法参数说明，name参数名；value参数说明，备注；dataType参数类型；required 是否必传；defaultValue 默认值
    @ApiImplicitParam(name = "user", value = "新增用户数据")
    //说明是什么方法(可以理解为方法注释)
    @ApiOperation(value = "添加用户", notes = "添加用户")
    public String saveUser(){
        String msg = "保存成功";
        return msg;
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @GetMapping(value = "findById")
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id查询用户信息")
    public String getUser(Integer id){
        String msg = "根据id获取用户信息成功";
        return msg;
    }

    @DeleteMapping(value = "deleteById")
    @ApiOperation(value = "根据id删除数据", notes = "删除用户")
    public String delete(Integer id){
        String msg = "根据id删除数据成功";
        return msg;
    }
}

