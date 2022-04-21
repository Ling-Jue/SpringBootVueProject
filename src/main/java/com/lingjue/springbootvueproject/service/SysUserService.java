package com.lingjue.springbootvueproject.service;

import com.lingjue.springbootvueproject.Pojo.SysUser;

import java.util.List;
import java.util.Map;

/**
 * 用户信息 service 接口
 * @author KamenRider
 */
public interface SysUserService {

  /**
   * 查询全部数据
   * @return 用户数据
   */
  List<SysUser> findAll();

  /**
   * 添加和修改用户
   * @param sysUser 用户信息
   * @return 受影响行数
   */
  Integer addAndModifyUser(SysUser sysUser);

  /**
   * 删除用户信息
   * @param id 用户id
   * @return 结果
   */
  Integer deleteById(Integer id);

  /**
   * 分页查询
   * @param pageNum 当前页数
   * @param pageSize 每页显示数量
   * @return 分页数据
   */
  Map<String,Object> selectPage(Integer pageNum, Integer pageSize);

  /**
   * 查询总条数
   * @return 结果
   */
  Integer selectTotal();
}
