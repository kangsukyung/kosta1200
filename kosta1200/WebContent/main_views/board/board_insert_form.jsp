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
</head>
<body>
	<!--================ Start Header Menu Area =================-->
	<header class="header_area">
    <div class="main_menu">
      <nav class="navbar navbar-expand-lg navbar-light">
        <div class="container">
          <a class="navbar-brand logo_h" href="index.html"><img src="img/logo.png" alt=""></a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
            <ul class="nav navbar-nav menu_nav ml-auto mr-auto">
              <li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                  aria-expanded="false">Shop</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="category.html">Shop Category</a></li>
                  <li class="nav-item"><a class="nav-link" href="single-product.html">Blog Details</a></li>
                  <li class="nav-item"><a class="nav-link" href="checkout.html">Product Checkout</a></li>
                  <li class="nav-item"><a class="nav-link" href="confirmation.html">Confirmation</a></li>
                  <li class="nav-item"><a class="nav-link" href="cart.html">Shopping Cart</a></li>
                </ul>
							</li>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                  aria-expanded="false">Blog</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="blog.html">Blog</a></li>
                  <li class="nav-item"><a class="nav-link" href="single-blog.html">Blog Details</a></li>
                </ul>
							</li>
							<li class="nav-item active submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                  aria-expanded="false">Pages</a>
                <ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link" href="login.html">Login</a></li>
                  <li class="nav-item"><a class="nav-link" href="#">Register</a></li>									
                  <li class="nav-item"><a class="nav-link" href="tracking-order.html">Tracking</a></li>
                </ul>
              </li>
              <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
            </ul>

            <ul class="nav-shop">
              <li class="nav-item"><button><i class="ti-search"></i></button></li>
              <li class="nav-item"><button><i class="ti-shopping-cart"></i><span class="nav-shop__circle">3</span></button> </li>
              <li class="nav-item"><a class="button button-header" href="#">Buy Now</a></li>
            </ul>
          </div>
        </div>
      </nav>
    </div>
  </header>
	<!--================ End Header Menu Area =================-->
  
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
						<form class="contents-row login_form" action="board_insert.do" id="contents-register_form" method="post" enctype="multipart/form-data">
							<div class="col-md-12 form-group">
								
								<div class="contents-form-control">
									<div class="row">
										<div class="col-md-12">
											<div class="dropdown">
												게시판 선택        
											</div>
											
											<div class="selectoption">
												<select id="select_option" name="select_option" size="1">
													<option value="선택해주세요.">선택해주세요.</option>
													<option value="방들이">방들이</option>
													<option value="노하우">노하우</option>
													<option value="질문과 답변">질문과 답변</option>
												</select>
											</div>
											
										</div>
									</div>
								</div>
							
							</div>
							<c:choose>
							<c:when test="<%request.getParameter("select_option");%> eq '방들이'">
								<section>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown">
														공간
													</div>
													
													<div class="selectoption">
														<select name="room_select">
															<option value="hi">선택해주세요.</option>
															<option value="hi">원룸</option>
															<option value="hi">안방</option>
															<option value="hi">거실</option>
															<option value="hi">서재</option>
															<option value="hi">드레스룸</option>
															<option value="hi">주방</option>
															<option value="hi">화장실</option>
															<option value="hi">베란다</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown">
														작업
													</div>
													
													<div class="selectoption">
														<select name="classification">
															<option value="hi">선택해주세요.</option>
															<option value="hi">셀프</option>
															<option value="hi">전문가</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown">
														평수
													</div>
													
													<div class="selectoption">
														<input type="text" name="space"> 평
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown">
														스타일
													</div>
													
													<div class="selectoption">
														<select name="style">
															<option value="hi">선택해주세요.</option>
															<option value="hi">모던</option>
															<option value="hi">미니멀&심플</option>
															<option value="hi">내추럴</option>
															<option value="hi">북유럽</option>
															<option value="hi">빈티지&레트로</option>
															<option value="hi">클래식&엔틱</option>
															<option value="hi">프렌치&프로방스</option>
															<option value="hi">러블리&로맨틱</option>
															<option value="hi">인더스트리얼</option>
															<option value="hi">한국&아시아</option>
															<option value="hi">유니크&믹스매치</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group_1st">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown">
														컬러
													</div>
													
													<div class="container-fluid">
														<div class="row">
															<div class="col-md-12">
																<div class="btn-group" role="group">
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: black;">검정</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="color:black; background-color: white;">흰색</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: gray;">회색</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #F4C04E;">연주황</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #F97901;">주황</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #873903;">갈색</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #F60505;">빨강</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #FA02ED;">분홍</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #FDE401;">노랑</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #51FE00;">초록</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #04C0FB;">하늘</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #0213FB;">파란</button>
																	<button class="btn btn-secondary" name="color" id="color_btn" type="button" style="background-color: #2800BA;">남색</button>
																</div>
															</div>
														</div>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown">
														예산
													</div>
													
													<div class="selectoption">
														<input type="text" name="budget"> 만원
													</div>
												
												</div>
											</div>
										</div>
									</div>
								</section>
								</c:when>
							</c:choose>
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="thumbnail_image" name="thumbnail_image" placeholder="Thumbnail image" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Thumbnail Image'">
				            </div>
				            
				            <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력해주세요." onfocus="this.placeholder = ''" onblur="this.placeholder = 'Title'">
				            </div>
				            
				            <div class="col-md-12 form-group">
								<textarea rows="50%" cols="70" class="form-control" id="contents" name="content" placeholder="내용을 입력해주세요." onfocus="this.placeholder = ''" onblur="this.placeholder = 'Contents'"></textarea>
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