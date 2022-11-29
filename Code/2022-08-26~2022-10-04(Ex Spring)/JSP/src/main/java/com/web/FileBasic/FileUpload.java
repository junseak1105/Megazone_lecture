package com.web.FileBasic;

import jdk.jfr.ContentType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.StringTokenizer;


@MultipartConfig(
        maxFileSize = 1024 * 1024 * 5, //5m
        maxRequestSize = 1024 * 1024 * 50 //50m
)

@WebServlet(name = "fu", value = "/fu")
public class FileUpload extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FileUpload(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filePath = "C:\\DEV\\Github\\Megazone_lecture\\upload_files";
        String firstName;
        String exName;
        String orgName;
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //================================================================================================
//        Part part =request.getPart("uploadFile"); //request getparameter과 동일
        Collection<Part> parts = request.getParts();

        for(Part part : parts){
            orgName = part.getSubmittedFileName();

            firstName = orgName.substring(0, orgName.lastIndexOf("."));
            exName = orgName.substring(orgName.lastIndexOf("."));

            File file = new File(filePath + "\\" + orgName);
            String regName = orgName;
            int cnt=1;
            while(file.exists()){
                regName = firstName+ cnt++ + exName;
                file = new File(filePath+"\\"+regName);
            }
            part.write(filePath+"\\"+regName);

            out.println("<a href='fd?fileName="+regName+"'>"+regName+"</a><br>");
        }
    }
}
