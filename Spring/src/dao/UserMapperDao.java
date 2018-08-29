package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import entity.Role;
import entity.User;

public interface UserMapperDao {
	/**
	 * 查询用户表总记录数
	 * @return 
	 */
	public int count();
	/**
	 * 查询用户列表
	 */
	public List<User> queryUserList();
	/**
	 * 登录
	 */
	public User queryUser(User user);
	/**
	 * 添加用户
	 */
	public int addUser(User user);
	/**
	 * 验证
	 */
	public User queryUserCode(String userCode);
	/**
	 * 修改用户信息
	 */
	public int updateUser(User user);
	/**
	 * 根据条件查询用户列表
	 */
	public List<User> query(@Param("userName")String userName,@Param("userRole")Integer roleId);
	/**
	 * 删除
	 */
	public int deletes(Integer[] ids);
	/**
	 * 分页
	 */
	public List<User> userLimit(Map<String, Object> map);
	

}
