package com.offcn.entity;

import java.io.Serializable;

/**
 * @Auther: lhq
 * @Date: 2020/12/15 09:02
 * @Description:  更新操作返回信息的封装实体
 * 封装实体类必须要实现序列化 实现Serializable（序列化 拆分在组装）
 */
public class Result implements Serializable {

    private boolean success;
    private String message;

    public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
