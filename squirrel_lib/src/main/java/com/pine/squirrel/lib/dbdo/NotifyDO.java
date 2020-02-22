package com.pine.squirrel.lib.dbdo;
import java.util.Date;

/**
* @auth 赵松
* @date 2020/1/5
*/
public class NotifyDO  {

  private String id;
  private Long userType;
  private String receiverIds;
  private Date gmtCreate;
  private Date gmtModify;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Long getUserType() {
    return userType;
  }

  public void setUserType(Long userType) {
    this.userType = userType;
  }


  public String getReceiverIds() {
    return receiverIds;
  }

  public void setReceiverIds(String receiverIds) {
    this.receiverIds = receiverIds;
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
