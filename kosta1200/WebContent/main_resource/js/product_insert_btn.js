







var i=0;
$(document).ready(function() {
	$("#myTab").click(function() {
		$("#myTabContent").append("<div id='product_insert"+i+"'>'"+$('.tab-content').html()+"'</div>")
		i++;
	});
});