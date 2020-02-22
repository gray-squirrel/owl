package com.pine.squirrel.lib.model;

/**
 * @author 赵松
 * @date 2020/1/14
 */
public class Result<T> {
    private String code;
    private boolean success;
    private T data;
    private String tips;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
