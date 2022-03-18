package com.lingjue.springbootvueproject.controller;

import com.lingjue.springbootvueproject.Pojo.District;
import com.lingjue.springbootvueproject.service.QualityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 区域信息接口
 *
 * @author KamenRider
 */
@RestController
@RequestMapping("/district")
public class DistrictController {

  @Resource private QualityService qualityService;

  /** 获取所有地区名称 @return */
  @GetMapping("/")
  public List<District> getAllDistrictInfo() {
    return qualityService.getAllRegionInfo();
  }

  /** 添加和更新地区名称 @return */
  @PostMapping("/save")
  public Integer addAndUpdateRegionInfo(@ RequestBody District district) {
    return qualityService.addRegionInfo(district);
  }

  /**
   * 删除地区名称
   * @param id 对应的字段
   * @return 受影响行数
   */
  @DeleteMapping("/{id}")
  public Integer removeRegion(@PathVariable Integer id) {
    return qualityService.removeRegion(id);
  }


}
