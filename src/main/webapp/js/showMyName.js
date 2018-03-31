/**
 * Created by Admin on 2017/4/18.
 */

function showMyName() {
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
}

function logout() {
    $.getJSON(getContextPath() + "login/logout", {}, function (data) {
        if (data.success) {
            window.location.href = getContextPath() + "html/login.html";
        }
    });
}
