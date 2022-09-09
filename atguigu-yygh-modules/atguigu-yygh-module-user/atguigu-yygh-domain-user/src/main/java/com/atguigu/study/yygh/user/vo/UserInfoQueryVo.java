package com.atguigu.study.yygh.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 18:01
 */
@Data
@ApiModel(description = "会员搜索对象")
public class UserInfoQueryVo implements Serializable {

    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "认证状态")
    private Integer authStatus;

    @ApiModelProperty(value = "创建时间")
    private String createTimeBegin;

    @ApiModelProperty(value = "创建时间")
    private String createTimeEnd;
}
