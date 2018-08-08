package com.yecai.ssm.system.user.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yecai.ssm.system.user.Entity.User;
import com.yecai.ssm.system.user.Service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final String GET="get";
	private static final String LIST="list";
	private static final String CREATE="create";
	@Autowired
	private UserService userService;

	@RequestMapping(GET)
	@ResponseBody
	public Map<String,Object> getuser(int id, HttpServletRequest request, HttpServletResponse response) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("user", userService.getById(id));
		return map;
	}

	@RequestMapping(LIST)
	@ResponseBody
	public Map<String,Object> list(User user, HttpServletRequest request, HttpServletResponse response) {
		Map<String,Object> map=new HashMap<String,Object>();
		if (true){
			throw new RuntimeException("didididid");
		}
		map.put("list", userService.list(user));
		return map;
	}

	@RequestMapping(CREATE)
	@ResponseBody
	public Map<String,Object> create(User user, HttpServletRequest request, HttpServletResponse response) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("user", userService.create(user));
		return map;
	}
}
