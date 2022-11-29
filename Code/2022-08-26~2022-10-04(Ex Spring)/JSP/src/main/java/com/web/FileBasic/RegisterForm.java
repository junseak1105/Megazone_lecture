package com.web.FileBasic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.json.JsonArray;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterForm", value = "/memReg")
public class RegisterForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        JSONArray json = new JSONArray();
        JSONObject info_json = new JSONObject();

        String email = request.getParameter("temail");
        String name = request.getParameter("tname");
        String pwd = request.getParameter("tpwd");
        String pwd2 = request.getParameter("tpwd2");
        String hobby = request.getParameter("thobby");
        String addr = request.getParameter("taddr");

        System.out.println(
                "email : " + email + "\n" +
                        "name : " + name + "\n" +
                        "pwd : " + pwd + "\n" +
                        "pwd2 : " + pwd2 + "\n" +
                        "hobby : " + hobby + "\n" +
                        "addr : " + addr + "\n"
        );

        info_json.put("temail", email);
        info_json.put("tname", name);
        info_json.put("tpwd", pwd);
        info_json.put("tpwd2", pwd2);
        info_json.put("thobby", hobby);
        info_json.put("taddr", addr);

//        json.add(info_json);

        response.getWriter().println(info_json.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
