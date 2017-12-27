package com.yecai.ssh.system.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yecai.ssh.system.user.Dao.UserDao;
import com.yecai.ssh.system.user.Entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * 通过id查询用户实体
	 * @param id
	 * @return User
	 */
	public User getById(User user){
		return userDao.get(user);		
	}
}
