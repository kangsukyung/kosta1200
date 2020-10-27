<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Aroma Shop - Blog Details</title>
  <link rel="icon" href="${pageContext.request.contextPath}/main_resource/img/Fevicon.png" type="image/png">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/fontawesome/css/all.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/themify-icons/themify-icons.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/linericon/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/board_listdetail.css">
</head>
<body>
  <!--================ Start Header Menu Area =================-->
<section>
	<jsp:include page="../header.jsp"></jsp:include>
</section>
	<!--================ End Header Menu Area =================-->


	<!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="blog">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>Blog Details
					${member.member_seq }
					</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">Blog Details</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->



  <!--================Blog Area =================-->
	<section class="blog_area single-post-area py-80px section-margin--small">
			<div class="container">
					<div class="row">
						<div class="col-lg-4" id="col-lg-4-detail">
									<ul class="blog_meta list" id="blog_meta-list-member">
											<li class="li_fixed_style">
													<a href="#" class="blog_meta_list_a">
														<i class="lnr lnr-user"></i>
														<div class="blog_meta_list_div">${member.member_name }</div>
														
													</a>
											</li>
											<li class="li_fixed_style">
													<a href="#" class="blog_meta_list_a">
														<i class="lnr lnr-calendar-full"></i>
														<div class="blog_meta_list_div">${board.board_date }</div>
													</a>
											</li>
											<li class="li_fixed_style">
													<a href="#" class="blog_meta_list_a">
														<i class="lnr lnr-eye"></i>
														<div class="blog_meta_list_div">${board.board_views } Views</div>
													</a>
											</li>
											<li class="li_fixed_style">
													<a href="#" class="blog_meta_list_a">
														<i class="lnr lnr-bubble"></i>
														<div class="blog_meta_list_div">${board.board_scraps } Scraps</div>
													</a>
											</li>
											<li class="li_fixed_style">
													<a href="board_updateActionform.do?board_seq=${board.board_seq }" class="blog_meta_list_a">
														<i class="lnr lnr-cog"></i>
														<div class="blog_meta_list_div">Update</div>
													</a>
											</li>
											<li class="li_fixed_style">
													<a href="board_deleteAction.do?board_seq=${board.board_seq }" class="blog_meta_list_a">
														<i class="lnr lnr-trash"></i>
														<div class="blog_meta_list_div">Delete</div>
													</a>
											</li>
									</ul>
							</div>
					
					
					
							<div class="col-lg-8 posts-list">
									<div class="single-post row">
											<div class="col-lg-12">
													<div class="feature-img">
															<img class="img-fluid" src="${pageContext.request.contextPath}/main_resource/img/blog/feature-img1.jpg" alt="">
													</div>
											</div>
											<div class="col-lg-3  col-md-3">
													<div class="blog_info text-right">
															<div class="post_tag">
																	<a href="#">Food,</a>
																	<a class="active" href="#">Technology,</a>
																	<a href="#">Politics,</a>
																	<a href="#">Lifestyle</a>
															</div>
															<ul class="blog_meta list">
																	<li>
																			<a href="#">${member.member_name }
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
																		<form action="${pageContext.request.contextPath}/Scrap/ScrapInsertAction.do" method="post">
																			<a type="hidden" href="#">${board.board_scraps } Scraps
																			<input type="hidden" name="board_seq" value="${board.board_seq }">
																			<input type="hidden" name="member_seq" value="${member.member_seq }">
																					<i class="lnr lnr-bubble"></i>
																			</a>
																			<input type="submit" value="½ºÅ©·¦ÇÏ±â">
																		</form>
																	</li>
															</ul>
															<ul class="social-links">
																	<li>
																			<a href="#">
																					<i class="fab fa-facebook-f"></i>
																			</a>
																	</li>
																	<li>
																			<a href="#">
																				<i class="fab fa-twitter"></i>																				
																			</a>
																	</li>
																	<li>
																			<a href="#">
																				<i class="fab fa-github"></i>																				
																			</a>
																	</li>
																	<li>
																			<a href="#">
																				<i class="fab fa-behance"></i>																				
																			</a>
																	</li>
															</ul>
													</div>
											</div>
											<div class="col-lg-9 col-md-9 blog_details">
													<h2>${board.board_title }</h2>
													<p class="excert">
														${board.board_content }
													</p>
											</div>
											<div class="col-lg-12">
													<div class="quotes">
															MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
															on boot camp when you can get the MCSE study materials yourself at a fraction of the camp
															price. However, who has the willpower to actually sit through a self-imposed MCSE training.
													</div>
													<div class="row">
															<div class="col-6">
																	<img class="img-fluid" src="${pageContext.request.contextPath}/main_resource/img/blog/post-img1.jpg" alt="">
															</div>
															<div class="col-6">
																	<img class="img-fluid" src="${pageContext.request.contextPath}/main_resource/img/blog/post-img2.jpg" alt="">
															</div>
															<div class="col-lg-12 mt-4">
																	<p>
																			MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
																			on boot camp when you can get the MCSE study materials yourself at a fraction of
																			the camp price. However, who has the willpower.
																	</p>
																	<p>
																			MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
																			on boot camp when you can get the MCSE study materials yourself at a fraction of
																			the camp price. However, who has the willpower.
																	</p>
															</div>
													</div>
											</div>
									</div>
									<div class="navigation-area">
											<div class="row">
													<div class="col-lg-6 col-md-6 col-12 nav-left flex-row d-flex justify-content-start align-items-center">
															<div class="thumb">
																	<a href="#">
																			<img class="img-fluid" src="${pageContext.request.contextPath}/main_resource/img/blog/prev.jpg" alt="">
																	</a>
															</div>
															<div class="arrow">
																	<a href="#">
																			<span class="lnr text-white lnr-arrow-left"></span>
																	</a>
															</div>
															<div class="detials">
																	<p>Prev Post</p>
																	<a href="#">
																			<h4>Space The Final Frontier</h4>
																	</a>
															</div>
													</div>
													<div class="col-lg-6 col-md-6 col-12 nav-right flex-row d-flex justify-content-end align-items-center">
															<div class="detials">
																	<p>Next Post</p>
																	<a href="#">
																			<h4>Telescopes 101</h4>
																	</a>
															</div>
															<div class="arrow">
																	<a href="#">
																			<span class="lnr text-white lnr-arrow-right"></span>
																	</a>
															</div>
															<div class="thumb">
																	<a href="#">
																			<img class="img-fluid" src="${pageContext.request.contextPath}/main_resource/img/blog/next.jpg" alt="">
																	</a>
															</div>
													</div>
											</div>
									</div>
									<div class="comments-area">
										<jsp:include page="../comments/comments.jsp"></jsp:include>
									</div>
										<%-- <div class="comment-list">
											<div class="single-comment justify-content-between d-flex">
													<div class="user justify-content-between d-flex">
															<div class="thumb">
																	<img src="${pageContext.request.contextPath}/main_resource/img/blog/c5.jpg" alt="">
															</div>
															<div class="desc">
																	<h5>
																			<a href="#">Ina Hayes</a>
																	</h5>
																	<p class="date">December 4, 2017 at 3:12 pm </p>
																	<p class="comment">
																			Never say goodbye till the end comes!
																	</p>
															</div>
													</div>
													<div class="reply-btn">
															<a href="#" class="btn-reply text-uppercase">reply</a>
													</div>
											</div>
										</div> --%>
									</div>
									<!-- <div class="comment-form">
											<h4>Leave a Reply</h4>
											<form>
													<div class="form-group form-inline">
															<div class="form-group col-lg-6 col-md-6 name">
																	<input type="text" class="form-control" id="name" placeholder="Enter Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Name'">
															</div>
															<div class="form-group col-lg-6 col-md-6 email">
																	<input type="email" class="form-control" id="email" placeholder="Enter email address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'">
															</div>
													</div>
													<div class="form-group">
															<input type="text" class="form-control" id="subject" placeholder="Subject" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Subject'">
													</div>
													<div class="form-group">
															<textarea class="form-control mb-10" rows="5" name="message" placeholder="Messege" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Messege'"
																	required=""></textarea>
													</div>
													<a href="#" class="button button-postComment button--active">Post Comment</a>
											</form>
									</div> -->
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