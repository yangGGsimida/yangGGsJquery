/**
 * Created by yangGG on 2017/10/31.
 */
$(function () {
    $(".logo>.btn").click(function () {
        $(".bar").toggle();
        $(".header>.dropdown").toggle();
    });
    autosize($("textarea"));/*使用autosize的textarea插件*/
    $(".bar .activea").click(function () {/*按登录时弹出login模态框*/
        $("#loginmodal").modal({
                remote:"login.html"
            }
        );
    });

})