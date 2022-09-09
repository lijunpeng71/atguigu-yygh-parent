package com.atguigu.study.yygh.user.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 17:31
 */
@Data
@TableName("user_info")
public class UserInfo implements Serializable {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;
}
