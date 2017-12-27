package test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yecai.ssh.system.user.Entity.User;
import com.yecai.ssh.system.user.Service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class testGet {
	@Autowired
	private UserService userService;
	 @Test  
	    public void test() {  
		 User user=new User();
		 user.setId(2);
		 User list=userService.getById(user);
		 System.out.println(list.getName());  
	    }  
}
