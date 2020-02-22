package com.pine.squirrel.lib.dbdo;
import java.util.Date;

/**
* @auth 赵松
* @date 2020/1/5
*/
public class AggRuleDO  {

  private String id;
  private String content;
  private Date gmtCreate;
  private Date gmtModify;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
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
