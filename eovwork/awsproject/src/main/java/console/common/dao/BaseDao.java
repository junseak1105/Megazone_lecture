package console.common.dao;

import java.util.ArrayList;
import java.util.List;

public class BaseDao {
    public static String Qutter(int choice,String input) {


        switch (choice) {
            case 1:
                input="'"+input+"',";
                break;

            case 2:
                input="'"+input+"'";
                break;

        }
        return input;
    }
}
