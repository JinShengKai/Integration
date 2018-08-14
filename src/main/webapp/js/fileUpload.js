function ajax_do(url_do, params, asy) {
	var ajax_result;
	$.ajax({
		type : "POST",
		async : asy,
		contentType : "application/json;",
		url : url_do,
		data : params,
		dataType : 'json',
		success : function(data) {
			result = data;
		},
		error : function(data) {
		}
	});
	return ajax_result;
}
$("#img").fileinput(
		{uploadUrl : "http://" + document.location.hostname + ":"
					+ document.location.port + "/zhongke/img.html",
			uploadAsync : true,
			showPreview : false,
			allowedFileExtensions : [ 'jpg', 'png', 'gif' ],
			maxFileCount : 1,
			elErrorContainer : '#kv-error-1'
		}).on('fileuploaded', function(event, data, id, index) {
});