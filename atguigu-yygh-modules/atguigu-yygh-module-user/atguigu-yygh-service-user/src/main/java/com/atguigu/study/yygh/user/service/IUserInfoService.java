package com.atguigu.study.yygh.user.service;

import com.atguigu.study.yygh.user.domain.UserInfo;
import com.atguigu.study.yygh.user.vo.UserInfoQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 16:04
 */
public interface IUserInfoService {
    /**
     * 分页查询用户信息
     *
     * @param userInfoPage
     * @param userInfoQueryVo
     * @return
     */
    IPage<UserInfo> selectListByPage(Page<UserInfo> userInfoPage, UserInfoQueryVo userInfoQueryVo);

}
