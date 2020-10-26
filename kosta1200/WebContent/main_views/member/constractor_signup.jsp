<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/member_idpwfound.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/member_signup.css">
</head>

<body>
	<jsp:include page="../header.jsp"/>	
	
  <!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1 >전문가 신청</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/Member/Member_Mypage.do">마이페이지</a></li>
              <li class="breadcrumb-item active" aria-current="page">전문가 신청</li>
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
				<div class="col-lg-6">
					<div class="login_box_img">
						<div class="hover">
							<h4 style="margin-bottom: 50px;">전문가 가입 신청</h4>
							<p>오늘의방과 함께하기 어렵지 않아요. 몇 가지 단계만 진행하시면 고객들을 만나보실 수 있어요!</p>
							<a class="button button-account" href="#">회사소개 보러가기</a>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3 >전문가 신청</h3>
						<form class="row login_form" action="${pageContext.request.contextPath}/Member/ConstractorSignup_Action.do" id="register_form" >
							<input type="hidden" name="seq" value="${member.member_seq }">
							<div class="col-md-12 form-group"><input type="text" class="form-control" id="name" name="name" placeholder="상호명" onfocus="this.placeholder = ''" onblur="this.placeholder = '상호명'"></div>
							<div class="col-md-12 form-group"><input type="text" class="form-control" style="margin-top: 50px;" id="bname" name="bname" placeholder="사업자대표명" onfocus="this.placeholder = ''" onblur="this.placeholder = '사업자대표명'"></div>
							<div class="col-md-12 form-group member_signup"><input type="text" class="form-control-member_singup"  style="margin-top: 50px;" id="memberAddress" name="memberAddress" placeholder="사업지주소" onfocus="this.placeholder = ''" onblur="this.placeholder = '사업지주소'"><button type="button" onclick="openZipSearch()" style="margin-top: 55px;">주소찾기</button></div>


							<div class="col-md-10 form-group">
								<button type="submit" value="submit" class="button button-register w-100" style="margin-top: 80px; background: #384aeb;">전문가 신청</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->
	<jsp:include page="../footer.jsp"/>	
  
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>  
  <script src="${pageContext.request.contextPath}/main_resource/js/member_signup.js"></script>  
  <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  
</body>
</html>