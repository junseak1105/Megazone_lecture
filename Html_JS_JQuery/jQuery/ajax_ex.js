var $jsonList = [
    {
        "IDX": 1,
        "list": "1",
        "title": "title_1",
        "name": "name_1",
        "hit": "1",
        "date": "2022-09-11"
    },
    {
        "IDX": 2,
        "list": "2",
        "title": "title_2",
        "name": "name_2",
        "hit": "1",
        "date": "2022-09-12"
    },
    {
        "IDX": 3,
        "list": "3",
        "title": "title_3",
        "name": "name_3",
        "hit": "1",
        "date": "2022-09-13"
    },
    {
        "IDX": 4,
        "list": "4",
        "title": "title_4",
        "name": "name_4",
        "hit": "1",
        "date": "2022-09-14"
    },
    {
        "IDX": 5,
        "list": "5",
        "title": "title_5",
        "name": "name_5",
        "hit": "1",
        "date": "2022-09-15"
    },
    {
        "IDX": 6,
        "list": "6",
        "title": "title_6",
        "name": "name_6",
        "hit": "1",
        "date": "2022-09-16"
    },
    {
        "IDX": 7,
        "list": "7",
        "title": "title_7",
        "name": "name_7",
        "hit": "1",
        "date": "2022-09-17"
    },

]

var keys = ["IDX","list", "title", "name", "hit", "date","del"];
$().ready(function () {
    if($("tbody tr ").children("td:first-child").children("input").prop("checked")){
        $("#chkAll").prop("checked",true);
    }else {
        $("#chkAll").prop("checked",false);
    }

    //하단 선택삭제 클릭 시 체크박스에 체크된 항목 제거
    $("#btnDel").click(function () {
        $("tbody tr").each(function () {
            if($(this).children("td:first-child").children("input").prop("checked")){
                $(this).remove();
            }
        });
    });

    $("#btnnext").on("click", function (ev) {
        var  $td;
        var jsonlist = $jsonList;
        var listCnt = $("tbody tr").length;
        var j =listCnt;
        while (j<listCnt+3 && j < jsonlist.length){
            var $tr = $("<tr></tr>");
            for (var i = 0; i < keys.length; i++) {
                $td = $("<td></td>");
                if (keys[i] == "IDX") $td.append("<input type='checkbox' name='idx' id='chk' value='" + jsonlist[j][keys[i]] + "'>");
                else if (keys[i] == "del") $td.text("del")
                else $td.text(jsonlist[j][keys[i]]);
                $tr.append($td);
            }
            $td.on("click", function (ev) {
                //.index()를 사용하면 해당 tr의 index를 반환
                //$(this).parents("tr").remove();
                var chk = $(this).parent("tr").children("td:first-child").children("input").prop("checked");
                if(chk)$(this).parents("tr").remove();
                else alert("체크필요");
            });
            $("#tbody").append($tr);
            j++;

        }
    });

    $("#chkAll").on("click",function (ev){
        if(this.checked){
            $("tbody tr ").children("td:first-child").children("input").prop("checked",true);
        }else{
            $("tbody tr ").children("td:first-child").children("input").prop("checked",false);
        }
    });
});