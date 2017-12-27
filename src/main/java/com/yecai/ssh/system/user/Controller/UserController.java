package com.yecai.ssh.system.user.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yecai.ssh.system.user.Entity.User;
import com.yecai.ssh.system.user.Service.UserService;

@Controller
@RequestMapping("/test")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/test")
	@ResponseBody
	public Map<String,Object> getuser(User user) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("user", userService.getById(user));
		return map;
		
	}
}
