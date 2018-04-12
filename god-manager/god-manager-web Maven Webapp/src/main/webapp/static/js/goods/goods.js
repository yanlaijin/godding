$(function() {
	var parentItem = $("#parent_ck");
	parentItem.change(function() {
		var children = $("[name='child_ck']");
		children.each(function() {
			$(this).prop("checked", parentItem.prop("checked"));
		})
	})
	
	$("#beginTime_span").click(function(){
		WdatePicker({el:'beginTime',dateFmt:'yyyy-MM-dd HH:mm:ss'});
	})
	$("#endTime_span").click(function(){
		WdatePicker({el:'endTime',dateFmt:'yyyy-MM-dd HH:mm:ss'});
	})
	
	//高级查询
	$("#searchButton").click(function(){
		$("#searchForm").submit();
	})
	
})

