$().ready(function () {
    doajax();

});//e:ready();

function doajax(){
    $.ajax({
        url: "localhost:8090/js/2022-09-14/board_data.json",
        type: "GET",
        dataType: "json",
        success: function (data) {
            jsonList = JSON.parse(data);
            console.log(jsonList.title);
            make_board(jsonList);
        },
        error: function (request, status, error) {
            console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
        }
    });
}