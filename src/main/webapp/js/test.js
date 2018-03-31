/**
 * Created by gx on 2017/3/22.
 */
function check() {
    var jsondata=FormToJSON
    $.ajax({
        url:getContextPath()+"login/login",
        type:"post",
        contentType:"application/json",
        dataType:"json",
        data:JSON.stringify(jsondata),
        success:function (res) {
            if(res.success==false){
                $('.msg').html(res.msg);
                setTimeout(function(){$('.msg').html(" ");},1000);
            }
            if(res.success){
                window.location.href=res.url;
                $.session.set("userid",res.userid);
                $.session.set("role",res.role);
            }
        },
        fail:function (res) {
            $('.msg').html("服务器异常");
        }
    })
}