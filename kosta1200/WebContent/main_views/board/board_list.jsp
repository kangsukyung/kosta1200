<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Aroma Shop - Blog</title>
  <link rel="icon" href="${pageContext.request.contextPath}/main_resource/img/Fevicon.png" type="image/png">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/fontawesome/css/all.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/themify-icons/themify-icons.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/linericon/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/board_list.css">
</head>
<body>
<!--================ Start Header Menu Area =================-->
<section>
	<jsp:include page="../header.jsp"></jsp:include>
</section>
<!--================ End Header Menu Area =================-->


  <!-- ================ start banner area ================= -->	
  <section class="blog-banner-area" id="blog">
    <div class="container h-100" id="main-banner">
      <div class="blog-banner">
        <div class="text-center">
          <h1>
          TodayRoom
		  </h1>
          <nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">ø¿¥√¿«</a></li>
              <li class="breadcrumb-item active" aria-current="page">πÊ</li>
            </ol>
          </nav>
        </div>
      </div>
    </div>
  </section>
  <!-- ================ end banner area ================= -->

  <!--================Blog Area =================-->
  <section class="blog_area" id='hw-blog'>
      <div class="container">
          <div class="row">
          	  <div class="col-lg-4" id="board_list_category">
                  <div class="blog_right_sidebar">
                      <aside class="single_sidebar_widget post_category_widget">
                          <h4 class="widget_title">Post Catgories</h4>
                          <ul class="list cat-list">
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Technology</p>
                                      <p>37</p>
                                  </a>
                              </li>
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Lifestyle</p>
                                      <p>24</p>
                                  </a>
                              </li>
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Fashion</p>
                                      <p>59</p>
                                  </a>
                              </li>
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Art</p>
                                      <p>29</p>
                                  </a>
                              </li>
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Food</p>
                                      <p>15</p>
                                  </a>
                              </li>
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Architecture</p>
                                      <p>09</p>
                                  </a>
                              </li>
                              <li>
                                  <a href="#" class="d-flex justify-content-between">
                                      <p>Adventure</p>
                                      <p>44</p>
                                  </a>
                              </li>
                          </ul>
                          <div class="br"></div>
                      </aside>
                  </div>
              </div>
          
              <div class="col-lg-8">
                  <div class="blog_left_sidebar">
                  
                  
                  <c:forEach var="board" items="${list }">
                   <c:forEach var="member" items="${list4 }">
                   <c:if test="${board.member_seq eq member.member_seq }">
                      <article class="row blog_item">
                          <div class="col-md-3">
                              <div class="blog_info text-right">
                                  <div class="post_tag">
                                      <a href="#">${board.board_classification }/</a>
                                      <a class="active" href="#">Technology,</a>
                                      <a href="#">Politics,</a>
                                      <a href="#">Lifestyle</a>
                                  </div>
                                  <ul class="blog_meta list">
                                      <li>
                                          <a href="#">
                                          	${member.member_name }
                                              <i class="lnr lnr-user"></i>
                                          </a>
                                      </li>
                                      <li>
                                          <a href="#">${board.board_date }
                                              <i class="lnr lnr-calendar-full"></i>
                                          </a>
                                      </li>
                                      <li>
                                          <a href="#">${board.board_views } Views
                                              <i class="lnr lnr-eye"></i>
                                          </a>
                                      </li>
                                      <li>
                                          <a href="#">${board.board_scraps } Scraps
                                              <i class="lnr lnr-bubble"></i>
                                          </a>
                                      </li>
                                  </ul>
                              </div>
                          </div>
                          <div class="col-md-9">
                              <div class="blog_post">
                                  <img src="${pageContext.request.contextPath}/main_resource/img/blog/main-blog/m-blog-1.jpg" alt="">
                                  <div class="blog_details">
                                      <a href="listDetailAction.do?board_seq=${board.board_seq }">
                                          <h2>${board.board_title }</h2>
                                      </a>
                                      <p>${board.board_content }</p>
                                      <a class="button button-blog" href="listDetailAction.do?board_seq=${board.board_seq }">View More</a>
                                  </div>
                              </div>
                          </div>
                      </article>
                      </c:if>
                   </c:forEach>
                  </c:forEach>
                      
                      
                      <nav class="blog-pagination justify-content-center d-flex">
                          <ul class="pagination">
                              <li class="page-item">
                                  <a href="#" class="page-link" aria-label="Previous">
                                      <span aria-hidden="true">
                                          <span class="lnr lnr-chevron-left"></span>
                                      </span>
                                  </a>
                              </li>
                              <li class="page-item">
                                  <a href="#" class="page-link">01</a>
                              </li>
                              <li class="page-item active">
                                  <a href="#" class="page-link">02</a>
                              </li>
                              <li class="page-item">
                                  <a href="#" class="page-link">03</a>
                              </li>
                              <li class="page-item">
                                  <a href="#" class="page-link">04</a>
                              </li>
                              <li class="page-item">
                                  <a href="#" class="page-link">09</a>
                              </li>
                              <li class="page-item">
                                  <a href="#" class="page-link" aria-label="Next">
                                      <span aria-hidden="true">
                                          <span class="lnr lnr-chevron-right"></span>
                                      </span>
                                  </a>
                              </li>
                          </ul>
                      </nav>
                  </div>
              </div>
              
          </div>
      </div>
  </section>
  <!--================Blog Area =================-->

<!--================ Start footer Area  =================-->	
<section>
 	<jsp:include page="../footer.jsp"></jsp:include>
</section>
<!--================ End footer Area  =================-->



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