package com.suloxyz.common;

import lombok.*;

import java.io.Serializable;

/**
 * 返回值的统一对象
 */
@Getter
public class Result implements Serializable {

    public final static String OK = "200";
    public final static String EXP = "500";

    /**
     * 返回状态
     */
    private String status = OK;

    /**
     * 返回的数据
     */
    private Object data;

    /**
     * 返回值的说明
     */
    private String msg;

    public Result setStatus(String status) {
        this.status = status;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public static Result expResult(){
        return create().setStatus(EXP);
    }

    public static Result create(){
        return new Result();
    }

}

