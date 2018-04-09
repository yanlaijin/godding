$(function () {
	var menuList = $("[data-url]");
	var iframe = $("#iframe");
	var menu = null;
	menuList.each(function (){
		menu = $(this);
		menu.click(function() {
			$(".active").removeClass("active");
			menu.parent("li").addClass("active");
			iframe.attr("src",$(this).data("url"));
		})
	})
})