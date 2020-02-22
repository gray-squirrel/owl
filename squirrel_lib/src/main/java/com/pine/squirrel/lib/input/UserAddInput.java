package com.pine.squirrel.lib.input;

import javax.validation.constraints.NotNull;

/**
 * @auth 赵松
 * @date 2020/1/5
 */
public class UserAddInput extends BasePara{
    @NotNull
    private String name;
    @NotNull
    private String passwd;
    @NotNull
    private String email;
    @NotNull
    private String tenantId;

    @NotNull
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
