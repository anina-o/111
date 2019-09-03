package Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Result;
import entity.User;
import service.Login;

@Controller
public class loginController {
	@Resource(name="login")
	private Login login;
/*	
	@RequestMapping("/Login")
	public String login() {
		return"Login";
	}

	@RequestMapping(value="/loginsubmmit",method=RequestMethod.POST)
	public String loginsubmmit(HttpServletRequest request) {
		boolean islogin=false;
		service.login l=new service.login();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		islogin=l.login(username, password);
		
		if(islogin) {
			return"login_success";
		}else {
			return"login_faile";
		}
	}
*/	
/*	public String loginsubmmit(String username,String password,int sex) {
		boolean islogin=false;
		service.login l=new service.login();
		islogin=l.login(username, password,sex);
		
		if(islogin) {
			return"login_success";
		}else {
			return"login_faile";
		}
	}*/
	
	
/*	public String loginsubmmit(User user) {
		boolean islogin=false;
		service.login l=new service.login();
		System.out.println(user.getSex());
		islogin=l.login(user.getUsername(),user.getPassword(),user.getSex());
		
		if(islogin) {
			return"login_success";
		}else {
			return"login_faile";
		}
	}*/
	
	
	/*public String loginsubmmit(HttpServletRequest request,User user) {
		boolean islogin=false;
		service.login l=new service.login();
		request.setAttribute("name", user.getUsername());
		request.setAttribute("user", user);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sex=request.getParameter("sex");
		islogin=l.login(username, password,sex);
		
		if(islogin) {
			return"login_success";
		}else {
			return"login_faile";
		}
	}*/
	
	
	@RequestMapping("/ajax_submit")
	@ResponseBody
	public Result login_submit(String username,String password){
		//业务逻辑代码
		Login log=new Login();
		boolean result= log.execute(username, password);
		if(result){
			Result succ=new Result(0, password);
			succ.setFlag(1);
			succ.setContent("登陆成功"+username);
			return succ;
		}else{
			Result fail=new Result(0, password);
			fail.setFlag(0);
			fail.setContent("登陆失败");
			return fail;
		}
	}

}
