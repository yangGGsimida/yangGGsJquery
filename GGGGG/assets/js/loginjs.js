/**
 * Created by yangGG on 2017/11/5.
 */
$(function () {
    $(".left a").click(function () {/*登录界面底部的各种界面的转换*/
        show("Reset");
    });
    $(".right a").click(function () {
        show("register");
    });
    $(".middle a").click(function () {
        $(".register").hide();
        $(".login").show();
    });
    $(".middle_reset a").click(function () {
        $(".Reset").hide();
        $(".login").show();
    });
    function show(className) {
        $(".login").hide();
        $("." + className).show();
    }

    $("#register_submit").click(function () {/*点击按钮判断输入选择是否提交表单*/
        var bool = true;//表示校验通过
        $('.register input').each(function () {
            var inputname = $(this).attr("id");
            if (!invokeValidateFunction(inputname)) {/*遇到返回false的验证方法则赋false*/
                bool = false;
            }
        })
            if(bool){
                /*$("#register_form").submit();*/
                alert("dsadasd");
                var jsonArray=$("#register_form").serializeArray();
                var json=$("#register_form").serialize();
                $.ajax({
                    url: "http://192.168.0.104:8080/user/register?callback=?",
                    data: json,
                    type: "POST",
                    dataType: "jsonp",
                    jsonpCallback: "bbs",
                    success: function (result){
                        var bool=result.success;

                        if(bool){
                            Layer("注册成功");
                        }else{
                            Layer("注册失败");
                        }
                    }
                });
            }
        })

    $("#login_submit").click(function () {
        var bool=Validatelogin();
    });

    function invokeValidateFunction(inputname) {/*启用不同名字的验证方法*/
        var functionName = "Validate" + inputname;
        return eval(functionName + "()");
    }

    function Layer(message){
        layer.alert(message, {
            icon: 1,
            skin: 'layer-ext-moon'
        })
    }
    $('.register input').each(function () {
        $(this).attr("data-toggle","popover")
            .popover({/*启用popover插件*/
            trigger: "manual",/*触发器*/
            content: "hello",/*内容*/
            placement: "right",/*位置*/
            container: "body",
            html: true/*接受html内容*/
        }).blur(function () {/*失去焦点则验证输入结果*/
            var inputname = $(this).attr("id");
            invokeValidateFunction(inputname);
        }).focus(function () {/*获得焦点则隐藏popover*/
            $(this).popover("hide");
        })
    })

    $('.login input[class=form-control]').each(function () {
        $(this).attr("data-toggle","popover")
            .popover({/*启用popover插件*/
                trigger: "manual",/*触发器*/
                content: "hello",/*内容*/
                placement: "top",/*位置*/
                container: "body",
                html: true/*接受html内容*/
            }).focus(function () {/*获得焦点则隐藏popover*/
            $(this).popover("hide");
        })
    })




    function Validateuseremail() {/*验证注册email*/
        var newnode = $("<div></div>").attr("class", "message");/*创建popover的html内容*/
        var element = $("#useremail");
        var value = element.val();
        if (!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/.test(value)) {
            var html = newnode.text("电子邮件格式不正确！").prop("outerHTML");
            element.attr("data-content", html).popover("show");
            return false;
        }
        $.ajax({
            url: "http://192.168.0.104:8080/user/validateEmail?callback=?",
            data: {useremail: value},
            type: "POST",
            dataType: "jsonp",
            jsonpCallback: "bbs",
            success: function (result) {/*接受true和false*/
                if (!result.success) {
                    var html = newnode.text("电子邮件已经存在！").prop("outerHTML");
                    element.attr("data-content", html).popover("show");
                    return false;
                } else {
                    element.popover("hide");/*接受true就隐藏popover*/
                }
            }
        })
        return true;/*验证成功返回true*/
    }

    function Validateusername() {/*验证注册用户名*/
        var newnode = $("<div></div>").attr("class", "message");
        var element = $("#username");
        var value = element.val();
         if (value.length < 3 || value.length > 20) {
            var html = newnode.text("用户名长度必须在3~~20之间！").prop("outerHTML");
            element.attr("data-content", html).popover("show");
            return false;
        }
        $.ajax({
            url: "http://192.168.0.104:8080/validateName?callback=?",
            data: {username: value},
            type: "POST",
            dataType: "jsonp",
            jsonpCallback: "bbs",
            success: function (result) {
                if (!result.success) {
                    var html = newnode.text("用户名已经存在！").prop("outerHTML");
                    element.attr("data-content", html).popover("show");
                    return false;
                } else {
                    element.popover("hide");
                }
            }
        })
        return true;
    }

    function Validateuserpassword() {/*验证注册密码*/
        var newnode = $("<div></div>").attr("class", "message");
        var element = $("#userpassword");
        var value = element.val();
         if (value.length < 6|| value.length > 20) {
            var html = newnode.text("密码长度必须在6~~20之间！").prop("outerHTML");
            element.attr("data-content", html).popover("show");
            return false;
        }else{
            element.popover("hide");
        }
        return true;
    }

    function Validaterepeatpwd() {/*验证注册重复密码*/
        var newnode = $("<div></div>").attr("class", "message");
        var element = $("#repeatpwd");
        var value = element.val();
        var value1=$("#userpassword").val();
        if (value!=value1) {
            var html = newnode.text("两次密码输入不符！").prop("outerHTML");
            element.attr("data-content", html).popover("show");
            return false;
        }else{
            element.popover("hide");
        }
        return true;
    }
    
    function Validateiaccept() {/*验证注册我接受多选框*/
        var element = $("#iaccept");
        var bool=element.get(0).checked;/*get来获得DOS对象获得checked属性*/
        var newnode = $("<div></div>").attr("class", "message");
        if(!bool){
            var html = newnode.text("先同意用户条例！").prop("outerHTML");
            element.attr("data-content", html).popover("show");
        }
        return bool;
    }

    function Validatelogin() {
        var newnode = $("<div></div>").attr("class", "message");
        var username=$("#loginname");
        var userpassword=$("#loginpwd");
        var json=$("#login_form").serialize();
        if(!username.val()){
            var html = newnode.text("用户名为空！").prop("outerHTML");
            username.attr("data-content", html).popover("show");
            return false;
        }else if(!userpassword.val()){
            var html = newnode.text("密码为空！").prop("outerHTML");
            userpassword.attr("data-content", html).popover("show");
            return false;
        }
        $.ajax({
            url: "http://192.168.0.104:8080/user/login?callback=?",
            data: json,
            type: "POST",
            dataType: "jsonp",
            jsonpCallback: "bbs",
            success: function (result) {/*1成功2账号或者密码错误3账号没有注册*/
                var message=result.message;
                if(message=="1"){
                    Layer("登录成功");
                    return true;
                }else if(message=="2"){
                    Layer("账号或密码错误");
                    return false;
                }else if(message=="3"){
                    var html = newnode.text("账号没有注册!").prop("outerHTML");
                    username.attr("data-content", html).popover("show");
                    return false;
                }
            }
        })
        return true;
    }


})