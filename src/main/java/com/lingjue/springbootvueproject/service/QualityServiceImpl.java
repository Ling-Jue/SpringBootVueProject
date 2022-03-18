package com.lingjue.springbootvueproject.service;


import com.lingjue.springbootvueproject.Pojo.District;
import com.lingjue.springbootvueproject.dao.QualityMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/** @author KamenRider */
@Service("QualityService")
@Transactional
public class QualityServiceImpl implements QualityService {

  @Resource private QualityMapper qualityMapper;

  /** 获取所以区域名称 @return */
  @Override
  public List<District> getAllRegionInfo() {
    return qualityMapper.getAllRegionInfo();
  }

  /** 添加和更新地区名称 @return */
  @Override
  public Integer addRegionInfo(District district) { //district 没有id则表示新增
    if(district.getId() == null){
      return qualityMapper.addRegionInfo(district);
    }else{ //否则表示更新
      return qualityMapper.updateRegionInfo(district);
    }
  }

  /**
   * 删除地区名称
   * @param id
   * @return
   */
  @Override
  public Integer removeRegion(Integer id) {
    return qualityMapper.removeRegion(id);
  }

}
