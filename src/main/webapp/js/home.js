/**
 * Created by Admin on 2017/4/15.
 */

var app=angular.module('myapp',[]);
app.controller('homeController',function ($scope,$http) {
    
    $scope.search=function () {
        window.location.href=getContextPath()+"html/search.html?keyword="+$('#searchInput').val();
    };

    $scope.showMyName=function () {
        $.ajax({
            url:getContextPath()+'login/getUsername',
            type:'get',
            dataType:'json',
            success:function (data) {
                if(data.success){
                    $('#username').append(data.username+'您好,欢迎登录');
                    $('#logoutSystem').append('退出登录');
                }
                else{
                    $('#username').append('亲,请登录');
                    $('#register').append('免费注册');
                }

            }
        })
    };

    $scope.showDiscountGoods=function () {
        $.ajax({
            url:getContextPath()+"goodsInformation/searchDiscountGoods",
            type:'get',
            dataType:'json',
            success:function (data) {
                var jsondata;
                for(var i=0;i<4;i++){
                    jsondata=data.goods[i];
                    $('#discountGoods').append('<div class="am-u-sm-3 sale-item"> <div class="s-img"> <a id='+jsondata.pkid+' onclick="detailme(this)"><img src='+jsondata.goodsurl+' /></a> </div> <div class="s-info"> <a id='+jsondata.pkid+' onclick="detailme(this)"><p class="s-title">'+jsondata.goodsid+' '+jsondata.classid+'</p></a> <div class="s-price">￥<b>'+jsondata.goodsprice+'</b> <a class="s-buy" id='+jsondata.pkid+' onclick="detailme(this)">购买</a> </div> </div> </div>');
                }
            }
        })
    };
    $scope.showGuoNeiFruit=function () {
        $.ajax({
            url:getContextPath()+"goodsInformation/searchGuoneiGoods",
            type:'get',
            dataType:'json',
            success:function (data) {
                var jsondata;
                jsondata=data.goods[0];
                $('#guoneiGoods').append('<div class="am-u-sm-5 am-u-md-3 text-one list"> <a id='+jsondata.pkid+' onclick="detailme(this)" > <img src="'+jsondata.goodsurl+' " /> <div class="outer-con "> <div class="title ">好吃的国内水果开抢啦 </div> <div class="sub-title ">回味无穷的感觉 </div> </div> </a> <div class="triangle-topright"></div> </div>');
                for(var i=1;i<9;i++){
                    jsondata=data.goods[i];
                    $('#guoneiGoods').append('<li id='+jsondata.pkid+' onclick="detailme(this)"> <div class="am-u-md-2 am-u-lg-2 text-three"> <div class="boxLi"></div> <div class="outer-con "> <div id="goodsid'+jsondata.pkid+'" class="title ">'+jsondata.goodsid+' </div> <div class="sub-title ">¥'+jsondata.goodsprice+' </div> </div> <a href="# "><img src="'+jsondata.goodsurl+' " /></a> </div> </li>');
                    if(jsondata.goodsweight==0)
                    {
                        $('#goodsid'+jsondata.pkid).css('color','red');
                    }
                }
            }
        })
    };
    $scope.showJinKouFruit=function () {
        $.ajax({
            url:getContextPath()+"goodsInformation/searchJinkouGoods",
            type:'get',
            dataType:'json',
            success:function (data) {
                var jsondata;
                jsondata=data.goods[0];
                $('#jinkouGoods').append('<div class="am-u-sm-5 am-u-md-3 text-one list"> <a id='+jsondata.pkid+' onclick="detailme(this)" > <img src="'+jsondata.goodsurl+' " /> <div class="outer-con "> <div class="title ">好吃的进口水果开抢啦 </div> <div class="sub-title ">让你体会到异域他乡的味道 </div> </div> </a> <div class="triangle-topright"></div> </div>');
                for(var i=1;i<9;i++){
                    jsondata=data.goods[i];
                    $('#jinkouGoods').append('<li id='+jsondata.pkid+' onclick="detailme(this)"> <div class="am-u-md-2 am-u-lg-2 text-three"> <div class="boxLi"></div> <div class="outer-con "> <div class="title ">'+jsondata.goodsid+' </div> <div class="sub-title ">¥'+jsondata.goodsprice+' </div> </div> <a href="# "><img src="'+jsondata.goodsurl+' " /></a> </div> </li>');
                }
            }
        })
    };

    $scope.detailme=function () {
        var pkid=me.id;
        window.location.href=getContextPath()+"html/introduction.html?keyword="+pkid;
    };

    $scope.logout=function () {
        $.getJSON(getContextPath() + "login/logout", {}, function (data) {
            if (data.success) {
                window.location.href = getContextPath() + "html/login.html";
            }
        });
    };

    $scope.init=function () {
        $scope.showMyName();
        $scope.showDiscountGoods();
        $scope.showGuoNeiFruit();
        $scope.showJinKouFruit();
    };

    $scope.init();

});


