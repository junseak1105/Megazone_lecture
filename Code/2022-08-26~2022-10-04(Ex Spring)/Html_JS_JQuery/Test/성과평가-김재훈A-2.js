var menu_1 = 0;
var menu_2 = 0;
var menu_3 = 0;

function showResult() {
    var total = (menu_1*6000) + (menu_2*7000) + (menu_3*8000);
    var cnt = menu_1+menu_2+menu_3;
    var result = "<b>주문해주셔서 감사합니다</b><br>";
    result+="- 자장면 "+menu_1+"그릇 "+(menu_1*6000)+"원"
    result+="<br>- 짬뽕 "+menu_2+"그릇 "+(menu_2*7000)+"원"
    result+="<br>- 탕수육 "+menu_3+"그릇 "+(menu_3*8000)+"원"
    result+="<br> "+cnt+"분이 주문하셨습니다.";
    result+="<br> 총 요금은 "+total+"원 입니다.";
    //append result
    $("#viewArea").append(result);
}

$().ready(function () {

    $("#btn").on("click", function (ev) {
            while (true) {
                if (!confirm("주문하시겠습니까?")) {
                    showResult();
                    break;
                } else {
                    //show prompt
                    var menu = "[메뉴]\n1.자장면:6000원\n2.짬뽕:7000원\n3.볶음밥:8000원";
                    var result = prompt(menu);
                    switch (result) {
                        case "1":
                            menu_1++;
                            break;
                        case "2":
                            menu_2++;
                            break;
                        case "3":
                            menu_3++;
                            break;
                        default:
                            //if result is number
                            if (isNaN(result)||result==""||result==null) {
                                alert("메뉴가 입력되지 않았습니다.");
                            } else {
                                alert("없는 메뉴입니다.");
                            }
                    }
                }

            }
        }
    )
    ;
});