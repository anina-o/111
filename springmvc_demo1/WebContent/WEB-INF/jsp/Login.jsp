<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆页面</title>
</head>
<body>
	<form method="post" action= "${pageContext.request.contextPath}/loginsubmmit" name="login">
			<h1>用户登录</h1>
			用户名：<input id="username" type=text name='username'> <br>
			密码：<input id="password" type=password name='password'> <br>
			性别:<input type="radio" name='sex' value='1'>女
			<input type="radio" name='sex' value='0'>男<br>
			<input type="submit" onclick="login_submit()"  name="cmdOK" value="提  交"> &nbsp; 
			<input type="reset" name="cmdCancel" value="重  置">
		</form>
	
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
		function login_submit(){
			//异步请求的url
		var url="${pageContext.request.contextPath}/ajax_submit";
			//异步请求的参数(json格式)
			var username=$("#username").val();
			var password=$("#password").val();
		var param={username:username,password:password};
			//使用$.post方法进行异步提交
			//data为后台返回的数据
			$.post(url,param,function(data){
				var content=data.content;
				alert(content);
			});
		}
	</script>

</html>