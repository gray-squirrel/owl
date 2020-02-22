package com.pine.squirrel.lib.dbdo;
import java.util.Date;

/**
* @auth 赵松
* @date 2020/1/5
*/
public class CollectorFieldDO  {

  private String id;
  private String collectorId;
  private String sourceField;
  private String targetField;
  private Date gmtCreate;
  private Date gmtModify;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getCollectorId() {
    return collectorId;
  }

  public void setCollectorId(String collectorId) {
    this.collectorId = collectorId;
  }


  public String getSourceField() {
    return sourceField;
  }

  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }


  public String getTargetField() {
    return targetField;
  }

  public void setTargetField(String targetField) {
    this.targetField = targetField;
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
