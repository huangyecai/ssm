package com.yecai.ssm.system.user.Dao;

import com.yecai.ssm.system.common.Annotation.MyBatisDao;
import com.yecai.ssm.system.user.Entity.User;

import java.util.List;

@MyBatisDao
public interface UserDao {
	public User get(User user);

	public User get(int id);

	List<User> list(User user);
}
