package com.lingjue.springbootvueproject.Pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 空气质量指数表
 * @author KamenRider
 */
public class AirQualityIndex {

  private Integer id;
  /**
   * 区域编号
   */
  private Integer districtId;
  /**
   * 监测时间
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date monitorTime;
  private Integer pm10;
  private Integer pm25;
  /**
   * 监测站
   */
  private String monitoringStation;
  /**
   * 最后更改日期
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date laseModifyTime;

  /**
   * 区域名称
   */
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  public Date getMonitorTime() {
    return monitorTime;
  }

  public void setMonitorTime(Date monitorTime) {
    this.monitorTime = monitorTime;
  }

  public Integer getPm10() {
    return pm10;
  }

  public void setPm10(Integer pm10) {
    this.pm10 = pm10;
  }

  public Integer getPm25() {
    return pm25;
  }

  public void setPm25(Integer pm25) {
    this.pm25 = pm25;
  }

  public String getMonitoringStation() {
    return monitoringStation;
  }

  public void setMonitoringStation(String monitoringStation) {
    this.monitoringStation = monitoringStation;
  }

  public Date getLaseModifyTime() {
    return laseModifyTime;
  }

  public void setLaseModifyTime(Date laseModifyTime) {
    this.laseModifyTime = laseModifyTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
