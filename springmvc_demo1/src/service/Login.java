package service;

import java.io.InputStream;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.User;

@Service
public class Login{
	@Resource(name="userDao")
	private UserDao userDao;
	//判断用户是否登陆成功
		public boolean execute(String username,String password){
			boolean ret=false;
			//进行数据库编程处理
			// 1.得到数据库连接
		InputStream inputStream = null;
				// 3.执行sql语句
			                     User user=new User();
			                     user.setUsername(username);
			                     user.setPassword(password);
			                     User u=userDao.getUser(user);	
			                     if (u!=null) {
				      ret=true;
				}	
			return ret;
		}

}

