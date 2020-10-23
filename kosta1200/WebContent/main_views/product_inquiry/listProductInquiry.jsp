<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Aroma Shop - Blog</title>
	<link rel="icon" href="img/Fevicon.png" type="image/png">
  <link rel="stylesheet" href="../../main_resource/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="../../main_resource/vendors/fontawesome/css/all.min.css">
	<link rel="stylesheet" href="../../main_resource/vendors/themify-icons/themify-icons.css">
	<link rel="stylesheet" href="../../main_resource/vendors/linericon/style.css">
  <link rel="stylesheet" href="../../main_resource/vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="../../main_resource/vendors/owl-carousel/owl.carousel.min.css">

  <link rel="stylesheet" href="../../main_resource/css/style.css">
  <link rel="stylesheet" href="../../main_resource/css/product_inquiry.css">
  
</head>
<body>
<!-- 	private int pi_seq; -->
<!-- 	private String pi_type; -->
<!-- 	private String pi_content; -->
<!-- 	private String pi_answer; -->
<!-- 	private int product_seq; -->
<!-- 	private int member_seq; -->
	<div class="comments-area" id="product-inquiry-list">
		<h4>상품문의 목록</h4>
		<div class="comment-list">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="../../main_resource/img/blog/c1.jpg" alt="">
					</div>
					<div class="desc">
<!-- 						<h5> -->
<!-- 							<a href="#">문의문의나문희</a> -->
<!-- 						</h5> -->
						<p class="date">${product}</p>
						<p class="comment">${pi_content}</p>
					</div>
				</div>
				<div class="reply-btn">
					<a href="#" class="btn-reply text-uppercase">답변</a>
				</div>
			</div>
		</div>
		
		<!-- 위쪽: 고객의 문의 // 밑쪽: 운영사측 답변 -->
		
		<div class="comment-list left-padding">
			<div class="single-comment justify-content-between d-flex">
				<div class="user justify-content-between d-flex">
					<div class="thumb">
						<img src="../../main_resource/img/blog/c2.jpg" alt="">
					</div>
					<div class="desc">
						<h5>
							<a href="#">운영진 : 나다.</a>
						</h5>
						<p class="date">날짜가 오는 부분2</p>
						<p class="comment">Never say goodbye till the end comes!</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="../../main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
 	<script src="../../main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
 	<script src="../../main_resource/vendors/skrollr.min.js"></script>
 	<script src="../../main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
 	<script src="../../main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
 	<script src="../../main_resource/vendors/jquery.ajaxchimp.min.js"></script>
 	<script src="../../main_resource/vendors/mail-script.js"></script>
 	<script src="../../main_resource/js/main.js"></script>
</body>
</html>