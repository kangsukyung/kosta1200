<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="icon" href="img/Fevicon.png" type="image/png">
  	<link rel="stylesheet" href="../../main_resource/vendors/bootstrap/bootstrap.min.css">
  	<link rel="stylesheet" href="../../main_resource/vendors/fontawesome/css/all.min.css">
   	<link rel="stylesheet" href="../../main_resource/vendors/themify-icons/themify-icons.css">
  	<link rel="stylesheet" href="../../main_resource/vendors/nice-select/nice-select.css">
  	<link rel="stylesheet" href="../../main_resource/vendors/owl-carousel/owl.theme.default.min.css">
  	<link rel="stylesheet" href="../../main_resource/vendors/owl-carousel/owl.carousel.min.css">
  	<link rel="stylesheet" href="../../main_resource/css/style.css">
  	<link rel="stylesheet" href="../../main_resource/css/ksk_style.css">
  	
<script src="../../main_resource/js/jquery.js" type="text/javascript"></script>
<script src="../../main_resource/js/product_insert_btn.js" type="text/javascript"></script>


</head>

<body>

	<section class="product_description_area">
		<div class="container">
			<ul class="nav nav-tabs ksk-right" id="myTab" role="tablist">
				<li class="nav-item"><a class="nav-link active" id="review-tab"
					data-toggle="tab" href="#review" role="tab" aria-controls="review"
					aria-selected="false">상품추가</a></li>
			</ul>
			<div class="tab-content" id="myTabContent">

				<div class="tab-pane fade show active" id="review" role="tabpanel"
					aria-labelledby="review-tab">
					<div class="row">
						<div class="col-lg-6"></div>
						<div class="col-lg-6">
							<div class="review_box">
								<h4>상품등록</h4>
								<form action="#/" class="form-contact form-review mt-3">
									<div class="form-group">
										<label id="product_insert_label">상품명 </label> <input
											class="form-control" id="product_insert_input" name="name"
											type="text" placeholder="상품명을 입력하세요." required="">
									</div>
									<div class="form-group">
										<label id="product_insert_label">가격 </label> <input
											class="form-control" id="product_insert_input2" name="name"
											type="text" placeholder="가격을입력하세요." required="">
									</div>


									<div class="product_insert_category">
										<label id="product_insert_label">분류 </label> <select
											id="product_insert_category1">
											<option value="" hidden="">카테고리</option>
											<option value="HAR0000">1</option>
											<option value="HFB0000">2</option>
											<option value="HFC0000">3</option>
											<option value="HAO0000">4</option>
										</select> <select id="product_insert_category2">
											<option value="" hidden="">하위 카테고리</option>
										</select>

									</div>
								</form>

							</div>
						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="form-group text-center text-md-right mt-3" id="ksk_btn">
			<button type="submit" class="button button--active button-review">등록완료</button>
			<button type="submit" class="button button--active button-review">취소하기</button>
		</div>

	</section>




</body>
</html>