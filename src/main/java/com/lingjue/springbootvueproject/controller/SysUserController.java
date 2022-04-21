package com.lingjue.springbootvueproject.controller;

import com.lingjue.springbootvueproject.Pojo.SysUser;
import com.lingjue.springbootvueproject.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户接口
 *
 * @author KamenRider
 */
@RestController
@RequestMapping("user")
public class SysUserController {

  @Resource private SysUserService sysUserService;

  /**
   * 查询所有用户数据
   */
  @GetMapping("findAll")
  public List<SysUser> findAll() {
    return sysUserService.findAll();
  }

  /**
   * 新增用户信息
   */
  @PostMapping("add")
  public Integer add(@RequestBody SysUser sysUser) {
    return sysUserService.addAndModifyUser(sysUser);
  }

  /**
   * 修改用户信息
   */
  @PutMapping("edit")
  public Integer edit(@RequestBody SysUser sysUser) {
    return sysUserService.addAndModifyUser(sysUser);
  }

  /**
   * 删除用户信息
   */
  @DeleteMapping("/{id}")
  public Integer delete(@PathVariable Integer id) {
    return sysUserService.deleteById(id);
  }

  /**
  * 分页查询
  * @RequestParam接收 ？pageNum=1&pageSize=10
   * 当前页数 - 1 * 每页显示的数量 = 下一页显示的其实位置
   * pageSize
  */
  @GetMapping("page")
  public Map<String,Object>  findPasge(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
    return sysUserService.selectPage(pageNum, pageSize);
  }

}
