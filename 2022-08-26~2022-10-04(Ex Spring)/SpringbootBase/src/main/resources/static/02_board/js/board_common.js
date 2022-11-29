$().ready(function(){
//########################################################################
	//============ 파일을 선택할 경우 ====================
    $("#file").on("change", function() {
		var files = document.getElementById("file").files;
		$("#fileList").empty();
		for (var i = 0; i < files.length; i++) {
			$li = $("<li></li>");
			$li.text(files[i].name);
			$("#filelist").append($li);
		}
		$("#file_cnt").html(files.length+"개");
		console.log("파일선택");
    });//e:$("#file").on("change");
    //============ e:파일을 선택할 경우 ====================
    //============ 저장을 클릭 한경우 ====================
    $("#btnReg").on("click",function() {
		console.log("저장 클릭");
		fn.action="/02_board/CW";
		fn.method="post";
		fn.submit();

		// if(checkForm()){
		// 	var form = $('#fn')[0];
		// 		var formData = new FormData(form);
		//
		// 		$.ajax({
		// 			url: "/02_board/CW",
		// 			type: "post",
		// 			enctype:'multipart/form-data',
		// 			data: formData,
		// 			processData: false,
		// 			contentType: false,
		// 			success: function(data){
		// 				var json = JSON.parse(data);
		// 				console.log(json);
		// 				if(json.file.result == "success"){
		// 					console.log("등록 성공 파일: "+json.file.success_file);
		// 				}else if(json.file.result == "fail"){
		// 					console.log("등록 실패 파일: "+json.file.fail_file);
		// 				}else{
		// 					console.log("등록 성공 파일: "+json.file.success_file);
		// 					console.log("등록 실패 파일: "+json.file.fail_file);
		// 				}
		// 				if(json.board_write=="success"){
		// 					console.log("질문 등록 성공");
		// 				}else{
		// 					console.log("질문 등록 실패");
		// 				}
		//
		// 			},
		// 			error: function(){
		// 				alert("저장실패");
		// 			}
		// 		});
		// }




	});//e:$("#btnReg").on("click");
	//============ e:저장을 클릭한 경우 ====================
	//============ 취소를 클릭한 경우 ====================
	$("#btnCan").on("click",function() {
		console.log("취소 클릭");
	});//
	//============ e:취소를 클릭한 경우 ====================
});
    
//########################################################################


//checkForm() : 입력폼 체크
function checkForm(){
	if($("#header").val() == ""){
		alert("머릿글을 선택해주세요.");
		return false;
	}
	if($("#writer").val() == ""){
		alert("작성자를 선택해주세요.");
		return false;
	}
	if($("#subject").val() == ""){
		alert("제목을 입력해주세요.");
		return false;
	}
	if($("#content").val() == ""){
		alert("내용을 입력해주세요.");
		return false;
	}
	if($("#password").val() == ""){
		alert("비밀번호를 입력해주세요.");
		return false;
	}
	return true;
}
