package com.yecai.ssm.system.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yecai.ssm.system.user.Dao.UserDao;
import com.yecai.ssm.system.user.Entity.User;

import java.util.List;

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
	public User getById(int id){
		return userDao.get(id);
	}

	public List<User> list(User user) {
		return userDao.list(user);
	}

	public User create(User user) {
		return null;
	}
}
