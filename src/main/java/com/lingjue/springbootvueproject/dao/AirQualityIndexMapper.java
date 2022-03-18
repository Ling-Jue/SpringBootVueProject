package com.lingjue.springbootvueproject.dao;

import com.lingjue.springbootvueproject.Pojo.AirQualityIndex;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 空气质量
 *
 * @author KamenRider
 */
public interface AirQualityIndexMapper {

  /**
   * 获取所有区域空气信息
   * @return
   */
  List<AirQualityIndex> getAllAirInfo(
      @Param("pageNum") Integer pageNum,
      @Param("pageSize") Integer pageSize,
      @Param("districtId") Integer districtId);

  /** 获取所有数据总条数 */
  Integer selectTotal(Integer districtId);

  /**
   * 根据id删除数据
   *
   * @param id
   * @return
   */
  Integer deleteInfo(@Param("id") Integer id);

  /**
   * 添加数据
   * @param airQualityIndex
   * @return
   */
  Integer addInfo(AirQualityIndex airQualityIndex);

  /**
   * 更新数据
   * @param airQualityIndex
   * @return
   */
  Integer updateInfo(AirQualityIndex airQualityIndex);

  /**
   * 根据id批量删除数据
   * @param ids
   * @return
   */
  Integer removeByIds(List<Integer> ids);
}
