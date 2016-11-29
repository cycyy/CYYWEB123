<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/adminpapapa.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
</head>
<body>
<form method="post" action="">
  <div class="panel admin-panel">
    <div class="padding border-bottom">
      <ul class="search">
        <li>
        </li>
      </ul>
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th width="120">ID</th>
        <th>姓</th>
        <th>名</th>
        <th>电话</th>
        <th>邮箱</th>
        <th >性别</th>
        <th>操作</th>       
      </tr>
      <c:forEach items="${userEntityList}" var="user" varStatus="status">
        <tr>
          <td><input type="checkbox" name="id[]" value="1" />
              ${status.index}</td>
          <td>${user.firstName}</td>
            <td>${user.lastName}</td>
          <td>${user.phoneNumber}</td>
          <td>${user.email}</td>
           <td>${user.sex}</td>
          <td><div class="button-group"> <a class="button border-red" href="DeleteUser?id=${user.id}"><span class="icon-trash-o"></span> 删除</a> </div></td>
        </tr>
      </c:forEach>
    </table>
  </div>
</form>
<script type="text/javascript">


$("#checkall").click(function(){ 
  $("input[name='id[]']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})

function DelSelect(){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false; 		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
}

</script>
</body></html>