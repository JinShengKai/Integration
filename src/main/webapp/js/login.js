$("#login").click(function(){
    var param='{"username":"'+$("#username").val()+'","password":"'+$("#password").val()+'"}';
    $.ajax({
        type : "POST",
        async : false,
        contentType : "application/json;",
        url : "/zhongke/userLogin.html",
        data : param,
        dataType : 'json',
        success : function(data) {
            if (data.head.code==0) {
                window.location.href="/zhongke/article.html";
            }else{
                alert("登陆失败");
            }
        },
        error : function(data) {
        }
    });
});
