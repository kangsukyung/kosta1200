<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>마이스토어 - 상품조회</title>
<link rel="icon" href="${pageContext.request.contextPath}/main_resource/img/Fevicon.png" type="image/png">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/fontawesome/css/all.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/themify-icons/themify-icons.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/linericon/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.theme.default.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/member_mypage.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/ksk_style.css">
</head>
<body>	
	<jsp:include page="../header.jsp"/>
	<!-- ================ start banner area ================= -->
	<section class="blog-banner-area" id="blog">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>나의 스토어</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="#">홈</a></li>
							<li class="breadcrumb-item active" aria-current="page">나의스토어</li>
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- ================ end banner area ================= -->



	<!--================Blog Area =================-->
	<section
		class="blog_area single-post-area py-80px section-margin--small">
		<div class="container">
			<div class="row">
				<div class="col-lg-4">
					<div class="blog_right_sidebar">
						<aside class="single_sidebar_widget author_widget">
							<img class="author_img rounded-circle" src="${pageContext.request.contextPath}/main_resource/img/member/member_basicimage.png"alt="">
							
							<h4>Charlie Barber</h4>
							<p>Senior blog writer</p>
							<div class="social_icon">
								<a href="#"> <i class="fab fa-facebook-f"></i>
								</a> <a href="#"> <i class="fab fa-twitter"></i>
								</a> <a href="#"> <i class="fab fa-github"></i>
								</a> <a href="#"> <i class="fab fa-behance"></i>
								</a>
							</div>
							<p>Boot camps have its supporters andit sdetractors. Some
								people do not understand why you should have to spend money on
								boot camp when you can get. Boot camps have itssuppor ters
								andits detractors.</p>
						</aside>
						<aside class="single_sidebar_widget ads_widget">
							<a href="#"> <img class="img-fluid" src="img/blog/add.jpg"
								alt="">
							</a>
							<div class="br"></div>
						</aside>
						<aside class="single_sidebar_widget post_category_widget">
							<h4 class="widget_title">Post Catgories</h4>
							<ul class="list cat-list">
								<li><a href="#" class="d-flex justify-content-between">
										<p>프로필</p>
								</a></li>
								<li><a href="#" class="d-flex justify-content-between">
										<p>주문목록</p>
								</a></li>
								<li><a href="#" class="d-flex justify-content-between">
										<p>설정</p>
								</a></li>
								<li><a href="#" class="d-flex justify-content-between">
										<p>전문가신청</p>
								</a></li>
								<li><a href="#" class="d-flex justify-content-between">
										<p>판매자신청</p>
								</a></li>
							</ul>
						</aside>						
						<aside class="single-sidebar-widget tag_cloud_widget">
							<h4 class="widget_title">Tag Clouds</h4>
							<ul class="list">
								<li><a href="#">Technology</a></li>
								<li><a href="#">Fashion</a></li>
								<li><a href="#">Architecture</a></li>
								<li><a href="#">Fashion</a></li>
								<li><a href="#">Food</a></li>
								<li><a href="#">Technology</a></li>
								<li><a href="#">Lifestyle</a></li>
								<li><a href="#">Art</a></li>
								<li><a href="#">Adventure</a></li>
								<li><a href="#">Food</a></li>
								<li><a href="#">Lifestyle</a></li>
								<li><a href="#">Adventure</a></li>
							</ul>
						</aside>
					</div>
				</div>
				<div class="ProductList" id="ProductList_box">
					<div class="comments-area" id="ProductList_area">
						<h4>등록한 상품 목록</h4>
						<div class="single-comment justify-content-between d-flex" id="ProductList_detail">
							<div class="user justify-content-between d-flex">
								<!-- <div class="thumb">
									<img src="../../main_resource/img/blog/c1.jpg" alt="">
								</div> -->
								
								<div class="desc">
										<c:forEach var="productVO" items="${list}">
										<div>
											<c:if test="${productVO.product_fname != null }">
												<c:set var="head" value="${fn:substring(productVO.product_fname, 0, fn:length(productVO.product_fname)-4) }"></c:set>
												<c:set var="pattern" value="${fn:substring(productVO.product_fname, fn:length(head) +1, fn:length(productVO.product_fname)) }"></c:set>
					
													<c:choose>
														<c:when test="${pattern == 'png' || pattern == 'gif' || pattern == 'PNG' }">
														<img src="/kosta1200/upload/${head }_small.${pattern}">
														</c:when>
													<c:otherwise>
														<c:out value="NO IMAGE"></c:out>
													</c:otherwise>
													</c:choose>
											</c:if>
									<div id="product_list_in_list">		
										<label>글번호 : ${productVO.board_seq }<br></label>									
										<label>상품명 : ${productVO.product_name }<br></label>
										<label>가   격 : ${productVO.product_price }<br></label>
										<label>대분류 : ${productVO.product_lcategory }<br></label>
										<label>소분류 : ${productVO.product_scategory }<br></label>
										<a href="ProductUpdateActionForm.do?product_seq=${productVO.product_seq}">수정하기</a>
										<a href="ProductDeleteAction.do?product_seq=${productVO.product_seq}">삭제하기</a>
										</div>
										</c:forEach>
									</div>
								</div>
								
							</div>
						</div>



					</div>
			</div>
		</div>
	</div>
	</section>
	<!--================Blog Area =================-->



	<jsp:include page="../footer.jsp"></jsp:include>


	<script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>
</body>
</html>
