package com.atguigu.study.yygh.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lijunpeng02
 * @date 2022年09月09日 16:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 操作成功
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> success() {
        return Result.success(null);
    }

    /**
     * 操作成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage(), data);
    }


    /**
     * 操作失败
     *
     * @param resultCodeEnum
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(ResultCodeEnum resultCodeEnum) {
        return new Result(resultCodeEnum.getCode(), resultCodeEnum.getMessage(), null);
    }

    /**
     * 操作失败
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(T data) {
        return new Result(ResultCodeEnum.FAILURE.getCode(), ResultCodeEnum.FAILURE.getMessage(), data);
    }

    /**
     * 判断是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        if (this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }
}
