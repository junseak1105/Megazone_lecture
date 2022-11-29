/*
Front
#test:어떤 용도
------------------------------------
전역변수
num: 숫자, 점수 저장
 */
//변수선언

/*
지역변수, 함수명 및 함수 목적
변수명: 목적
 */

var num1 = 5;
var num2 = 3;
console.log(num1+num2);
console.log(num1-num2);
console.log(num1*num2);
console.log(num1/num2);
console.log(num1%num2);

result = Math.floor((num1/num2));

console.log(result);

console.log(num=5); //5
console.log(num+=5);//10
console.log(num-=5);//5
console.log(num*=5);//25
console.log(num/=5);//5
console.log(num%=5);//0

var num= 10;
console.log("홍길동은 " +num +"살이다.");
console.log("홍길동은 " +num+5 +"살이다.");
console.log(num+10 +"개의 사과.");
console.log("홍길동은 " +(num+5) +"살이다.");

console.log(num==10); //true
console.log(num!=10); //false
console.log(num===10); //true
console.log(num==="10"); //false
console.log(num!=="10"); //true

console.log(true||false||false); //true
console.log(true&&true&&false); //false
console.log(true&& !(true&&false)); //true


var kor = 80;
var mat = 70;
var eng = 60;

console.log((kor>mat)&&((eng>kor)||(eng>=mat)));
console.log((80>70)&&((60>80)||(60>=70)));


function cmd_1(){
    console.log("함수 선언 1");
}

const cmd_2 = function(){
    var sum;
    var num=5;
    sum = num+8;
    console.log("num:"+num+", sum:"+sum);
}
cmd_1();
cmd_2();
//e:함수명()
