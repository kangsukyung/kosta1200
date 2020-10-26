<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

</head>
	<jsp:include page="../header.jsp"/>
	<!--================ End Header Menu Area =================-->
  
	<!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>고객센터</h1>
					<br>
          	  <h5>운영시간 : 평일 09:00 ~ 18:00 (주말 & 공휴일 제외)</h5>
          	  <br>
			<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">고객센터</a></li>
              <li class="breadcrumb-item active" aria-current="page"> 1:1문의</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->
  
  
  <!--================Tracking Box Area =================-->
  <section class="tracking_box_area section-margin--small">
      <div class="container">
          <div class="tracking_box_inner" style="padding-left: 150px;">
              <p style="font-size: 20px;">코로나19로 인해 고객센터를 잠정적으로 축소하여 운영중입니다.전화 및 1:1문의하기 상담이 지연되고 있는 점 너른 양해 부탁드립니다.
			순차적으로 최대한 빠르게 안내해 드리도록 노력하겠습니다.</p>
			<br>
              <form class="row tracking_form" action="${pageContext.request.contextPath}/Member/OneInquiry_Action.do?seq=${member.member_seq }" method="post">
                  <div class="col-md-12 form-group">
                      <input type="text" class="form-control" id="title" name="title" placeholder="제목" onfocus="this.placeholder = ''" onblur="this.placeholder = '제목'">
                  </div>
                  <div class="col-md-12 form-group">
                   <textarea class="form-control" id="contents" name="contents" style="height: 400px;"></textarea>
                  </div>
                  <div class="col-md-12 form-group">
                      <button type="submit" value="submit" class="button button-tracking" style="width: 100%;">문의하기</button>
                  </div>
              </form>
          </div>
      </div>
  </section>
  <!--================End Tracking Box Area =================-->



  <!--================ Start footer Area  =================-->	
  <jsp:include page="../footer.jsp"/>
  
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nouislider/nouislider.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>
  
</html>