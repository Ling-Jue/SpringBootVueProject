package com.lingjue.springbootvueproject.controller;

import com.lingjue.springbootvueproject.Pojo.AirQualityIndex;
import com.lingjue.springbootvueproject.service.AirQualityIndexService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 空气质量
 *
 * @author KamenRider
 */
@RestController
@RequestMapping("/Air")
public class AirQualityIndexController {

  @Resource AirQualityIndexService airQualityIndexService;

  /**
   * 获取全部数据分页测试
   * @return @RequestParam接收 ？pageNum=1&pageSize=10
   */
  @GetMapping("/pageInfo")
  public Map<String, Object> getAllInfoPage(
                                            @RequestParam Integer pageNum,
                                            @RequestParam Integer pageSize,
                                            @RequestParam(defaultValue = "") Integer districtId) {
    pageNum = (pageNum - 1) * pageSize;
    List<AirQualityIndex> data =
        airQualityIndexService.getAllAirInfo(pageNum, pageSize, districtId);
    Integer total = airQualityIndexService.selectTotal(districtId);
    Map<String, Object> res = new HashMap<>();
    res.put("data", data);
    res.put("total", total);
    return res;
  }

  /**
   * 根据id删除数据
   *
   * @param id
   * @return
   */
  @DeleteMapping("/removeInfo")
  public Integer removeInfoById(@RequestParam Integer id) {
    return airQualityIndexService.deleteInfo(id);
  }

  /**
   * 根据id批量删除数据
   *
   * @param ids
   * @return
   */
  @PostMapping("/batchDel")
  public Integer batchRemove(@RequestBody List<Integer> ids) {
    return airQualityIndexService.removeByIds(ids);
  }

  /**
   * 添加和更新地区名称
   *
   * @param airQualityIndex
   * @return
   */
  @PostMapping("/addAndUpd")
  public Integer addAndUpdate(@RequestBody AirQualityIndex airQualityIndex) {
    airQualityIndex.setLaseModifyTime(new Date());
    return airQualityIndexService.addAndUpdate(airQualityIndex);
  }
}
