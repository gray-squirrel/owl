package com.pine.squirrel.lib.dbdo;
import java.util.Date;

/**
* @auth 赵松
* @date 2020/1/5
*/
public class AlarmRuleDO  {

  private String id;
  private String alarmId;
  private Long level;
  private String content;
  private Date gmtCreate;
  private Date gmtModify;
  private String metricId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(String alarmId) {
    this.alarmId = alarmId;
  }


  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
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


  public String getMetricId() {
    return metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

}
