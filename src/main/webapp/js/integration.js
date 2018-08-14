$("#search").click(function () {
    $("#table").bootstrapTable('destroy');
    $('#table').bootstrapTable({

        url: '/Integration/baseInfo/queryTask.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: baseInfoQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 3 , // 最少允许的列数
        uniqueId: "name", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            field: 'project',
            title: '单位名称'
        }, {
            field: 'name',
            title: '项目名称'
        }, {
            field: 'bizDate',
            title: '业务日期',
            editable: false
        }, {
            field: 'taskCount',
            title: '任务总数',
            editable: false
        }, {
            field: 'statusNotRunning',
            title: '未运行',
            editable: false
        }, {
            field: 'statusWaiting',
            title: '等待时间',
            editable: false
        }, {
            field: 'statusWaitingResource',
            title: '等待资源',
            editable: false
        }, {
            field: 'statusRunning',
            title: '运行中',
            editable: false
        }, {
            field: 'statusFailed',
            title: '失败',
            editable: false
        }, {
            field: 'statusSucceed',
            title: '成功',
            editable: false
        }, {
            field: 'taskBegin',
            title: '项目下任务启动时间',
            editable: false
        }, {
            field: 'taskFinished',
            title: '项目下任务结束时间',
            editable: false
        }, {
            field: 'taskWorkingTime',
            title: '任务运行时长',
            editable: false
        }, {
            field: 'operation',
            title: '项目运维',
            formatter: function (value, row, index) {
                console.log(row.data)
                var gmtdate = $('#datepicker').datepicker().val();
                var s = '<a href="../operator/' + row.name + '.html">运维</a>';
                return s;
            }
        }]
    });
});

$("#searchDataRepair").click(function () {
    $("#dataRepairTable").bootstrapTable('destroy');


    $('#dataRepairTable').bootstrapTable({

        url: '/Integration/RDS/queryDataRepairList.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams:  DataRepairQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 3 , // 最少允许的列数
        uniqueId: "name", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            field: 'projectName',
            title: '项目名称'
        }, {
            field: 'jobName',
            title: '项目名称'
        }, {
            field: 'bizdate',
            title: '业务日期',
            editable: false
        }, {
            field: 'fbk',
            title: '副本库数量',
            editable: false
        }, {
            field: 'jx',
            title: '镜像层数量',
            editable: false
        }, {
            field: 'cj',
            title: '差量',
            editable: false
        }, {
            field: 'cyl',
            title: '差异率',
            editable: false
        }]
    });
});
$("#search_operator,#fulltask").click(function () {
    $("#task").bootstrapTable('destroy');

    $('#task').bootstrapTable({

        url: '/Integration/operator/queryFullTaskInfo.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: TaskQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 5, // 最少允许的列数
        uniqueId: "taskId", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            checkbox: true
        }, {
            field: 'taskId',
            title: '任务ID',
            visible: false
        }, {
            field: 'projectName',
            title: '所属项目',
            editable: false
        }, {
            field: 'nodeName',
            title: '节点名称'
        }, {
            field: 'beginRunTime',
            title: '开始运行时间',
            editable: false
        }, {
            field: 'finishedRunTime',
            title: '结束运行时间',
            editable: false
        }, {
            field: 'getlog',
            title: '查看日志',
            formatter: function (value, row, index) {
                var s = '<a target="_blank" href="../operator/taskLog.html?taskId=' + row.taskId + '">查看日志</a>';
                return s;
            }
        }]
    });
});
$("#notrunning").click(function () {
    $("#task").bootstrapTable('destroy');

    $('#task').bootstrapTable({

        url: '/Integration/operator/queryNotRunningTaskInfo.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: TaskQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 5, // 最少允许的列数
        uniqueId: "taskId", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            checkbox: true
        }, {
            field: 'taskId',
            title: '任务ID',
            visible: false
        }, {
            field: 'projectName',
            title: '所属项目',
            editable: false
        }, {
            field: 'nodeName',
            title: '节点名称'
        }, {
            field: 'beginRunTime',
            title: '开始运行时间',
            editable: false
        }, {
            field: 'finishedRunTime',
            title: '结束运行时间',
            editable: false
        }, {
            field: 'getlog',
            title: '查看日志',
            formatter: function (value, row, index) {
                var s = '<a target="_blank" href="../operator/taskLog.html?taskId=' + row.taskId + '">查看日志</a>';
                return s;
            }
        }]
    });
});
$("#running").click(function () {
    $("#task").bootstrapTable('destroy');

    $('#task').bootstrapTable({

        url: '/Integration/operator/queryRunningTaskInfo.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: TaskQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 5, // 最少允许的列数
        uniqueId: "taskId", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            checkbox: true
        }, {
            field: 'taskId',
            title: '任务ID',
            visible: false
        }, {
            field: 'projectName',
            title: '所属项目',
            editable: false
        }, {
            field: 'nodeName',
            title: '节点名称'
        }, {
            field: 'beginRunTime',
            title: '开始运行时间',
            editable: false
        }, {
            field: 'finishedRunTime',
            title: '结束运行时间',
            editable: false
        }, {
            field: 'getlog',
            title: '查看日志',
            formatter: function (value, row, index) {
                var s = '<a target="_blank" href="../operator/taskLog.html?taskId=' + row.taskId + '">查看日志</a>';
                return s;
            }
        }]
    });
});
$("#failed").click(function () {
    $("#task").bootstrapTable('destroy');

    $('#task').bootstrapTable({

        url: '/Integration/operator/queryFailedTaskInfo.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: TaskQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 5, // 最少允许的列数
        uniqueId: "taskId", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            checkbox: true
        }, {
            field: 'taskId',
            title: '任务ID',
            visible: false
        }, {
            field: 'projectName',
            title: '所属项目',
            editable: false
        }, {
            field: 'nodeName',
            title: '节点名称'
        }, {
            field: 'beginRunTime',
            title: '开始运行时间',
            editable: false
        }, {
            field: 'finishedRunTime',
            title: '结束运行时间',
            editable: false
        }, {
            field: 'getlog',
            title: '查看日志',
            formatter: function (value, row, index) {
                var s = '<a target="_blank" href="../operator/taskLog.html?taskId=' + row.taskId + '">查看日志</a>';
                return s;
            }
        }]
    });
});

$("#waitingtime").click(function () {
    $("#task").bootstrapTable('destroy');

    $('#task').bootstrapTable({

        url: '/Integration/operator/queryWaitingTimeTaskInfo.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: TaskQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 5, // 最少允许的列数
        uniqueId: "taskId", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            checkbox: true
        }, {
            field: 'taskId',
            title: '任务ID',
            visible: false
        }, {
            field: 'projectName',
            title: '所属项目',
            editable: false
        }, {
            field: 'nodeName',
            title: '节点名称'
        }, {
            field: 'beginRunTime',
            title: '开始运行时间',
            editable: false
        }, {
            field: 'finishedRunTime',
            title: '结束运行时间',
            editable: false
        }, {
            field: 'getlog',
            title: '查看日志',
            formatter: function (value, row, index) {
                var s = '<a target="_blank" href="../operator/taskLog.html?taskId=' + row.taskId + '">查看日志</a>';
                return s;
            }
        }]
    });
});
$("#waitingresources").click(function () {
    $("#task").bootstrapTable('destroy');

    $('#task').bootstrapTable({

        url: '/Integration/operator/queryWaitingResourceTaskInfo.html', // 请求后台的URL（*）
        method: 'post', // 请求方式（*）
        dataType: "json",
        striped: true, // 是否显示行间隔色
        cache: true, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        sortable: false, // 是否启用排序
        sortOrder: "asc", // 排序方式
        queryParams: TaskQueryParams,// 传递参数（*）
        search: true, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true, // 是否显示所有的列
        showRefresh: true, // 是否显示刷新按钮
        minimumCountColumns: 5, // 最少允许的列数
        uniqueId: "taskId", // 每一行的唯一标识，一般为主键列
        showToggle: true, // 是否显示详细视图和列表视图的切换按钮
        cardView: false, // 是否显示详细视图
        detailView: false, // 是否显示父子表
        pagination: true, // 是否显示分页（*）
        sidePagination: "client", // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, // 初始化加载第一页，默认第一页
        pageSize: 50, // 每页的记录行数（*）
        showExport: true,
        exportDataType: "basic",// 可供选择的每页的行数（*）
        pageList: [10, 25, 50, 100],
        smartDisplay: false,
        toolbar: '#toolbar', //工具按钮用哪个容器

        columns: [{
            checkbox: true
        }, {
            field: 'taskId',
            title: '任务ID',
            visible: false
        }, {
            field: 'projectName',
            title: '所属项目',
            editable: false
        }, {
            field: 'nodeName',
            title: '节点名称'
        }, {
            field: 'beginRunTime',
            title: '开始运行时间',
            editable: false
        }, {
            field: 'finishedRunTime',
            title: '结束运行时间',
            editable: false
        }, {
            field: 'getlog',
            title: '查看日志',
            formatter: function (value, row, index) {
                var s = '<a target="_blank" href="../operator/taskLog.html?taskId=' + row.taskId + '">查看日志</a>';
                return s;
            }
        }]
    });
});

$("#kill").click(function () {
    var $table = $('#task');
    if ($table.bootstrapTable('getSelections').length < 1) {
        alert("至少选择一个！");
    } else {
        var taskId = new Array();
        for (var i = 0; i < $table.bootstrapTable('getSelections').length; i++) {
            taskId[i] = '"' + $table.bootstrapTable('getSelections')[i].taskId + '"';
        }
        var param = '{"taskId":[' + taskId + '],"changeType":"0"}';
        console.log(param);
        $.ajax({
            type: "POST",
            async: false,
            contentType: "application/json;",
            url: "/Integration/operator/changeStatus.html",
            data: param,
            dataType: 'json',
            success: function (data) {
                delRow($table);
            },
            error: function (XMLResponse) {
                alert(XMLResponse.responseText);
            }
        });
    }
});

$("#succeed").click(function () {
    var $table = $('#task');
    if ($table.bootstrapTable('getSelections').length < 1) {
        alert("至少选择一个！");
    } else {
        var taskId = new Array();
        for (var i = 0; i < $table.bootstrapTable('getSelections').length; i++) {
            taskId[i] = '"' + $table.bootstrapTable('getSelections')[i].taskId + '"';
        }
        var param = '{"taskId":[' + taskId + '],"changeType":"1"}';
        console.log(param);
        $.ajax({
            type: "POST",
            async: false,
            contentType: "application/json;",
            url: "/Integration/operator/changeStatus.html",
            data: param,
            dataType: 'json',
            success: function (data) {
                delRow($table);
            },
            error: function (XMLResponse) {
                alert("error"+XMLResponse.responseText);
            }
        });
    }
});
$("#rerun").click(function () {
    var $table = $('#task');
    if ($table.bootstrapTable('getSelections').length < 1) {
        alert("至少选择一个！");
    } else {
        var taskId = new Array();
        for (var i = 0; i < $table.bootstrapTable('getSelections').length; i++) {
            taskId[i] = '"' + $table.bootstrapTable('getSelections')[i].taskId + '"';
        }
        var param = '{"taskId":[' + taskId + '],"changeType":"2"}';
        console.log(param);
        $.ajax({
            type: "POST",
            async: false,
            contentType: "application/json;",
            url: "/Integration/operator/changeStatus.html",
            data: param,
            dataType: 'json',
            success: function (data) {
                delRow($table);
            },
            error: function (XMLResponse) {
                alert(XMLResponse.responseText);
            }
        });
    }
});

$("#goback").click(function () {
  window.location.href="/Integration/baseInfo/index.html";
});
function delRow($table) {
    var ids = $.map($table.bootstrapTable('getSelections'), function(row) {
        return row.taskId;
    });

    $table.bootstrapTable('remove', {
        field : 'taskId',
        values : ids
    });
};


$('#datepicker').parent().datepicker({
    "autoclose": true, "format": "yyyy-mm-dd", "language": "zh-CN"
});

function baseInfoQueryParams(params) {
    var temp = {
        datetime: $('#datepicker').datepicker().val(),
        selected: $("#selectpicker").val()
    };
    console.log(JSON.stringify(temp));
    return temp;
};

function TaskQueryParams(params) {
    var temp = {
        gmtdate: $('#datepicker').datepicker().val(),
        name: $("#project_name").text()
    };
    console.log(JSON.stringify(temp));
    return temp;
};
function DataRepairQueryParams(params) {
    var temp = {
        bizdate: $('#datepicker').datepicker().val()
    };
    console.log(JSON.stringify(temp));
    return temp;
};