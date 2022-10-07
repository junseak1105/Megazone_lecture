//package Sort.j20220822.dao;
//
//import Sort.j20220822.bean.Gwang_1Bean;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class Gwang_1Dao extends BaseDao{
//
//    public boolean Gwang_login_chk(String dbselect){
//        try {
//            Statement stat = null;
//            if(dbselect.equals("oracle")){
//                stat = getOracleConnection().createStatement();
//
//            }else{
//                stat = getMySqlConnection().createStatement();
//            }
//            String userid = CommonUtil.BaseCommonPNSearch("userid");
//            String userpw = CommonUtil.BaseCommonPNSearch("passwd");
//            String query = "select * from gwang_member where userid='"+userid+"' and passwd = '"+userpw+"'";
//            System.out.println(query);
//            ResultSet rs = stat.executeQuery(query);
//
//            if(rs.next()){
//                return true;
//            }else{
//                return false;
//            }
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public ArrayList Gwang_member(String dbselect){
//        ArrayList list = new ArrayList();
//        try {
//            Statement stat = null;
//            if(dbselect.equals("oracle")){
//                stat = getOracleConnection().createStatement();
//            }else{
//                stat = getMySqlConnection().createStatement();
//            }
//
//            ResultSet rs = stat.executeQuery("select * from gwang_member");
//
//            while(rs.next()){
//                Gwang_1Bean bean = new Gwang_1Bean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
//                list.add(bean);
//            }
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return list;
//    }
//    public Gwang_1Dao() {
//
//    }
//}
