<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: jinshengkai
  Date: 2018/6/29
  Time: 下午7:30
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">


    <title>集成组运维工具</title>

    <!-- Bootstrap core CSS -->
    <link href="/Integration/css/bootstrap.min.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="/Integration/css/dashboard.css" rel="stylesheet">
    <link href="/Integration/css/bootstrap-editable.css" rel="stylesheet">
    <link href="/Integration/css/bootstrap-table.css" rel="stylesheet">
    <link href="/Integration/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/Integration/plugins/timepicker/bootstrap-timepicker.css" rel="stylesheet">
    <link rel="stylesheet" href="/Integration/plugins/adminLTE/css/AdminLTE.min.css">
    <link rel="stylesheet" href="/Integration/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="/Integration/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="/Integration/plugins/bootstrap-select/css/bootstrap-select.min.css">
    <%
        String today=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    %>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">集成组日常运维工具</a>
        </div>

    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="../baseInfo/index.html">监控信息 <span class="sr-only">(current)</span></a></li>

            </ul>
            <ul class="nav nav-sidebar">
                <li class="active"><a href="../RDS/dataRepair.html">数据差异 <span class="sr-only">(current)</span></a></li>

            </ul>


        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <section class="content-header">
                <h2 class="sub-header">任务作业监控</h2>

            </section>

            <section class="content">
                <div class="row clearfix" style="margin-bottom: 20px">

                    <div class="row">


                        <div id="dateSearch" class="col-md-3">
                            <div class="input-group date " data-provide="datepicker">

                                <input type="text" id="datepicker" width="10px" value="<%=today%>" class="form-control">
                                <div class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </div>

                            </div>


                        </div>


                        <div  class="col-md-3">

                            <button id="searchDataRepair" type="button" class="btn btn-default">
                                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>查找
                            </button>

                        </div>
                    </div>
                </div>
                <div class="row clearfix">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-body">
                                    <table id="dataRepairTable">
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </div>
    </div>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster
<script src="/Integration/js/holder.min.js"></script>

<!-- Just to make our placeholder images work. Don't actually copy the next line! -->


<script src="/Integration/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="/Integration/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="/Integration/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="/Integration/plugins/fastclick/fastclick.js"></script>


<script src="/Integration/plugins/bootstrap/js/app.min.js"></script>
<script src="/Integration/plugins/bootstrap/js/demo.js"></script>
<script src="/Integration/plugins/bootable/bootstrap-table.min.js"></script>
<script src="/Integration/plugins/bootable/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="/Integration/plugins/bootable/extensions/editable/bootstrap-table-editable.js"></script>
<script src="/Integration/plugins/bootable/bootstrap-editable.js"></script>

<script src="/Integration/plugins/bootable/bootbox.min.js"></script>
<script src="/Integration/plugins/datepicker/bootstrap-datepicker.js"></script>

<script src="/Integration/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>

<script src="/Integration/plugins/bootstrap-select/js/bootstrap-select.min.js"></script>
<script src="/Integration/plugins/bootstrap-select/js/i18n/defaults-zh_CN.min.js"></script>
<script src="/Integration/js/integration.js"></script>
</body>
</html>
