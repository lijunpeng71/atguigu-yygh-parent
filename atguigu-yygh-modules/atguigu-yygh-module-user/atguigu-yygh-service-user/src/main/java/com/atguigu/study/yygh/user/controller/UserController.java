package com.atguigu.study.yygh.user.controller;

import com.atguigu.study.yygh.common.result.Result;
import com.atguigu.study.yygh.user.domain.UserInfo;
import com.atguigu.study.yygh.user.service.IUserInfoService;
import com.atguigu.study.yygh.user.vo.UserInfoQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 16:04
 */
@RestController
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/{page}/{limit}")
    public Result<IPage<UserInfo>> list(UserInfoQueryVo userInfoQueryVo, @PathVariable Long page, @PathVariable Long limit) {
        Page<UserInfo> userInfoPage = new Page<>(page, limit);
        IPage<UserInfo> pageModel = userInfoService.selectListByPage(userInfoPage, userInfoQueryVo);
        return Result.success(pageModel);
    }
}
