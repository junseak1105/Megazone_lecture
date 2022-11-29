$().ready(function() {
    var passChk = false;
    $("#btnReg").on("click",function(ev){
        if(fn.temail.value=="") {
            alert("비밀번호는 반드시 입력해야 합니다.");
            fn.temail.focus();
            return;
        }
        if(fn.tname.value=="") {
            alert("이름은 반드시 입력해야 합니다.");
            fn.tname.focus();
            return;
        }
        if(fn.tpwd.value=="") {
            alert("비밀번호는 반드시 입력해야 합니다.");
            fn.tpwd.focus();
            return;
        }
        if(fn.tpwd2.value=="") {
            alert("확인을 위한 비밀번호도 반드시 입력해야 합니다.");
            fn.tpwd2.focus();
            return;
        }
        if($("input:checked").length==0) {
            alert("취미는 하나 이상을 선택하셔야 합니다.");
            return;
        }
        if(fn.taddr.value=="") {
            alert("거주지를 선택해 주세요.");
            return;
        }
        // fn.method="get";
        // fn.action = "/memReg";
        // fn.submit();
        $.ajax({
            type : "GET",            // HTTP method type(GET, POST) 형식이다.
            url : "/memReg",       // 컨트롤러에서 대기중인 URL 주소이다.
            data : {
                temail : $("#temail").val(),
                tname : $("#tname").val(),
                tpwd : $("#tpwd").val(),
                tpwd2 : $("#tpwd2").val(),
                thobby : $("input[name=thobby]:checked").val(),
                taddr : $("select[name=taddr]").val()
            },
            dataType:'json',
            contentType: 'json',
            success : function(data){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
                console.log(data);
                var resultHtml = "";
                resultHtml += "이메일: "+data.temail+"<br>";
                resultHtml += "이름: "+data.tname+"<br>";
                resultHtml += "비밀번호: "+data.tpwd+"<br>";
                resultHtml += "취미: "+data.thobby+"<br>";
                resultHtml += "거주지역: "+data.taddr+"<br>";
                $("#resultArea").html(resultHtml);
                // console.log(jsonList.title);
            },
            error : function(request,status,error){ // 비동기 통신이 실패할경우 error 콜백으로   들어옵니다.
                console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
            }
        });
    });//e:$("form").on("submit")

    $("#pwd2").on("keypress",function(){
        passChk=false;
        if(fn.tpwd.value==fn.tpwd2.value) passChk=true;
        console.log(passChk);
    });//e:$("#pwd2").on("keypress")
});//e:$().ready()