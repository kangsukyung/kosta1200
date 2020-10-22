<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Aroma Shop - Login</title>
  <link rel="icon" href="${pageContext.request.contextPath}/main_resource/img/Fevicon.png" type="image/png">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/fontawesome/css/all.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/themify-icons/themify-icons.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/linericon/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/nice-select/nice-select.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/nouislider/nouislider.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/board.css">
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/js/board.js"></script>
</head>
<body>
  
  <!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>글 등록</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">글 등록</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->
  
  <!--================Login Box Area =================-->
	<section class="login_box_area section-margin">
		<div class="container">
			<div class="row">
				<div class="contents-col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3>필수 입력 사항</h3>
						<form class="contents-row login_form" action="board_insert.do" id="contents-register_form" method="post"  enctype="multipart/form-data">
							<div class="col-md-12 form-group">
								
								<div class="contents-form-control">
									<div class="row">
										<div class="col-md-12">
											<div class="dropdown">
												게시판 선택        
											</div>
											
											<div class="selectoption">
												<select id="select_option" name="classification" size="1">
													<option value="">선택해주세요.</option>
													<option value="bang">방들이</option>
													<option value="노하우">노하우</option>
													<option value="질문과 답변">질문과 답변</option>
												</select>
											</div>
											
										</div>
									</div>
								</div>
							
							</div>
							
							<div class="select33" id="select3">
								<h1>어떤식으로 나오나요.</h1>
							</div>
					
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="thumbnail_image" name="thumbnail_image" placeholder="Thumbnail image">
				            </div>
				            
				            <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력해주세요.">
				            </div>
				            
				            <div class="col-md-12 form-group">
								<textarea rows="50%" cols="70" class="form-control" id="contents" name="content" placeholder="내용을 입력해주세요."></textarea>
							</div>
							
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-register w-100">글 등록</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->



  <!--================ Start footer Area  =================-->	
	<footer>
		<div class="footer-area footer-only">
			<div class="container">
				<div class="row section_gap">
					<div class="col-lg-3 col-md-6 col-sm-6">
						<div class="single-footer-widget tp_widgets ">
							<h4 class="footer_title large_title">Our Mission</h4>
							<p>
								So seed seed green that winged cattle in. Gathering thing made fly you're no 
								divided deep moved us lan Gathering thing us land years living.
							</p>
							<p>
								So seed seed green that winged cattle in. Gathering thing made fly you're no divided deep moved 
							</p>
						</div>
					</div>
					<div class="offset-lg-1 col-lg-2 col-md-6 col-sm-6">
						<div class="single-footer-widget tp_widgets">
							<h4 class="footer_title">Quick Links</h4>
							<ul class="list">
								<li><a href="#">Home</a></li>
								<li><a href="#">Shop</a></li>
								<li><a href="#">Blog</a></li>
								<li><a href="#">Product</a></li>
								<li><a href="#">Brand</a></li>
								<li><a href="#">Contact</a></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-2 col-md-6 col-sm-6">
						<div class="single-footer-widget instafeed">
							<h4 class="footer_title">Gallery</h4>
							<ul class="list instafeed d-flex flex-wrap">
								<li><img src="img/gallery/r1.jpg" alt=""></li>
								<li><img src="img/gallery/r2.jpg" alt=""></li>
								<li><img src="img/gallery/r3.jpg" alt=""></li>
								<li><img src="img/gallery/r5.jpg" alt=""></li>
								<li><img src="img/gallery/r7.jpg" alt=""></li>
								<li><img src="img/gallery/r8.jpg" alt=""></li>
							</ul>
						</div>
					</div>
					<div class="offset-lg-1 col-lg-3 col-md-6 col-sm-6">
						<div class="single-footer-widget tp_widgets">
							<h4 class="footer_title">Contact Us</h4>
							<div class="ml-40">
								<p class="sm-head">
									<span class="fa fa-location-arrow"></span>
									Head Office
								</p>
								<p>123, Main Street, Your City</p>
	
								<p class="sm-head">
									<span class="fa fa-phone"></span>
									Phone Number
								</p>
								<p>
									+123 456 7890 <br>
									+123 456 7890
								</p>
	
								<p class="sm-head">
									<span class="fa fa-envelope"></span>
									Email
								</p>
								<p>
									free@infoexample.com <br>
									www.infoexample.com
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="footer-bottom">
			<div class="container">
				<div class="row d-flex">
					<p class="col-lg-12 footer-text text-center">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
				</div>
			</div>
		</div>
	</footer>
	<!--================ End footer Area  =================-->



  
</body>
</html>