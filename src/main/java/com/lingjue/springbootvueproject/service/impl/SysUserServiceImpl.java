package com.lingjue.springbootvueproject.service.impl;

import com.lingjue.springbootvueproject.Pojo.SysUser;
import com.lingjue.springbootvueproject.dao.SysUserMapper;
import com.lingjue.springbootvueproject.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息Service业务层处理
 * @author KamenRider
 */
@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {

  @Resource private SysUserMapper sysUserMapper;

  /**
   * 查询全部数据
   * @return 用户数据
   */
  @Override
  public List<SysUser> findAll() {
    return sysUserMapper.findAll();
  }

  /**
   * 添加和修改用户
   * @param sysUser 用户信息
   * @return 受影响行数
   */
  @Override
  public Integer addAndModifyUser(SysUser sysUser) {
    //没有id添加  有id修改
    if (sysUser.getId() == null){
      return sysUserMapper.insertSysUser(sysUser);
    }else{
      return sysUserMapper.updateSysUser(sysUser);
    }
  }

  /**
   * 删除用户信息
   * @param id 用户id
   * @return 结果
   */
  @Override
  public Integer deleteById(Integer id) {
    return sysUserMapper.deleteById(id);
  }

  /**
   * 分页查询
   * @param pageNum 当前页数
   * @param pageSize 每页显示数量
   * @return 分页数据
   */
  @Override
  public Map<String,Object> selectPage(Integer pageNum, Integer pageSize) {
    pageNum = (pageNum - 1) * pageSize;
    Integer total = selectTotal();
    Map<String,Object> res = new HashMap<>();
    List<SysUser> sysUsers = sysUserMapper.selectPage(pageNum, pageSize);
    res.put("sysUsers",sysUsers);
    res.put("total",total);
    return res;
  }

  /**
   * 查询总条数
   * @return 结果
   */
  @Override
  public Integer selectTotal() {
    return sysUserMapper.selectTotal();
  }
}
