function getaavg(kor,eng,math){
    var mKor = kor;
    var mEng = eng;
    var mMat = math;
    var sum=mKor+mEng+mMat;
    var avg = sum/3;
    if(avg>80){
        console.log("우수한 학생입니다.");
    }else{
        console.log("한 학생입니다.");
    }
}
function prt(content){
    console.log(content);
}
getaavg(70,80,90);



