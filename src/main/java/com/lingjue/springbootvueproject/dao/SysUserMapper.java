package com.lingjue.springbootvueproject.dao;

import com.lingjue.springbootvueproject.Pojo.SysUser;

import java.util.List;

/**
 * 用户信息 mapper接口
 *
 * @author KamenRider
 */
public interface SysUserMapper {

  /**
   * 查询用户全部数据
   *
   * @return 用户信息系
   */
  List<SysUser> findAll();

  /**
   * 新增用户信息
   *
   * @param sysUser 用户信息
   * @return 结果
   */
  Integer insertSysUser(SysUser sysUser);

  /**
   * 修改用户信息
   *
   * @param sysUser 用户信息
   * @return 结果
   */
  Integer updateSysUser(SysUser sysUser);

  /**
   * 删除用户信息
   *
   * @param id 用户id
   * @return 结果
   */
  Integer deleteById(Integer id);

  /**
   * 分页查询
   *
   * @param pageNum 当前页数
   * @param pageSize 每页显示数量
   * @return 分页数据
   */
  List<SysUser> selectPage(Integer pageNum, Integer pageSize);

  /**
   * 查询总条数
   * @return 结果
   */
  Integer selectTotal();
}
