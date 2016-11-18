<%--
  Created by IntelliJ IDEA.
  User: cyy
  Date: 2016/11/18
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <!-- TemplateBeginEditable name="doctitle" -->
    <title>无标题文档</title>
    <!-- TemplateEndEditable -->
    <!-- TemplateBeginEditable name="head" -->
    <!-- TemplateEndEditable -->
</head>

<body>
<div>
    <span class="input-group-addon">用户名:</span>
    <input type="text" class="form-control" placeholder="Username" value="${currentUser.f_name}${ currentUser.l_name}" readonly="true">
</div>
<div>
    <span class="input-group-addon">邮箱:</span>
    <input type="text" class="form-control" placeholder="email" value="${ currentUser.email}" readonly="true">
</div>
<div>
    <span class="input-group-addon">性别:</span>
    <input type="text" class="form-control" placeholder="sex" value="${ currentUser.sex}" readonly="true">
</div>
<div>
    <span class="input-group-addon">联系方式:</span>
    <input type="text" class="form-control" placeholder="phonenumber" value="${ currentUser.phoneNumber}" readonly="true" >
</div>
<div>
    <a href="index.jsp">忘记密码</a>
</div>
<div>
        <button type="button" class="btn btn-default">设置信息</button>
</div>

</body>
</html>
