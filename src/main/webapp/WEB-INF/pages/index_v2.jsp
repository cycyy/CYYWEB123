<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>网站信息</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/adminpapapa.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 网站信息</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="/addFood" enctype="multipart/form-data">
            <div class="form-group">
                <div class="label">
                    <label>菜名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="name" value="" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>图片：</label>
                </div>
                <div class="field">
                    <a href="javascript:;" class="a-upload">
                        <input type="file" name="image" id="">点击这里上传文件
                    </a>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>种类：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="kind" value="" />
                </div>
            </div>
            <div class="form-group" >
                <div class="label">
                    <label>价格：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="price" value="" />
                    <div class="tips"></div>
                </div>
            </div>


            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body></html>