package com.cm.monitor.model;


import com.cm.monitor.util.ErrorCode;
import lombok.Data;

/**
 * 基础结果类
 */
@Data
public class BaseResult<T> {
    /**
     * 结果值
     */
    private T content;
    /**
     * 信息描述：success为false时，标识错误信息
     */
    private String message;
    /**
     * 返回码：success为false时，标识错误编码
     */
    private Integer code;
    /**
     * 成功调用标识
     */
    private boolean success;

    /**
     * 构造一个成功结果
     *
     * @param content 结果值
     * @param <T>     结果类型
     * @return 构造的结果
     */
    public static <T> BaseResult<T> ok(T content) {
        BaseResult<T> result = new BaseResult<>();
        result.success = true;
        result.code = ErrorCode.OK.getCode();
        result.message = ErrorCode.OK.getMessage();
        result.content = content;
        return result;
    }

    /**
     * 使用异常构造一个错误结果
     *
     * @param code    错误码
     * @param message 消息
     * @param <T>     结果类型
     * @return 构造的结果
     */
    public static <T> BaseResult<T> error(Integer code, String message) {
        BaseResult<T> result = new BaseResult<>();
        result.success = false;
        result.code = code;
        result.message = message;
        result.content = null;
        return result;
    }

    /**
     * 使用ErrorCode构造一个错误结果
     *
     * @param <T> 结果类型
     * @return 构造的结果
     */
    public static <T> BaseResult<T> error(ErrorCode errorCode) {
        BaseResult<T> result = new BaseResult<>();
        result.success = false;
        result.code = errorCode.getCode();
        result.message = errorCode.getMessage();
        result.content = null;
        return result;
    }

    /**
     * 使用ErrorCode构造一个错误结果
     *
     * @param <T> 结果类型
     * @return 构造的结果
     */
    public static <T> BaseResult<T> error(ErrorCode errorCode, T content) {
        BaseResult<T> result = new BaseResult<>();
        result.success = false;
        result.code = errorCode.getCode();
        result.message = errorCode.getMessage();
        result.content = content;
        return result;
    }
}

