package util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Hashtable;

public class CommonUtil {
    static Hashtable hash = new Hashtable();

    public static void BaseCommonPNames(HttpServletRequest request) {
        Enumeration enkey = request.getParameterNames();

        while (enkey.hasMoreElements()) {
            String key = (String) enkey.nextElement();
            String value[] = request.getParameterValues(key);
            hash.put(key, value[0]);
        }
    }

    public static String BaseCommonPNSearch(String inputkey) {
        Enumeration enkey = hash.keys();
        String value = null;
        while (enkey.hasMoreElements()) {
            String keyvalue = enkey.nextElement().toString();
            if (keyvalue.equals(inputkey)) {
                value = hash.get(keyvalue).toString();
            }
        }
        return value;
    }
}
