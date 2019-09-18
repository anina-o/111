<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>雇员列表</title>
<script type="text/javascript">
function add(){
	location.href="${pageContext.request.contextPath}/employee/add";
}
</script>
</head>
<body>
	<style type="text/css">
	th{
		width:200px
	}
	td{
		text-align:center
	}
	</style>
	<h1 style="padding-left: 40%">雇员列表</h1>
	<hr />
	<input onclick="add()" style="margin-left: 20%;" type="button" value="新增雇员"><br/>
	<table border="1px" style="margin-left: 20%;">
	
		<tr><th>用户名</th><th>性别</th><th>年龄</th><th>所属部门</th></tr>
		<c:forEach items="${employees}" var="item">
			<tr><th>${item.username}</th><th>
	
			<c:if test="${item.sex==1}">
				男
			</c:if>
			<c:if test="${item.sex==0}">
				女
			</c:if>
			</th><th>${item.age}</th><th>${item.dept.deptname}</th></tr>
		</c:forEach>
	</table>
</body>
</html>