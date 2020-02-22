package com.pine.squirrel.lib.dbdo;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author 赵松
 * @date
 */
public class UserDO {

    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String passwd;
    @NotNull
    private String email;
    @NotNull
    private Date gmtCreate;
    @NotNull
    private Date gmtModify;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
