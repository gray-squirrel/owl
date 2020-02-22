package com.pine.squirrel.lib.input;

import javax.validation.constraints.NotNull;

/**
 * @author 赵松
 * @date 2020/1/5
 */
public class TenantAddInput {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
