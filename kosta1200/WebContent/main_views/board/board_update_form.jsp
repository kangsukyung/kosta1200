<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/main_resource/css/board.css">
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery/jquery-3.2.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/skrollr.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/owl-carousel/owl.carousel.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/vendors/mail-script.js"></script>
  <script src="${pageContext.request.contextPath}/main_resource/js/main.js"></script>
</head>
<body>
<section>
	<jsp:include page="../header.jsp"></jsp:include>
</section>
  <!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>글 수정
					</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">글 수정</li>
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
				<div class="contents-col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3>필수 입력 사항</h3>
						<form class="contents-row login_form" action="board_updateAction.do" id="contents-register_form" method="post"  enctype="multipart/form-data">
							<div class="col-md-12 form-group">
								
								<div class="contents-form-control">
									<div class="row">
										<div class="col-md-12">
											<div class="dropdown_bang_selection">
												게시판 선택        
											</div>
											
											<div class="selectoption">
												<select id="select_option" name="classification" size="1">
													<c:choose>
														<c:when test="${board.board_classification eq 'bang'}">
															<option value='bang'>방들이</option>
														</c:when>
														<c:when test="${board.board_classification eq 'knowhow' }">
															<option value='knowhow'>노하우</option>
														</c:when>
														<c:otherwise>
															<option value='qa'>질문과 답변</option>
														</c:otherwise>
													</c:choose>
												</select>
											</div>
											
										</div>
									</div>
								</div>
							
							</div>
							
							<div class="select33" id="select3">
							<c:choose>
								<c:when test="${board.board_classification eq 'bang' }">
									<div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														공간
													</div>
													
													<div class="selectoption">
														<select class="board_select_option" name="roomwarming_type">
															<option value="선택해주세요.">선택해주세요.</option>
															<option value="원룸">원룸</option>
															<option value="안방">안방</option>
															<option value="거실">거실</option>
															<option value="서재">서재</option>
															<option value="드레스룸">드레스룸</option>
															<option value="주방">주방</option>
															<option value="화장실">화장실</option>
															<option value="베란다">베란다</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														작업
													</div>
													
													<div class="selectoption">
														<select class="board_select_option" name="roomwarming_classification">
															<option value="">선택해주세요.</option>
															<option value="셀프">셀프</option>
															<option value="전문가">전문가</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														평수
													</div>
													
													<div class="selectoption">
														<input type="text" name="roomwarming_space"> 평
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														스타일
													</div>
													
													<div class="selectoption">
														<select class="board_select_option" name="roomwarming_style">
															<option value="">선택해주세요.</option>
															<option value="모던">모던</option>
															<option value="미니멀&심플">미니멀&심플</option>
															<option value="내추럴">내추럴</option>
															<option value="북유럽">북유럽</option>
															<option value="빈티지&레트로">빈티지&레트로</option>
															<option value="클래식&엔틱">클래식&엔틱</option>
															<option value="프렌치&프로방스">프렌치&프로방스</option>
															<option value="러블리&로맨틱">러블리&로맨틱</option>
															<option value="인더스트리얼">인더스트리얼</option>
															<option value="한국&아시아">한국&아시아</option>
															<option value="유니크&믹스매치">유니크&믹스매치</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group_1st">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														컬러
													</div>
													
													<div class="selectoption">
														<select class="board_select_option" id="board_color_select_option" name="roomwarming_color" onchange="background_color_ch();">
															<option value="aliceblue" style="background-color: aliceblue;">선택해주세요.</option>
															<option value="red" style="background-color:red ;">red</option>
															<option value="orange" style="background-color:orange ;">orange</option>
															<option value="yellow" style="background-color:yellow ;">yellow</option>
															<option value="green" style="background-color:green ;">green</option>
															<option value="blue" style="background-color:blue ;">blue</option>
															<option value="purple" style="background-color:purple ;">purple</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														예산
													</div>
													
													<div class="selectoption">
														<input type="text" name="roomwarming_budget"> 만원
													</div>
												
												</div>
											</div>
										</div>
									</div>
								</div>
								</c:when>
								
								<c:when test="${board.board_classification eq 'knowhow' }">
									<div>
									<div class="col-md-12 form-group">
										<div class="contents-form-control">
											<div class="row">
												<div class="col-md-12">
													<div class="dropdown_bang_selection">
														공간
													</div>
													
													<div class="selectoption">
														<select class="board_select_option" name="knowhow_style">
															<option value="">선택해주세요.</option>
															<option value="시공정보">시공정보</option>
															<option value="꾸미기팁">꾸미기팁</option>
															<option value="청소">청소</option>
															<option value="DIY&리폼">DIY&리폼</option>
															<option value="이거어때">이거어때</option>
															<option value="생활정보">생활정보</option>
															<option value="건축&주택">건축&주택</option>
															<option value="상업공간">상업공간</option>
															<option value="지식백과">지식백과</option>
														</select>
													</div>
												
												</div>
											</div>
										</div>
									</div>
								</div>
								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>
							
							
							
							
							</div>
					
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="thumbnail_image" name="thumbnail_image" placeholder="Thumbnail image">
				            </div>
				            
				            <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력해주세요.">
				            </div>
				            
				            <div class="col-md-12 form-group">
								<textarea rows="30%" cols="70" class="form-control" id="contents" name="content" placeholder="내용을 입력해주세요."></textarea>
							</div>
							
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-register w-100">글 등록</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<a href="listAction.do">여기를 눌러봐~</a>
	<!--================End Login Box Area =================-->


<section>
 	<jsp:include page="../footer.jsp"></jsp:include>
</section>


  
</body>
</html>