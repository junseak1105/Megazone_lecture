package com.web.FileBasic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletFileDownload", value = "/fd")
public class FileDownload extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public FileDownload(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String fileName = request.getParameter("fileName");
        String folder = "C:\\DEV\\Github\\Megazone_lecture\\upload_files";
        String filePath = folder + "\\" + fileName;

        byte[] b = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(filePath);

        String sMimeType = getServletContext().getMimeType(filePath);
        if(sMimeType == null){
            sMimeType = "application/octet-stream";
        }
        response.setContentType(sMimeType);
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

        ServletOutputStream stream = response.getOutputStream();
        int read;
        while((read=fileInputStream.read(b,0,b.length)) != -1){
            stream.write(b, 0, read);
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
