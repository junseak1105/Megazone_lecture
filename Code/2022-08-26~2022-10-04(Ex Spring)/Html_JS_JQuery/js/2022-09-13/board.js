// var index = ("#viewList tr").length;
var index = 0;
$().ready(function () {

    //폼 초기화
    init_form();

    //게시글 등록
    $("#btnSubmit").on("click",function (ev) {
        index ++;
        if(!chk_form()) return;
        $("#viewArea table").append(make_html_statement());
    });//e:$("#btnSubmit").on("click")

    //삭제 버튼 클릭시 삭제
    $(document).on("click","input[name='board_del']",function (ev) {
        $(this).parents("tr").remove();
    });

    //체크된 항목 삭제
    $(document).on("click","input[name='remove_chk']",function (ev) {
        $("input[name='checkbox']:checked").each(function (index, item) {
            $(this).parents("tr").remove();
        });
    });
    //체크박스 전체 조작
    $(document).on("click","input[name='chk_all']",function (ev) {
        $("input[name='checkbox']").prop("checked",$(this).prop("checked"));
    });

});//e:$().ready()

function make_html_statement(){
    var name = $("#name").val();
    var title = $("#title").val();
    var regdate = $("#regdate").val();
    var content = $("#content").val();
    var hit = $("#hit").val();

    var html = "<tr>";
    html += "<td><input type='checkbox' name='checkbox' value='index'></td>";
    html += "<td>"+index+"</td>";
    html += "<td>" + name + "</td>";
    html += "<td><a href='#' onclick='show_content(this)'>" + title + "</a><input type='text' value='"+content+"' hidden='hidden'></td>";
    html += "<td>" + regdate + "</td>";
    html += "<td>" + hit + "</td>";
    html += "<td><span><input type='button' value='del' name='board_del'></span></td>";
    html += "</tr>";

    // $html.append("<tr>");
    // $html.append("<td><input type='checkbox' name='checkbox' value='index'></td>");
    // $html.append("<td>"+index+"</td>");
    // $html.append("<td>" + name + "</td>");
    // $html.append("<td><a href='#' onclick='show_content(this)'>" + title + "</a><input type='text' value='"+content+"' hidden='hidden'></td>");
    // $html.append("<td>" + regdate + "</td>");
    // $html.append("<td>" + hit + "</td>");
    // $html.append("<td><span><input type='button' value='del' name='board_del'></span></td>");
    // $html.append("</tr>");

    // $('#viewArea table').append($html);
    return html;
}//e:make_html_statement()

function show_content(obj){
    var tr = $(obj).parent();
    var content = tr.find("input[type='text']").val();
    $("#viewContent").html(content);

}//e:show_content()

function init_form(){
    var nowDate = new Date();
    var year = nowDate.getFullYear();
    var month = nowDate.getMonth() + 1;
    var date = nowDate.getDate();
    var strDate = year + "-" + month + "-" + date;
    $("#regdate").val(strDate);
    $("#hit").val(0);
}//e:init_form()

function chk_form(){
    if($("#name").val() == ""){
        alert("이름을 입력하세요");
        $("#name").focus();
        return false;
    }
    if($("#title").val() == ""){
        alert("제목을 입력하세요");
        $("#title").focus();
        return false;
    }
    if($("#content").val() == ""){
        alert("내용을 입력하세요");
        $("#content").focus();
        return false;
    }
    return true;
}//e:chk_form()
