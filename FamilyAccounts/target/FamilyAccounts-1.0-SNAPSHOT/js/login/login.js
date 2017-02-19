/**
 * Created by stone on 17-2-18.
 */




/**
 * 登录请求
 */
var submitSignin = function () {
    var userName=$("input[name='username']").val();
    var password=$("input[name='userpwd']").val();
    var  json = "{'username':,'userpwd':}";
    // alert("账号"+userName+"----:密码"+password);
    $.ajax({
        type: "POST",
        url: "/login",
        contentType:"application/json",
        data: JSON.stringify({"username":userName,"userpwd":password}),//参数列表
        dataType:"json",
        success: function(result){
            //请求正确之后的操作
            alert("成功"+result);
        },
        error: function(result){
            //请求失败之后的操作
            alert("请求失败")
        }
    });
};