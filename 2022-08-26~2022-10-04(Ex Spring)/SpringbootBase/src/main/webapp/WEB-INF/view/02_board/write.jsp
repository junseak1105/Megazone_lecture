<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 글쓰기</title>
    <link href="css/style.css" rel="stylesheet"/>
    <script src="https://code.jquery.com/jquery-3.6.1.js"></script>
    <script src="js/board_common.js"></script>
</head>
<body>
<div id="container">
    <h3><span>질문</span>게시판</h3>
    <form name="fn" id="fn" enctype="multipart/form-data">
        <input type="hidden" name="idx" id="idx" value="${result.board_info.idx}"/> <!--1이면 답변 0이면 질문-->
        <input type="hidden" name="group" id="group" value="${result.board_info.group}"/>
        <input type="hidden" name="level" id="level" value="${result.board_info.level}"/>
        <input type="hidden" name="step" id="step" value="${result.board_info.step}"/>
        <input type="hidden" name="list" id="list" value="${result.board_info.num}"/>
        <ul class="tableBox">
            <li class="row">
                <div class="cell"><label for="header">상단고정</label></div>
                <div class="cell">
                    <input type="checkbox" name="top" id="top" value="Yes">
                    <label for="top">게시판 상단에 위치시키실 경우 선택하세요</label>
                </div>
            </li>
            <li class="row">
                <div class="cell"><label for="header">머릿글</label></div>
                <div class="cell">
                    <select name="header" id="header">
                        <option value="">== 선택 ==</option>
                        <option value="1">학습</option>
                        <option value="2">생활</option>
                        <option value="3">취업</option>
                        <option value="4">고민</option>
                        <option value="5">과정</option>
                        <option value="6">공지</option>
                    </select>
                </div>
            </li>
            <li class="row">
                <div class="cell">
                    <label for="writer">작성자</label>
                </div>
                <div class="cell">
                    <input type="text" name="writer" id="writer">
                </div>
            </li>
            <li class="row">
                <div class="cell">
                    <label for="subject">제목</label>
                </div>
                <div class="cell">
                    <input type="text" name="subject" id="subject" value=""/>
                </div>
            </li>
            <li class="row">
                <div class="cell">
                    <label for="content">내용</label>
                </div>
                <div class="cell">
                    <textarea name="content" id="content"></textarea>
                </div>
            </li>
            <li class="row">
                <div class="cell">
                    <label for="password">비밀번호</label>
                </div>
                <div class="cell">
                    <input type="password" name="password" id="password"/>
                </div>
            </li>
            <li class="row">
                <div class="cell">
                    <label for="file">파일</label>
                </div>
                <div class="cell">
                    <ul id="filelist" class="fl">
                        <li>파일목록</li>
                    </ul>
                    <div class="findArea">
                        <span id="btnFileUpload" class="btn">파일찾기</span>
                        <span id="file_cnt"></span>
                        <input type="file" name="file" id="file" multiple/>
                    </div>

                </div>
            </li>
        </ul>
    </form>
    <div class="boardFooter cl">
        <span class="btn" id="btnReg">저장</span>
        <span class="btn" id="btnCan">취소</span>
    </div>
</div>
</body>
</html>