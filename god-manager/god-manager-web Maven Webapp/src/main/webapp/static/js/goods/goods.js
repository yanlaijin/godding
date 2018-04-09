$(function () {
    var parentItem = $("#parent_ck");
    parentItem.change(function () {
        var children = $("[name='child_ck']");
        children.each(function () {
            $(this).prop("checked", parentItem.prop("checked"));
        })
    })
})