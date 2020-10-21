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
					<h1>회원가입</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">커뮤니티</a></li>
              <li class="breadcrumb-item active" aria-current="page">로그인</li>
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
					<div class="login_box_img" class="member_signup_height">
						<div class="hover">
							<h4>이미계정이 있습니까?</h4>
							<p>Already have an account?</p>
							<a class="button button-account" href="login.html">로그인</a>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3 >계정만들기</h3>
						<form class="row login_form" action="${pageContext.request.contextPath}/Member/MemberSignup_Action.do" id="register_form" >
							<div class="col-md-12 form-group member_signup"><input type="text" class="form-control-member_singup" id="memberId" name="memberId" placeholder="아이디" onfocus="this.placeholder = ''" onblur="this.placeholder = '아이디'">
							<button type="button" class="memberId_btn" >중복확인</button></div>
    			          	<font class="member_font_padding" id="id_check" size="2"></font>
							<div class="col-md-12 form-group member_signup"><input type="text" class="form-control-member_singup" id="memberNickname" name="memberNickname" placeholder="별명" onfocus="this.placeholder = ''" onblur="this.placeholder = '별명'">
							<button type="button" class="memberName_btn">중복확인</button></div>
							<div class="col-md-12 form-group"><input type="text" class="form-control" id="memberName" name="memberName" placeholder="이름" onfocus="this.placeholder = ''" onblur="this.placeholder = '이름'"></div>
							<div class="col-md-12 form-group member_signup"><input type="text" class="form-control-member_singup" id="memberAddress" name="memberAddress" placeholder="주소" onfocus="this.placeholder = ''" onblur="this.placeholder = '주소'"><button type="button" onclick="openZipSearch()">주소찾기</button></div>
							
            				<div class="col-md-12 form-group"><input type="tel" class="form-control"  id="memberPhone" name="memberPhone" placeholder="전화번호" onfocus="this.placeholder = ''" onblur="this.placeholder = '전화번호'"></div>
    			          	<font class="member_font_padding" id="phone_check" size="2"></font>
							<div class="col-md-12 form-group"><input type="text" class="form-control" id="memberEmail" name="memberEmail" placeholder="이메일 주소" onfocus="this.placeholder = ''" onblur="this.placeholder = '이메일 주소'"></div>
    			          	<font class="member_font_padding" id="mail_check" size="2"></font>
	            			<div class="col-md-12 form-group"><input type="password" class="form-control" class="memberPassword" id="memberPassword" name="memberPassword" placeholder="비밀번호" onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호'"></div>
    			          	<font class="member_font_padding" id="password_check" size="2"></font>
    			          	<div class="col-md-12 form-group"><input type="password" class="form-control" class="memberPassword" id="userPwChk" name="memberPassword" placeholder="비밀번호확인" onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호확인'"></div>
    			          	<font class="member_font_padding" id="chkNotice" size="2"></font>
							<div class="col-md-10 form-group">
								<button type="submit" value="submit" class="button button-register w-100">회원가입</button>
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