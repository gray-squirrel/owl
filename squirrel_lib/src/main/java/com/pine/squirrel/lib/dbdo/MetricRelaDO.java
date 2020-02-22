package com.pine.squirrel.lib.dbdo;
import java.util.Date;

/**
* @auth 赵松
* @date 2020/1/5
*/
public class MetricRelaDO  {

  private String id;
  private String targetMetricId;
  private String sourceMetricId;
  private String aggRuleId;
  private Date gmtCreate;
  private Date gmtModify;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getTargetMetricId() {
    return targetMetricId;
  }

  public void setTargetMetricId(String targetMetricId) {
    this.targetMetricId = targetMetricId;
  }


  public String getSourceMetricId() {
    return sourceMetricId;
  }

  public void setSourceMetricId(String sourceMetricId) {
    this.sourceMetricId = sourceMetricId;
  }


  public String getAggRuleId() {
    return aggRuleId;
  }

  public void setAggRuleId(String aggRuleId) {
    this.aggRuleId = aggRuleId;
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
