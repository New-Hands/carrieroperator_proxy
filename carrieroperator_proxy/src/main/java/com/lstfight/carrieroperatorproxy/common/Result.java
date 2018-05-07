package com.lstfight.carrieroperatorproxy.common;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>统一返回结果规范</p>
 * <p>简单的流式风格的编程<p/>
 * @author lst
 */
public class Result<T> {
    public static final Integer SUCCESS_CODE = 1;
    public static final Integer FAIL_CODE = 0;

    @Getter @Setter private T data;

    @Getter @Setter private String message;

    @Getter @Setter private Integer status;

    public  Result<T> addData(T data) {
        this.data = data;
        return this;
    }

    public  Result<T> addMessage(String message) {
        this.message = message;
        return this;
    }

    public  Result<T> addStatus(Integer status) {
        this.status = status;
        return this;
    }

}
