function searchSuggest(){
    var url="Search";
    var txtSearch=$F("txtSearch");
    var pars='txtSearch='+txtSearch;
    var searchAjax=new Ajax.Request(
        url,
        {
            method:'get',  //get方式提交
            parameters:pars, //提交参数
            onComplete:processRequest
        }
    );
}
function processRequest(req){
    var sobj=$("suggest");
    sobj.innerHTML="";
    var str=req.responseText.split("-");
    var suggest="";
    if(str.length>0&&str[0].length>0){
        for(i=0;i<str.length;i++){
            suggest+="<div>"+str[i]+"</div>";
        }
        sobj.innerHTML=suggest;
        $("suggest").style.display="block";
    }else{
        $("suggest").style.display="none";
    }
}
// $(function () {
//     $('#datetimepicker1').datetimepicker({
//         language: 'zh-CN',//显示中文
//         format: 'yyyy-mm-dd',//显示格式
//         minView: "month",//设置只显示到月份
//         initialDate: new Date(),
//         autoclose: true,//选中自动关闭
//         //todayBtn: true,//显示今日按钮
//         //locale: moment.locale('zh-cn')
//     });
// })
// $.ajax({
//     type: "POST",
//     data: {"ID":id,"name":name},
//     url: "/XX/XXX/XXXX",
//     cache: false,
//     success: function (result) {
//         if (result > 0) {
//             alert("保存成功！");
//         }
//         else {
//             alert("保存失败，请稍后再试！");
//         }
//     }
// });
$(function () {
    $('#datetimepicker').datetimepicker({
       format: 'YYYY-MM-DD HH:mm',
        //startView:'0'
        // format: "yyyy-mm-dd hh:ii",
        locale: moment.locale('zh-cn')
        // //linkField: "mirror_field",
        // //linkFormat: "hh:ii"
        // minView:'hour',
        // todayBtn:false,
        // showMeridian:false,
        // minuteStep:15,
        // todayBtn:true,
        // todayHighlight:true,
        // initialDate:'2016-08-03 15:30'
    });
});

function gg() {

    var aa = $("#aa").val();
    alert(aa);

}