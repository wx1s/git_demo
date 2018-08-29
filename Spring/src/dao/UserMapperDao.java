package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import entity.Role;
import entity.User;

public interface UserMapperDao {
	/**
	 * ��ѯ�û����ܼ�¼��
	 * @return 
	 */
	public int count();
	/**
	 * ��ѯ�û��б�
	 */
	public List<User> queryUserList();
	/**
	 * ��¼
	 */
	public User queryUser(User user);
	/**
	 * ����û�
	 */
	public int addUser(User user);
	/**
	 * ��֤
	 */
	public User queryUserCode(String userCode);
	/**
	 * �޸��û���Ϣ
	 */
	public int updateUser(User user);
	/**
	 * ����������ѯ�û��б�
	 */
	public List<User> query(@Param("userName")String userName,@Param("userRole")Integer roleId);
	/**
	 * ɾ��
	 */
	public int deletes(Integer[] ids);
	/**
	 * ��ҳ
	 */
	public List<User> userLimit(Map<String, Object> map);
	

}
