$().ready(function () {
    var passChk = false;
    get_list();
    $("#btnReg").on("click", function (ev) {
        if (fn.temail.value == "") {
            alert("비밀번호는 반드시 입력해야 합니다.");
            fn.temail.focus();
            return;
        }
        if (fn.tname.value == "") {
            alert("이름은 반드시 입력해야 합니다.");
            fn.tname.focus();
            return;
        }
        if (fn.tpwd.value == "") {
            alert("비밀번호는 반드시 입력해야 합니다.");
            fn.tpwd.focus();
            return;
        }
        if (fn.tpwd2.value == "") {
            alert("확인을 위한 비밀번호도 반드시 입력해야 합니다.");
            fn.tpwd2.focus();
            return;
        }
        if ($("input:checked").length == 0) {
            alert("취미는 하나 이상을 선택하셔야 합니다.");
            return;
            W
        }
        if (fn.taddr.value == "") {
            alert("거주지를 선택해 주세요.");
            return;
        }
        // fn.method="get";
        // fn.action = "JDBCCtrl";
        // fn.submit();
        var str='';
        var fruit=$('input[name=thobby]:checked').each(function(){
            str+= $(this).val()+",";
        });
        str=str.substring(0,str.length-1);
        $.ajax({
            type: "GET",            // HTTP method type(GET, POST) 형식이다.
            url: "/JDBCCtrl",       // 컨트롤러에서 대기중인 URL 주소이다.
            data: {
                email: fn.temail.value,
                name: fn.tname.value,
                pwd: fn.tpwd.value,
                hobby: str,
                addr: fn.taddr.value
            },
            dataType: 'json',
            contentType: 'json',
            success: function (data) { // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
                console.log(data);
                alert("회원가입이 완료되었습니다.");
                get_list();
                // $tr = $("<tr></tr>");
                // $tr.append("<td>" + data.email + "</td>");
                // $tr.append("<td>" + data.name + "</td>");
                // $tr.append("<td>" + data.hobby + "</td>");
                // $tr.append("<td>" + data.addr + "</td>");
                // $("#resultAreaRegi").append($tr);
            },
            error: function (request, status, error) { // 비동기 통신이 실패할경우 error 콜백으로   들어옵니다.
                console.log("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
            }
        });

    });//e:$("form").on("submit")

    $("#pwd2").on("keypress", function () {
        passChk = false;
        if (fn.tpwd.value == fn.tpwd2.value) passChk = true;
        console.log(passChk);
    });//e:$("#pwd2").on("keypress")
});//e:$().ready()

function get_list() {
    $.ajax({
        type: "POST",            // HTTP method type(GET, POST) 형식이다.
        url: "/JDBCCtrl",       // 컨트롤러에서 대기중인 URL 주소이다.
        dataType: 'json',
        contentType: 'json',
        success: function (data) { // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
            console.log(data);
            $("#resultArea").empty();
            for (var i = 0; i < data.length; i++) {
                $tr = $("<tr></tr>");
                $tr.append("<td>" + data[i].email + "</td>");
                $tr.append("<td>" + data[i].name + "</td>");
                $tr.append("<td>" + data[i].hobby + "</td>");
                $tr.append("<td>" + data[i].addr + "</td>");
                $tr.append("<td>" + data[i].date + "</td>");
                $("#resultArea").append($tr);
            }
        },
        error: function (request, status, error) { // 비동기 통신이 실패할경우 error 콜백으로   들어옵니다.
            console.log("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
        }
    });
}