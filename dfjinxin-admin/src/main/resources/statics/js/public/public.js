function ajaxFunctionPost(url, data, successFunctionCall, errorFunctionCall){
    $.ajax({
        type: "POST",
        url: baseURL + url,
        data: data,
        dataType: "json",
        success: function(resPublic){
            if(resPublic.code !== 0){
                vm.$message({showClose: true, message: resPublic.msg, type: 'warning'});
                return ;
            }
            if (successFunctionCall != null) {
                successFunctionCall(resPublic);
            }
        },
        error: function(resPublic){
            if(resPublic.code !== 0 && null != resPublic.msg){
                vm.$message({showClose: true, message: resPublic.msg, type: 'error'});
            }else{
                vm.$message({showClose: true, message: '系统请求异常，请联系管理人员定位', type: 'error'});
            }
            if (errorFunctionCall != null) {
                errorFunctionCall(resPublic);
            }
        }
    });
}
