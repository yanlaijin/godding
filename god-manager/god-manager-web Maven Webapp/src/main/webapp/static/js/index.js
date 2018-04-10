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
			var icon = parentMenu.siblings("a").children("i").data("cls");
            var htmlparam = null;
            if (parentMenu) {
                htmlparam = "<li><i class='ace-icon fa "+icon+" home-icon'></i> <a href='#'>"+parentMenu.siblings("a").children("span").text()+"</a></li><li class='active'>"+menu.text()+"</li>"
            } else {
                htmlparam = "<li><i class='ace-icon fa "+icon+" home-icon'></i> <a href='#'>"+menu.text()+"</a></li>"
            }
            var labels = $("#breadcrumb");
            labels.html(htmlparam);
			iframe.attr("src",$(this).data("url"));
		})
	})
})