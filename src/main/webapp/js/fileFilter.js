/**
 * Created by Admin on 2017/5/8.
 */

var currentPage = 1;

var num = 12;

var totalData ;

var totalPage ; // 计算需要的页数，逢小数进1


$(function () {
    showMyName();
    $('#username').css('color','blue');
    show();
    show_current_page_num();
});

function detailme(me) {
    var pkid=me.id;
    window.location.href=getContextPath()+"html/introduction.html?keyword="+pkid;
}

// 显示下一页
function next() {
    if (show_last_page_alert())
        return;
    currentPage++;
    show_current();
}

//显示前一页
function pre() {
    if (show_first_page_alert())
        return;
    currentPage--;
    show_current();
}

//显示第一页
function first() {
    if (show_first_page_alert())
        return;
    currentPage = 1;
    show_current();
}

//显示最后一页
function last() {
    if (show_last_page_alert())
        return;
    currentPage = totalPage;
    show_current();
}

//重置显示的内容
function reset() {
   $('#search-total').html("");
}

//判断是否已经是第一页
function show_first_page_alert() {
    if (currentPage == 1) {
        alert("该页已是第一页!");
        return true;
    }
    return false;
}

//判断是否已经是最后一页
function show_last_page_alert() {
    if (currentPage == totalPage) {
        alert("该页已是最后一页");
        return true;
    }
    return false;
}

//在页面上显示总共有几页
function show_total_page_num() {
    $('#total_num').html(totalPage);
}

//显示当前页数
function show_current_page_num() {
    $('#current_index').html(currentPage);
}

//显示
function show_current() {
    reset();
    show();
    show_current_page_num();
}

//初始化

