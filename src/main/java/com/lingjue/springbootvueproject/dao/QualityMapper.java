package com.lingjue.springbootvueproject.dao;

import com.lingjue.springbootvueproject.Pojo.District;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/** @author KamenRider */
public interface QualityMapper{

  /** 获取所有区域信息 @return */
  List<District> getAllRegionInfo();

  /** 添加地区名称 @return */
  Integer addRegionInfo(District district);

  /**
   * 更新地区名称
   * @param district 地区类
   * @return 受影响行数
   */
  Integer updateRegionInfo(District district);

  /**
   * 删除地区名称
   * @param id
   * @return
   */
  Integer removeRegion(@Param("id")Integer id);
}
