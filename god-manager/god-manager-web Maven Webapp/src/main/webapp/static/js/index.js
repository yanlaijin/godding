$(function () {
	//菜单选中状态
	var menuList = $("[data-url]");
	var iframe = $("#iframe");
	var menu = null;
	menuList.each(function (){
		menu = $(this);
		menu.click(function() {
			$(".active").removeClass("active");
            var childrenMenu = menu.parent("li");
            childrenMenu.addClass("active");
			var parentMenu = childrenMenu.parent("ul");
            var htmlparam = null;
            if (parentMenu) {
                htmlparam = "<li><i class='ace-icon fa "+parentMenu.data("cls")+" home-icon'></i> <a href='#'>"+menu.text()+"</a></li>"
            } else {
                htmlparam = "<li><i class='ace-icon fa "+childrenMenu.data("cls")+" home-icon'></i> <a href='#'>menu.text()</a></li>"
            }
            var labels = $("#breadcrumb");
            labels.html(htmlparam);
			iframe.attr("src",$(this).data("url"));
		})
	})
})