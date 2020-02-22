package com.pine.squirrel.lib.dbdo;
import java.util.Date;

/**
* @auth 赵松
* @date 2020/1/5
*/
public class CollectorDO  {

  private String id;
  private String name;
  private String appId;
  private Date gmtCreate;
  private Date gmtModify;
  private Long type;


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


  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
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


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

}