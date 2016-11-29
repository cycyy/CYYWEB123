<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link href="css/public.css" type="text/css" rel="stylesheet">
    <link href="css/houtai.css" type="text/css" rel="stylesheet">
    <link href="css/smartMenu.css" type="text/css" rel="stylesheet">
    <title>后台管理</title>
</head>
<body>
<div id="admin">
    <div class="ad-menu" id="ad-menu">
        <div class="ad-logo"><img src="images/m-logo.png" height="103" width="130"></div>
        <div class="ad-list">
            <ul>
                <li>
                    <div class="li-item"><em class="scm li-ico ic1"></em>用户管理<span class="scm arrow"></span></div>
                    <dl>
                        <dd>
                        </dd>
                    </dl>
                </li>
                <li>
                    <a href="index_v1.jsp"><div class="li-item" <em class="scm li-ico ic2"></em>菜单管理<span class="scm arrow"></span></div></a>
        </li>
        <li>

        </li>
        </ul>
    </div>
</div>
<div class="ad-comment-box" id="ad-comment">
    <div class="ad-top-comment">
        <div class="ad-message">
            <div class="ad-top-left">
                <div class="ad-change-btn"><a id="ad-list" href="javascript:;" class="scm ad-list-btn"></a></div>
                <div class="ad-search-box clear">
                    <div class="ad-search-sel">

                    </div>
                    <div class="ad-search-cha">
                    </div>
                </div>
            </div>
            <div class="ad-top-right">
                <div class="ad-notice">
                    <ul>
                        <li>
                            <a href="javascript:;" class="scm nt1"><span class="scm nt-count dot">12</span></a>
                        </li>
                        <li>
                            <a href="javascript:;" class="scm nt2"><span class="scm nt-count dot">12</span></a>
                        </li>
                        <li>
                            <a href="javascript:;" class="scm nt3"><span class="scm nt-count dot">12</span></a>
                        </li>
                    </ul>
                </div>
                <div class="ad-welcom">

                    <div class="ad-wel-text">


                    </div>
                </div>
            </div>
        </div>
        <div class="ad-main-nav-box">
            <ul id="breadcrumbs-three">
                <li title="首页"><a href="javascript:;" class="dot">首页</a></li>
            </ul>
            <a href="javascript:;" class="scm jian-a J_mainLeft main-sel pre"></a>
            <div class="ad-main-wraper .J_menuItems">
                <ul class="ad-main-list" id="ad-main">
                </ul>
            </div>
            <a href="javascript:;" class="scm jian-a J_mainRight next"></a>
        </div>
        <div class="ad-sub-nav-box content-tabs">
            <!-- <div class="ad-sub-record">历史记录</div> -->
            <a href="javascript:;" class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>
            <div class="ad-sub-wraper page-tabs J_menuTabs">
                <ul class="ad-sub-list page-tabs-content">
                    <li class="active J_menuTab" data-id="index_v0.html">首页</li>
                </ul>
            </div>
            <a href="javascript:;" class="scm jian-a next j_tabBg J_tabRight"></a>
        </div>
    </div>
    <div class="ad-main-comment J_mainContent" id="ad-iframe">
        <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="index_v0.html" frameborder="0" data-id="index_v0.html" seamless></iframe>
    </div>
</div>
</div>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/contabs.js"></script>
<script type="text/javascript" src="js/maintabs.js"></script>
<script type="text/javascript" src="js/jquery-smartMenu-min.js"></script>
<script type="text/javascript" src="js/jquery.nicescroll.min.js"></script>
<script type="text/javascript">
    $(function(){
        $(".ad-menu").niceScroll({cursorborder:"0 none",cursorcolor:"#1a1a19",cursoropacitymin:"0",boxzoom:false});
    })
</script>
</body>
</html>