package com.lingjue.springbootvueproject.service;


import com.lingjue.springbootvueproject.Pojo.AirQualityIndex;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/** @author KamenRider */
public interface AirQualityIndexService {
  /**
   * 获取所有区域空气信息
   * @return
   */
  List<AirQualityIndex> getAllAirInfo(Integer pageNum, Integer pageSize, Integer districtId);

  /** 获取所有数据总条数 */
  Integer selectTotal(Integer districtId);

  /**
   * 根据id删除数据
   * @param id
   * @return
   */
  Integer deleteInfo(Integer id);

  /**
   * 添加和更新地区名称
   * @param airQualityIndex data
   * @return 受影响行数
   */
  Integer addAndUpdate(AirQualityIndex airQualityIndex);

  /**
   * 根据id批量删除数据
   * @param ids
   * @return
   */
  Integer removeByIds(List<Integer> ids);
}
