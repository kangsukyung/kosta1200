$(function() {
	product_sort();
})

function productAdd(item) {
	var html = '<section><div class="dropdown">' + item.title + '</div></section>';
    
    $("#select3").append(html);
    
    html = "";
}

function product_sort() {
	$("#select_option").on("change", function() {
		$("#select3").empty();
		if (this.value == "bang") {
			$.ajax({
				url : "category.json",
				type : "get",
				dataType : "json",
				success : function(data) {
					$.each(data, function(idx, item) {
						productAdd(item);
					})
				},
				error: function(request, status, error) {
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				}
			})
		}
	})
}
