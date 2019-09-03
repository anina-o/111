<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello word!  你好啊，我是陈航
	<input type="button" id="btn" onclick="getContent()" value="获取内容">
	
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
<script>
	function getContent(){
		var url="${pageContext.request.contextPath}/abc/content"
		//ajax传递参数
		var param={};
		//发送ajax请求
		$.post(url,param,function(data){
			alert(data.username+"  "+data.password+" ,"+data.sex);
		});
	}
</script>
</html>