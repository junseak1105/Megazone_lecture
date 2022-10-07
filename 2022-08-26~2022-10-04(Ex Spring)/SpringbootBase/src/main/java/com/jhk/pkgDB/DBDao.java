package com.jhk.pkgDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBDao {
    private Connection conn;
    private ResultSet rs;

    public void dbConnect() {
        try {
            String url = "jdbc:mysql://61.98.217.46:3306/study";
            String user = "june1105";
            String password = "(rla)wogns0249";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<DBBean> getList(int pageNum,int groupNum){
        ArrayList<DBBean> boardList = new ArrayList<>();

        try{
         dbConnect();
         String SQL = "select fidx,fpart from tboard_part order by fidx desc limit "+pageNum+","+groupNum+";";
         PreparedStatement pstmt = conn.prepareStatement(SQL);
         rs = pstmt.executeQuery();
         while (rs.next()) {
             DBBean dbBean = new DBBean();
             dbBean.setIdx(rs.getInt("fidx"));
             dbBean.setPart(rs.getString("fpart"));
             boardList.add(dbBean);
         }
        }catch (Exception e){
            e.printStackTrace();
        }


        return boardList;
    }
}
