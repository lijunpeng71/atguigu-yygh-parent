package com.atguigu.study.yygh.common.result;

import lombok.Getter;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 16:06
 */
@Getter
public enum ResultCodeEnum {

    /**
     * 成功
     */
    SUCCESS(200,"成功"),
    /**
     * 通用失败(一般不用)
     */
    FAILURE(201, "失败"),
    ;

    private Integer code;
    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}