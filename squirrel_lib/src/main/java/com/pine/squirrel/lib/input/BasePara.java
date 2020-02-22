package com.pine.squirrel.lib.input;

/**
 * @author 赵松
 * @date 2020/1/5
 */
public class BasePara {
    private String userId;
    private String tenantId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
