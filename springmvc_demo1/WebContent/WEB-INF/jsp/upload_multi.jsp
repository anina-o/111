<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/uploadmulti_submit"
		method="POST" enctype="multipart/form-data">
		请选择文件1: <input type="file" name="files" /> <br/>
		请选择文件2: <input type="file" name="files" /> <br/>
		请选择文件3: <input type="file" name="files" /> <br/>
		<input type="submit" value="多文件上传" />
	</form>
</body>
</html>