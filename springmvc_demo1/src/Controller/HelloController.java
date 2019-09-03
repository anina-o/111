package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.User;


@Controller
@RequestMapping("/abc")
public class HelloController {

	/*术语：Action*/
	@RequestMapping("/hello/{abc}")
	public String hello(@PathVariable("abc")String name) {
		System.out.println(name);
		return"hello";
				
	}
	@RequestMapping("/say")
	public String say() {
		return"say";
	}
	@RequestMapping("/content")
	@ResponseBody
	public User content() {
		User u=new User();
		u.setUsername("张三");
		u.setPassword("111");
		u.setSex("0");
	/*	List<String> list=new ArrayList<>();
		list.add("陈航");
		list.add("李四");
		list.add("王五");*/
		return u;
	}

}
