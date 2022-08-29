function CommonLogin(form){
    // userid = form[userid].value;
    // alert(form.name.value+ form.passwd.value + form.age.value + form.address.value  + form.email.value + form.jumin1.value + form.jumin2.value);
    if(form.userid.value==""){
        alert("아이디입력");
        return;
    }
    if(form.passwd.value==""){
        alert("비밀번호입력");
        return;
    }
    form.method="post";
    form.action="/diablologin.do";
    form.submit();
}