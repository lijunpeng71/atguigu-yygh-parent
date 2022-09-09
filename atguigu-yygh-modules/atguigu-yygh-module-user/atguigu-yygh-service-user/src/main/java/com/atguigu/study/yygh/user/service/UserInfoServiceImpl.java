package com.atguigu.study.yygh.user.service;

import cn.hutool.core.util.StrUtil;
import com.atguigu.study.yygh.user.domain.UserInfo;
import com.atguigu.study.yygh.user.mapper.UserInfoMapper;
import com.atguigu.study.yygh.user.vo.UserInfoQueryVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 19:15
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public IPage<UserInfo> selectListByPage(Page<UserInfo> userInfoPage, UserInfoQueryVo userInfoQueryVo) {
        //UserInfoQueryVo获取条件值
        //用户名称
        String username = userInfoQueryVo.getKeyword();
        //用户状态
        Integer status = userInfoQueryVo.getStatus();
        //认证状态
        Integer authStatus = userInfoQueryVo.getAuthStatus();
        //开始时间
        String createTimeBegin = userInfoQueryVo.getCreateTimeBegin();
        //结束时间
        String createTimeEnd = userInfoQueryVo.getCreateTimeEnd();
        //对条件值进行非空判断
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotBlank(username)) {
            wrapper.like("username", username);
        }
        if (Objects.nonNull(status)) {
            wrapper.eq("status", status);
        }
        if (Objects.nonNull(authStatus)) {
            wrapper.eq("auth_status", authStatus);
        }
        if (!StrUtil.isEmpty(createTimeBegin)) {
            wrapper.ge("create_time", createTimeBegin);
        }
        if (!StrUtil.isEmpty(createTimeEnd)) {
            wrapper.le("create_time", createTimeEnd);
        }
        //调用mapper的方法
        IPage<UserInfo> pages = userInfoMapper.selectPage(userInfoPage, wrapper);
        return pages;
    }
}
