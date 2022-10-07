const get_grade = function (grade) {
    var sum = 0;
    for(key in grade){
        sum+=grade[key];
    }
    var avg =  sum/3;
    var grade = {'avg': avg, 'sum': sum};
    return grade;
}

const create_msg = function (info,grade) {
    var msg = "";
    var sex = "여학생";
    var savg = "저조";

    //남녀구분
    if (info.sex == 1) sex = "남학생";

    //성적 메세지
    // if (grade.avg >= 80) savg = "우수"
    // else if (grade.avg >= 60) savg = "평균"
    // else savg = "저조";

    //1형식
    if(grade.avg >= 90) savg="수";
    if(grade.avg < 90 && grade.avg >=80) savg="우";
    if(grade.avg < 80 && grade.avg >= 70) savg="미";
    if(grade.avg < 70 && grade.avg >= 60) savg="양";
    if(grade.avg < 60 && grade.avg >= 0) savg="가";

    //3형식
    if(grade.avg >=90) savg="수"
    else if(grade.avg>=80) savg="우"
    else if(grade.avg>=70) savg="미"
    else if(grade.avg>=60) savg="양"
    else savg="가";

    //출력할 메세지
    // msg = sex + " " + info.name + "님은 성적이 " + savg + "한 학생입니다.";
    msg = "이번 성적은 '"+savg+"' 입니다.";

    return msg;
}
const execute = function () {
    var msg = create_msg({'name': "김재훈", 'sex': 1},get_grade({'kor': 70, 'eng': 80, 'mat': 90}));
    
    console.log(msg);
}

execute();