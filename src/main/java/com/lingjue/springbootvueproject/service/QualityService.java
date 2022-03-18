package com.lingjue.springbootvueproject.service;


import com.lingjue.springbootvueproject.Pojo.District;

import java.util.List;

/**
 * @author KamenRider
 */
public interface QualityService {

  /** 获取所有区域名称 @return */
  List<District> getAllRegionInfo();

  /** 添加地区名称 @return */
  Integer addRegionInfo(District district);

  /**
   * 删除地区名称
   * @param id
   * @return
   */
  Integer removeRegion(Integer id);
}
