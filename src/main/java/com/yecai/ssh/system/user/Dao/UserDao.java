package com.yecai.ssh.system.user.Dao;

import com.yecai.ssh.system.common.Annotation.MyBatisDao;
import com.yecai.ssh.system.user.Entity.User;

@MyBatisDao
public interface UserDao {
	public User get(User user);
}
