$().ready(function(){
    $("#uploadFile").on("change",function(ev){
        const filesList=this.files;
        // $("#btnFile").click();
        fn.method="post";
        fn.action="fu";
        fn.submit();
    });
})