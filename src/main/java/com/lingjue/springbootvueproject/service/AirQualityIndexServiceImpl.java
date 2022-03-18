package com.lingjue.springbootvueproject.service;


import com.lingjue.springbootvueproject.Pojo.AirQualityIndex;
import com.lingjue.springbootvueproject.dao.AirQualityIndexMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author KamenRider
 */
@Service("AirQualityIndexService")
public class AirQualityIndexServiceImpl implements AirQualityIndexService{

    @Resource AirQualityIndexMapper airQualityMapper;

    /**
     * 获取所有区域空气信息
     * @return
     */
    @Override
    public List<AirQualityIndex> getAllAirInfo(Integer pageNum, Integer pageSize, Integer districtId) {
        return airQualityMapper.getAllAirInfo(pageNum,pageSize,districtId);
    }

  /** 获取所有数据总条数 */
  @Override
  public Integer selectTotal(Integer districtId) {
      return airQualityMapper.selectTotal(districtId);
  }

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    @Override
    public Integer deleteInfo(Integer id) {
        return airQualityMapper.deleteInfo(id);
    }

  /**
   * 添加和更新地区名称
   * @param airQualityIndex data
   * @return
   */
  @Override
  public Integer addAndUpdate(AirQualityIndex airQualityIndex) {
        if (airQualityIndex.getId() == null){
            return airQualityMapper.addInfo(airQualityIndex);
        }else{
            return airQualityMapper.updateInfo(airQualityIndex);
        }
    }

  /**
   * 根据id批量删除数据
   * @param ids
   * @return
   */
  @Override
  public Integer removeByIds(List<Integer> ids) {
        return airQualityMapper.removeByIds(ids);
    }
}
