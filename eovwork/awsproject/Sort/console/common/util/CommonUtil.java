package console.common.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class CommonUtil {
    public static Hashtable prequest;


    public static Hashtable getPrequest() {

        if(prequest == null) {
            prequest=new Hashtable();
        }
        return prequest;
    }


    public static Map CommonPNames(HttpServletRequest request) {

        Enumeration enkey = request.getParameterNames();

        while(enkey.hasMoreElements()) {

            String key = enkey.nextElement().toString();
            String value[] = request.getParameterValues(key);
            getPrequest().put(key, value[0]);

            //값이 넘어가는지 안넘어가는지 확인하기 위해 출력해보는것
            System.out.println("key : " + key + "\t value : " + value[0]);
        }

        return getPrequest();
    }

    public static String BaseCommonPNSearch(String inputkey) {
        Enumeration enkey = getPrequest().keys();
        String value = null;
        while (enkey.hasMoreElements()) {
            String keyvalue = enkey.nextElement().toString();
            if (keyvalue.equals(inputkey)) {
                value = getPrequest().get(keyvalue).toString();
            }
        }
        return value;
    }

    public static String IsSearch(String search) {

        search = getPrequest().get(search).toString();

        return search;

    }

    //싱글쿼터 처리하는 것 때문에 만듬
    public static String Qutter(String qutter, int choice) {


        switch (choice) {
            case 1:
                qutter="'"+qutter+"',";
                break;

            case 2:
                qutter="'"+qutter+"'";
                break;


        }
        return qutter;
    }

}

