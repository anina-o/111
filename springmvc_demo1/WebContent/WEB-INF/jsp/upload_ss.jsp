<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>图片上传成功</h1><h1>需要时可以<a href="${pageContext.request.contextPath}/download?${filename}">下载</a>该图片</h1>
<img src="${pageContext.request.contextPath}/upload/${filename}">
</body>
</html>