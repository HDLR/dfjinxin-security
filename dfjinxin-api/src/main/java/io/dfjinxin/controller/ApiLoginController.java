/**
 * Copyright (c) 东方金信 All rights reserved.
 *
 * http://www.seaboxdata.com
 *
 * 版权所有，侵权必究！
 */

package io.dfjinxin.controller;


import io.dfjinxin.annotation.Login;
import io.dfjinxin.common.utils.R;
import io.dfjinxin.common.validator.ValidatorUtils;
import io.dfjinxin.form.LoginForm;
import io.dfjinxin.service.TokenService;
import io.dfjinxin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**
 * 登录接口
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/api")
@Api(tags="登录接口")
public class ApiLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;


    @PostMapping("login")
    @ApiOperation("登录")
    public R login(@RequestBody LoginForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        Map<String, Object> map = userService.login(form);

        return R.ok(map);
    }

    @Login
    @PostMapping("logout")
    @ApiOperation("退出")
    public R logout(@ApiIgnore @RequestAttribute("userId") long userId){
        tokenService.expireToken(userId);
        return R.ok();
    }

}
