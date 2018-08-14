$(document).ready(function () {
    $("#rerun_btm").click(function () {
        var rows = $('#failed_task').find('tr').length;

        var keyArray = [];
        for (var i = 1; i < rows; i++) {
            var value = {"instanceId": $('#failed_task').find('tr').eq(i).find('td').eq(2).text()};
            keyArray.push(value);

        }
        console.log(JSON.stringify(keyArray).toString())
        var confirmrerun = confirm('确认要重跑吗?');
        if (confirmrerun) {
            $.ajax({
                type: "post",
                url: "/ODI/taskinfo/rerun",
                dataType: "json",
                contentType: "application/json", // 指定这个协议很重要
                data: JSON.stringify(keyArray), //只有这一个参数，json格式，后台解析为实体，后台可以直接用
                success: function (data) {
                    alert(data);
                },
                error: function (jqXHR, textStatus, errorThrown) {


                }
            });
        }

    });
});

$("#common_task").click(function () {
    var gmtdate = $("#gmtdate").val();


    $.ajax({
        type: "post",
        url: "/ODI/baseinfo/gmt_comm_Info",
        dataType: "json",
        async : false,
        contentType: "application/json", // 指定这个协议很重要
        data:gmtdate, //只有这一个参数，json格式，后台解析为实体，后台可以直接用
        success: function (data) {
            alert(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {


        }
    });


});

