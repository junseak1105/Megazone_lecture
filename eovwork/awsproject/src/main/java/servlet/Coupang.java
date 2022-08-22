package servlet;

import DAO.DB_Executer_oracle;
import org.json.simple.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "Coupang", value = "/Coupang")
public class Coupang extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DB_Executer_oracle db = new DB_Executer_oracle();
        String query = "select * from coupang";
        ResultSet rs = db.DB_Ex_query(query);
        //db.DB_Ex_query_nr("insert into members values('testname1','testid1','testemail1')");
        JSONObject json = new JSONObject();
        int i=1;
        try {
            while (rs.next()) {
                JSONObject json_temp = new JSONObject(); //col 이름 모음
                String name = rs.getString("name");
                String memberid = rs.getString("memberid");
                String email = rs.getString("email");

                json_temp.put("name", name);
                json_temp.put("memberid", memberid);
                json_temp.put("email", email);

                json.put(i,json_temp);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(json.toJSONString());
        response.getWriter().print(json.toJSONString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
