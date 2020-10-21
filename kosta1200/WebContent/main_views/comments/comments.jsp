<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="skrollr skrollr-desktop">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Aroma Shop - Blog Details</title>
<link rel="icon"
	href="${pageContext.request.contextPath}//main_resource/img/Fevicon.png"
	type="image/png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/vendors/fontawesome/css/all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/vendors/themify-icons/themify-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/vendors/linericon/style.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/vendors/owl-carousel/owl.theme.default.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/vendors/owl-carousel/owl.carousel.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/css/style.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}//main_resource/css/comments.css">

</head>
<body>

	<div class="col-lg-12 comments_div_jsb">
		<div class="comments-area comments_list_jsb">
			<h4>댓글</h4>
			<div class="comment-list">
				<div class="user d-flex comments_insert_jsb">
					<c:forEach var="m" items="${member}">
						<div class="thumb">
							<img src="${m.member_profile}" alt="">
						</div>
					</c:forEach>
					<div class="form-group col-lg-10 col-md-6 name comments_reply_jsb">
						<form action="insertReplyAction.do" method="POST">
							<input type="hidden" name="seq" value="${board.seq}"> <input
								type="text" class="form-control" id="" name="r_contents"
								placeholder="댓글내용을 입력해주세요" onfocus="this.placeholder = ''"
								onblur="this.placeholder = '댓글내용을 입력해주세요'">
						</form>
					</div>
					<div class="reply-btn">
						<a class="btn-reply text-uppercase">쓰기</a>
					</div>
				</div>
				<c:forEach var="c" items="${comments}">
					<div class="single-comment justify-content-between d-flex">
						<div class="user justify-content-between d-flex">
							<div class="thumb">
								<img src="../../main_resource/img/blog/c1.jpg" alt="">
							</div>
							<div class="desc">
								<h5>
									<a href="#">${c.member_seq}번 글쓴이</a>
								</h5>
								<p class="comment">${c.comments_content}</p>
								<p class="date">날짜 2020/08/20 00시 00분</p>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<%-- <form action="insertReplyAction.do" method="POST">
				<input type="hidden" name="seq" value="${board.seq}"> 댓글제목 :
				<input type="text" name="r_title"><br> 댓글작성자 : <input
					type="text" name="r_writer"><br> 댓글내용 : <input
					type="text" name="r_contents"><br> 
					<input type="submit" value="댓글쓰기">
			</form> --%>

			<nav class="blog-pagination justify-content-center d-flex">
			<ul class="pagination">
				<li class="page-item"><a href="#" class="page-link"
					aria-label="Previous"> <span aria-hidden="true"> <span
							class="lnr lnr-chevron-left"></span>
					</span>
				</a></li>
				<li class="page-item"><a href="#" class="page-link">01</a></li>
				<li class="page-item active"><a href="#" class="page-link">02</a>
				</li>
				<li class="page-item"><a href="#" class="page-link">03</a></li>
				<li class="page-item"><a href="#" class="page-link">04</a></li>
				<li class="page-item"><a href="#" class="page-link">09</a></li>
				<li class="page-item"><a href="#" class="page-link"
					aria-label="Next"> <span aria-hidden="true"> <span
							class="lnr lnr-chevron-right"></span>
					</span>
				</a></li>
			</ul>
			</nav>
		</div>


	</div>

	<script src="../../main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
	<script src="../../main_resource/vendors/skrollr.min.js"></script>
	<script
		src="../../main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script
		src="../../main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
	<script src="../../main_resource/vendors/jquery.ajaxchimp.min.js"></script>
	<script src="../../main_resource/vendors/mail-script.js"></script>
	<script src="../../main_resource/js/main.js"></script>
</body>


</html>