<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Account</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Curabitur Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
 <script src="js/jquery-1.11.1.min.js"></script>
  <script src="js/bootstrap.js"> </script>
  <!---- start-smoth-scrolling---->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
 <script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>
<!---End-smoth-scrolling---->

</head>
<body>
		<!-- start-header section-->
			<div class="header">
				<div class="container">
				     <div class="top-header">
						<div class="phone">
							<ul>
								<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span></li>
								<li><p>+4758 655 5947</p></li>
							</ul>
						</div>
						<div class="logo">
							<h1><a href="index.html">curabitur</a></h1>
						</div>
						<div class="header-right">
						<div class="login">
							<c:choose>
								<c:when test="${empty currentUser.firstName}">
									<a href="login.html">登录</a>
								</c:when>
								<c:otherwise>
									<a href="index.html">${currentUser.firstName}</a>
								</c:otherwise>
							</c:choose>
						</div>
						<div class="cart box_1">
							<a href="checkout.html">
								<h3> <span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span> items)<img src="images/bag.png" alt=""></h3>
							</a>	
							<p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
							<div class="clearfix"> </div>
						</div>
				</div>
		
						<div class="clearfix"></div>
					</div>	
				</div>
			</div>
		<!-- end-header section-->
		<!--start-banner-->
			<div class="banner ban1">
				<div class="container">
					<div class="top-menu">
					<span class="menu"><img src="images/nav.png" alt=""/> </span>
						<ul>
							<li><a  href="index.html">home</a></li>
							<li><a  href="about.html">about</a></li>
							<li><a  href="menu.html">menus</a></li>
							<li><a  href="gallery.html">gallery</a></li>
							<li><a  href="events.html">events</a></li>
							<li><a  href="contact.html">contact</a></li>
						</ul>
						<!-- script for menu -->
									
							 <script>
							 $("span.menu").click(function(){
							 $(".top-menu ul").slideToggle("slow" , function(){
							 });
							 });
							 </script>
						<!-- //script for menu -->
					</div>
					</div>	
			</div>
		<!--end-banner-->
			<div class="banner-bottom">
				<div class="container">
				<div class="droop-down">
					<div class="col-md-3 droop">
							<div class="sort-by">
		            <label>City</label>
		            <select>
		                            <option value="">
		                   Columbia              </option>
		                            <option value="">
		                 Gobaret              </option>
		                            <option value="">
		                   Florissant               </option>
										<option value="">
		                   Fergeeson               </option>
						   
		            </select>
		        </div>
					</div>
					<div class="col-md-3 droop">
							<div class="sort-by">
		            <label>Name</label>
		            <select>
		                            <option value="">
		                  Cocoon Hotel              </option>
		                            <option value="">
		                   Chinese Room               </option>
		                            <option value="">
		                   Royal Orchid Central              </option>
						         <option value="">
		                   Royal Orchid Central              </option>
						         <option value="">
		                   Royal Orchid Central              </option>
		            </select>
		        </div>
					</div><div class="col-md-3 droop">
							<div class="sort-by">
		            <label>Order</label>
		            <select>
		                            <option value="">
		                    Arugula              </option>
		                            <option value="">
		                  Baking Soda              </option>
		                            <option value="">
		                    Cilantro              </option>
							  <option value="">
		                Chicken              </option>
							  <option value="">
		                    Squash             </option>
		            </select>
		        </div>
					</div>
					<div class="col-md-3 search">
					<form>
					<input type="submit" value="search">
					</form>				
					</div>
					<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="content">
 <!-- registration -->
	<div class="main-1">
		<div class="container">
			<div class="register">
		  	  <form action="/change_message" method="post" >
				 <div class="register-top-grid">
					<h3>用户信息</h3>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>First Name<label>*</label></span>
						<input type="text"  name="firstName" value="${}" >
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s" >
						<span>Last Name<label>*</label></span>
						<input type="text"  name="last_name"
							   value="${currentUser.l_name}" >
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>Email Address<label>*</label></span>
						 <input type="text" name="email"
								value="${currentUser.email}" readonly="true">
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>Phone Number<label>*</label></span>
						 <input type="text"  name="phone_number"
						 <c:choose>
						 <c:when test="${empty currentUser.phoneNumber}">
								value="" >
						 </c:when>
						 <c:otherwise>
								value="${currentUser.phoneNumber}" >
						 </c:otherwise>
						 </c:choose>
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>Sex<label>*</label></span>
						 <input type="text"  name="sex"
						 <c:choose>
						 <c:when test="${empty currentUser.sex}">
								value="" >
						 </c:when>
						 <c:otherwise>
							 value="${currentUser.sex}" >
						 </c:otherwise>
						 </c:choose>
					 </div>
					 <div class="clearfix"> </div>
					 <a class="news-letter" href="#">

					 </a>
				 </div>
				     <div class="register-bottom-grid">
						    <h3>修改密码</h3>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							 <span>Old Password<label>*</label></span>
							 <input type="text" name="old_password">
						 </div>
							 <div class="wow fadeInLeft" data-wow-delay="0.4s">
								<span>New Password<label>*</label></span>
								<input type="text" name="new_password1">
							 </div>
							 <div class="wow fadeInRight" data-wow-delay="0.4s">
								<span>Confirm Password<label>*</label></span>
								<input type="text" name="new_password2">
							 </div>
					 </div>

				<div class="clearfix"> </div>
				<div class="register-but">
					   <input type="submit" value="submit">
					   <div class="clearfix"> </div>
				</div>
			  </form>
		   </div>
		 </div>
	</div>
<!-- registration -->

<div class="specials-section">
				<div class="container">
					<div class="col-md-3 specials">
					<h3>about</h3>
					<p>Morbi pretium gravida justo nec ultrices. Ut et facilisis justo. Fusce ac turpis eros, vel molestie lectus.feugiat velit velit non turpis</p>
				</div>
				<div class="col-md-3 specials1">
				<h3>specials</h3>
				<ul>
					<li><a href="#">New Listing Sign-Up</a></li>
					<li><a href="#">Consectetur adipiscing</a></li>
					<li><a href="#">Integer molestie lorem</a></li>
					<li><a href="#">Facilisis in pretium nisl</a></li>
				</ul>
				</div>
			<div class="col-md-3 specials1">
			<h3>recipes</h3>
			<ul>
				<li><a href="#">Integer molestie lorem</a></li>
				<li><a href="#">Integer molestie lorem</a></li>
				<li><a href="#">Consectetur adipiscing</a></li>
				<li><a href="#">Lorem ipsum dolor sit</a></li>
			</ul>
			</div>
			<div class="col-md-3 specials1">
			<h3>social</h3>
			<ul>
				<li><a href="#">facebook</a></li>
				<li><a href="#">twitter</a></li>
				<li><a href="#">google</a></li>
				<li><a href="#">viemo</a></li>
			</ul>
			</div>
			<div class="clearfix"></div>
			</div>
			</div>
	</div>
	<div class="footer-section">
					<div class="container">
						<div class="footer-top">
						<p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
					</div>
					<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


					</div>
					</div>


	
</body>
</html>
	