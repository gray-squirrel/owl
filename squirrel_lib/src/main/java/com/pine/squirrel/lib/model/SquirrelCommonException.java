package com.pine.squirrel.lib.model;

import com.pine.squirrel.lib.enums.BusinessCodeEnum;

/**
 * @author 赵松
 * @date 2020/1/14
 */
public class SquirrelCommonException extends RuntimeException {

    private  BusinessCodeEnum businessCodeEnum;
    private String tips;
    public SquirrelCommonException(){
        super();
    }

    public SquirrelCommonException(BusinessCodeEnum codeEnum,String tips){
        this.businessCodeEnum=codeEnum;
        this.tips=tips;
    }

    public BusinessCodeEnum getBusinessCodeEnum() {
        return businessCodeEnum;
    }

    public void setBusinessCodeEnum(BusinessCodeEnum businessCodeEnum) {
        this.businessCodeEnum = businessCodeEnum;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
