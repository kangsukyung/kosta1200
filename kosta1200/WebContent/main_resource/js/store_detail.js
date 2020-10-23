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
      alert(this.value); //product.product_seq
      $(".basket-list").hide().load("../sss.html", function() {
    	  $(this).fadeIn().trigger("create");
      	});
      return false;
   })	
	
   
   
   $("#select_option").on("change", function() {
	      $("#select3").empty();
	      if (this.value == "bang") {
	         $("#select3").hide().load("../main_resource/js/a.html", function() {
	            $(this).fadeIn().trigger("create");
	            background_color_ch();
	         });
	      }
	      return false;
	   });
	
	
})