<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>마이페이지 프로필</title>
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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/member_mypage.css">
</head>
<body>
 	<jsp:include page="../header.jsp"></jsp:include>
	<!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>마이페이지</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">마이페이지</a></li>
              <li class="breadcrumb-item active" aria-current="page">프로필</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->


	<!-- ================ category section start ================= -->		  
  <section class="section-margin--small mb-5">
    <div class="container">
      <div class="row">
        <div class="col-xl-3 col-lg-4 col-md-5">
          <div class="sidebar-categories">
            <div class="head">프로필</div>
            <ul class="main-categories">
					<div>
					<c:if test="${member.member_profile!=null}">
						<c:set var="head" value="${fn:substring(member.member_profile,0, fn:length(member.member_profile)-4) }"></c:set>
						<c:set var="pattern" value="${fn:substring(member.member_profile, fn:length(head)+1, fn:length(member.member_profile))}"></c:set>
						<c:choose>
							<c:when test="${pattern=='jpg' || pattern=='png' || pattern=='gif' }">
								<a href="${pageContext.request.contextPath}/Member/MemberUpdate_form.do"><img class="author_img rounded-circle" src="/kosta1200/upload/${member.member_profile}" alt="" width="130" height="130"></a>
							</c:when>
							<c:otherwise>
								<c:out value="NO IMAGE"></c:out>
							</c:otherwise>
						</c:choose>					
					</c:if>
					<c:if test="${member.member_profile ==null}">
						<a href="${pageContext.request.contextPath}/Member/MemberUpdate_form.do"><img class="author_img rounded-circle" src="${pageContext.request.contextPath}/upload/member_basic.png" alt="" width="130" height="130"></a>
					</c:if>
							<h4 style=" padding-top: 10px;">${member.member_nickname}님 프로필</h4>
							<div class="social_icon">
							<br>
								<a href="#"> <i class="ti-heart"> 좋아요</i></a> 
								<a href="#"> <i class="fab fa-twitter"> 팔로잉</i></a> 
							</div>
					</div>
            </ul>
          </div>
          <div class="sidebar-filter">
            <div class="top-filter-head">카테고리</div>
 				<ul class="list cat-list mypage_category_list">
					<li><a href="${pageContext.request.contextPath}/Member/Member_Mypage.do" class="d-flex justify-content-between"><p>프로필</p></a></li>
					<li><a href="#" class="d-flex justify-content-between"><p>주문목록</p></a></li>
					<li><a href="${pageContext.request.contextPath}/Member/MemberUpdate_form.do" class="d-flex justify-content-between"><p>설정</p></a></li>
					<li><a href="${pageContext.request.contextPath}/Member/ConstractorSignup_form.do" class="d-flex justify-content-between"><p>전문가 신청</p></a></li>
					<li><a href="${pageContext.request.contextPath}/Member/VendorSignup_form.do" class="d-flex justify-content-between"><p>판매자 신청</p></a></li>
					<c:if test="${member.member_rating eq '2' }">
					<li><a href="${pageContext.request.contextPath}/Product/ProductListAction.do" class="d-flex justify-content-between"><p>마이스토어</p></a></li>			
					</c:if>
				</ul>
          </div>
        </div>
        
        <div class="col-xl-9 col-lg-8 col-md-7">
          <section class="lattest-product-area pb-40 category-list">
      	    <div class="filter-bar d-flex flex-wrap align-items-center"><h2>방들이</h2></div>
            <div class="row">
              <c:forEach items="${room }" var="board" >
              <div class="col-md-6 col-lg-4">
                <div class="card text-center card-product">
 	                <a href='#'><img class="card-img" src="/kosta1200/upload/${board.board_thumbnail}" alt=""></a>
                </div>
              </div>
              </c:forEach>
            </div>
          </section>
          
          <section class="lattest-product-area pb-40 category-list">
          <div class="filter-bar d-flex flex-wrap align-items-center"><h2>노하우</h2></div>
            <div class="row">
            <c:forEach items="${knowhow }" var="knowhow" >
              <div class="col-md-6 col-lg-4">
               	    <div class="card text-center card-product">
 	               	 <a href='#'><img class="card-img" src="/kosta1200/upload/${knowhow.board_thumbnail}" alt=""></a>
                	</div>
                </div>
                
                </c:forEach>
              </div>
            </section>
        
        	</div>
        	</div>
        	</div>
     </section>

 <jsp:include page="../footer.jsp"></jsp:include>


  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nouislider/nouislider.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>
</body>
</html>