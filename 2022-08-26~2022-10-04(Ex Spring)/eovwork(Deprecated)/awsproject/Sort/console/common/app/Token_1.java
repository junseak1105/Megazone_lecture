package console.common.app;

import java.util.StringTokenizer;

public class Token_1 {
    public static void main(String[] args) {

        String home = "홈:가이드:직업:기술계산기:기술&문서:아이템:제작&보석:세계관:추종자";
        StringTokenizer token = new StringTokenizer(home,":");
        while(token.hasMoreElements()){
            System.out.println(token.nextToken());
        }

    }
}
