package service.impl;

import dao.UserDao;
import service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao ud;
	@Override
	public int saveUser(String name, String password) {
		//System.out.println("��ʼ-UserDao-addUser������"+name);
		ud.addUser(name, password);
		//System.out.println("����UserDao-addUser���ز�����1");
		return 1;
		
	}
	public UserDao getUd() {
		return ud;
	}
	public void setUd(UserDao ud) {
		this.ud = ud;
	}


}
