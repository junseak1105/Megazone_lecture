var msg="";

if(avg>=80){
    msg="우수";
}else{
    msg="저조";
}
console.log(msg+"한 학생입니다.");


//성적 계산
const cmdCa=function (kor,eng,mat){
    var kor = kor;
    var eng = eng;
    var mat = mat;
    var tot = kor+eng+mat;
    var avg = tot/3;
    return avg;

}

//판별함수
const ctrFun = function (avg){
    if(avg>=80){
        console.log("우수한 학생입니다.");
    }else{
        console.log("저조한 학생입니다.");
    }
}

//한 학생입니다

//우수한 학생입니다.


ctrFun(cmdCa(80,70,60));