$(function() {
	$('.production-select-dropdown__button').click(function(event) {
		if($('.production-select-dropdown__list-container').hasClass('open')) {
			$('.production-select-dropdown__list-container').removeClass('open');
		}
		else {
			$('.production-select-dropdown__list-container').addClass('open');
		};
	})
	

   $(".production-select-list__item").on("click","button", function() {

	  var product_seq2 = this.value;
	  
      var product_seq = $("#product_seq").val();
      
      alert("this.value : " + this.value); //product.product_seq
      alert("product_seq : " + product_seq);
      
      $.ajax({
    	  type: "Post",
    	  async: "true",
    	  data: "product_seq="+product_seq,
    	  dataType: "text",
    	  url : "../main_views/store/storedetail.jsp",
    	  success: function(data) {
    		  console.log("hereeeeeeeeeeeeeeeeeeeeeeeeeeee" + data);
    		  $(".basket-list").append()
    		  if(data!=null) {
    			  var html = '<div class = "basket-list">';
    			  html += '<div class="basket-list-products">' + '${product.product_name }' + '</div>';
    			  html += '</div>';
    			  
    			  $(".basket-list").append(html);
    			  alert("success2");
    		  } else {
    			  alert("fail");
    		  }
			
    		  $.each(data, function(idx, item) { //JSON 값을 html로 변환해주어야 함
           });
    		  
		},
		error: function(error) {
			alert("error : " + error);
		}
      }) //end ajax
      
      return false;
   })	
	
   
   
//   $("#select_option").on("change", function() {
//	      $("#select3").empty();
//	      if (this.value == "bang") {
//	         $("#select3").hide().load("../main_resource/js/a.html", function() {
//	            $(this).fadeIn().trigger("create");
//	            background_color_ch();
//	         });
//	      }
//	      return false;
//	   });
	
	
   $(".selling-option-form-content__list .form-control").change(function() {
	   var totalCost = 0;
	   var productCost = 0;
	   
	   productCost = parseInt($(this).val() * $(".selling-option-item__price__number").text());
	   $(".selling-option-form-content__price .selling-option-form-content__price__number").text(productCost);
	
   })
	
})