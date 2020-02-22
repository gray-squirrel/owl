package com.pine.squirrel.lib.dbdo;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @auth 赵松
 * @date 2020/1/5
 */
public class TenantDO {

    @NotNull
    private String id;
    @NotNull
    private String name;
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
}
