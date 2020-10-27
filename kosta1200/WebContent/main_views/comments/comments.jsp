<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="skrollr skrollr-desktop">
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/comments.css">


</head>
<body>

<div class="col-lg-12 comments_div_jsb">
	<div class="comments-area comments_list_jsb">
		<h4>댓글 ${list2.totalCount}</h4>
		<div class="comment-list">
			<div class="user d-flex comments_insert_jsb">
<%-- 				<c:forEach var="m" items="${mlist}"> --%>
					<div class="thumb">
					<%-- <%= session.getAttribute("member") %> --%>
						<img src="${pageContext.request.contextPath}/upload/${member.member_profile}" alt="">
						<c:out value="${pageContext.request.contextPath}/upload/${member.member_profile}"></c:out>
					</div>
<%-- 				</c:forEach> --%>
				<div class="form-group col-lg-10 col-md-6 name comments_reply_jsb">
					<form action="CommentsInsertAction.do" method="POST" enctype="multipart/form-data">
						<!-- 댓글 입력 -->
						<input type="text" class="form-control" id="insert_content" 
						name="comments_content" placeholder="댓글내용을 입력해주세요" onfocus="this.placeholder = ''"
							onblur="this.placeholder = '댓글내용을 입력해주세요'">
						<input class="ti-search" type="file" name="comments_picture" id="insert_file">
						<div class="reply-btn">
							<input class="btn-reply text-uppercase" type="submit">
						</div>
					</form>
				</div>
			</div>
			<%-- <c:if test="${listSize > 0 } "> --%>
			<c:forEach var="c" items="${list2.list}">
				<div class="single-comment justify-content-between d-flex single-comment_jsb">
					<div class="user justify-content-between d-flex">
						<div class="desc">
						<input type="hidden" name="seq" value="${c.comments_seq}">
							<h5>
								<a href="Member_Mypage.do?member_seq=${c.member_seq}">${c.member_seq}님</a>
							</h5>
                               <!-- 썸네일 이미지 -->
                               <c:if test="${c.comments_picture != null }">
								<c:set var="head" value="${fn:substring(c.comments_picture, 0, fn:length(c.comments_picture)-4) }"></c:set>
								<c:set var="pattern" value="${fn:substring(c.comments_picture, fn:length(head) +1, fn:length(c.comments_picture)) }"></c:set>
									<c:choose>
										<c:when test="${pattern == 'png' || pattern == 'gif' || pattern == 'PNG' || pattern == 'jpg'}">
											<div class="d-flex">
												<img src="${pageContext.request.contextPath}/upload/${head}_small.${pattern}">
											</div>
										</c:when>
										<c:otherwise>
										<c:out value="NO IMAGE"></c:out>
										</c:otherwise>
									</c:choose>
							</c:if>
							<p id="comments_content" class="comment">${c.comments_content}</p>
							<a type="button" id="btn_comments_Update" class="date" href="CommentsUpdateAction.do?comments_seq=${c.comments_seq}">수정하기</a>
							<a type="button" id="btn_comments_Delete" class="date" href="CommentsDeleteAction.do?comments_seq=${c.comments_seq}">삭제하기</a>
						</div>
					</div>
				</div>
			</c:forEach>
			<%-- </c:if>
			<c:if test="${listSize == 0 || listSize == null}">
				댓글이 없습니다
			</c:if> --%>
		</div>

		<nav class="blog-pagination justify-content-center d-flex">
		<ul class="pagination">
			<c:if test="${list2.startPage > 5 }">
				<li class="page-item">
					<a href="CommentsListAction.do?pageNum=${list2.startPage - 1}" class="page-link" aria-label="Previous"> 
						<span aria-hidden="true">
							<span class="lnr lnr-chevron-left" ></span>
						</span>
					</a>
				</li>
			</c:if>
			
			<c:forEach var="pageNo" begin="${list2.startPage}" end="${list2.endPage}">
				<c:if test="${list2.requestPage == pageNo}"><b></c:if>
					<li class="page-item">
						<a href="CommentsListAction.do?pageNum=${pageNo}" class="page-link"  id="page-item-pageno">${pageNo}</a>
					</li>
				<c:if test="${list2.requestPage == pageNo}"></b></c:if>
			</c:forEach>
			
			<c:if test="${list2.endPage < list2.totalPageCount}">
				<li class="page-item">
					<a href="CommentsListAction.do?pageNum=${list2.endPage + 1}" class="page-link" aria-label="Next"> 
						<span aria-hidden="true">
							<span class="lnr lnr-chevron-right"></span>
						</span>
					</a>
				</li>
			</c:if>
		</ul>
		</nav>
		
	</div>
</div>

	<script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>
	<script src="${pageContext.request.contextPath}/main_resource/js/comments.js"></script>
</body>


</html>