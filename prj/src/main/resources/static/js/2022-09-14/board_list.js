function make_board(jsonList){
    //make board with jsonList
    var html = "";
    for(var i=0; i<jsonList.length; i++){
        html += "<tr>";
        html += "<td><input type='checkbox' name='checkbox' value='index'></td>";
        html += "<td>"+jsonList[i].index+"</td>";
        html += "<td>" + jsonList[i].name + "</td>";
        html += "<td><a href='#' onclick='show_content(this)'>" + jsonList[i].title + "</a><input type='text' value='"+jsonList[i].content+"' hidden='hidden'></td>";
        html += "<td>" + jsonList[i].regdate + "</td>";
        html += "<td>" + jsonList[i].hit + "</td>";
        html += "<td><span><input type='button' value='del' name='board_del'></span></td>";
        html += "</tr>";
    }
}