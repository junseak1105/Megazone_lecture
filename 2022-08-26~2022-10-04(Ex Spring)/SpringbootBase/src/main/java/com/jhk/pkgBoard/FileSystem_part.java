package com.jhk.pkgBoard;

import com.jhk.pkgBoard.BbsDAO;
import org.json.simple.JSONObject;

import javax.servlet.http.Part;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;


public class FileSystem_part {
    public static final String FILE_PATH = "C:\\DEV\\Github\\Megazone_lecture\\upload_files\\";

    public FileSystem_part() {
    }


    /**
     * Part기반 파일 시스템
     *
     * @param parts
     * @return
     */
    public JSONObject uploadFile(Collection<Part> parts) {
        //DB연결
        BbsDAO bbs = new BbsDAO();
        bbs.bbsConnect();
        String query = "";
        int idx = bbs.getGroupIdx("tboard_file","fidx");
        ArrayList<String> query_values = new ArrayList<String>();

        JSONObject jsonObject = new JSONObject();

        String fileName = "";
        String firstName = "";
        String orgName = "";
        String exName = "";


        for (Part part : parts) {
            if (part.getName().equals("file")) {
                if(part.getSubmittedFileName().equals("")) {
                    jsonObject.put("result", "fail");
                    jsonObject.put("fail_file", "파일이 없습니다.");
                    return jsonObject;
                }
                orgName = part.getSubmittedFileName();
                firstName = orgName.substring(0, orgName.lastIndexOf("."));
                exName = orgName.substring(orgName.lastIndexOf("."));

                String filePath = "C:\\DEV\\Github\\Megazone_lecture\\upload_files";
                //==============파일 중복 체크 후 새 파일명 생성=============
                File file = new File(filePath +"\\"+ orgName);
                fileName = orgName;
                while(file.exists()) {
                    long time = System.currentTimeMillis();
                    file = new File(filePath +"\\"+ firstName + "_" + time + exName);
                    if (!file.exists()) {
                        fileName = firstName + "_" + time + exName;
                        break;
                    }

                }
                //디렉토리 없을 경우 생성
                file = new File(filePath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                //==============e:파일 중복 체크 후 새 파일명 생성=============

                //===================파일 저장===================
                try {
                    part.write(filePath+"\\"+fileName);
                    if(jsonObject.getOrDefault("result","").equals("half")) {
                        jsonObject.put("result", "half");
                    }else{
                        jsonObject.put("result", "success");
                    }
                    jsonObject.put("success_file", jsonObject.getOrDefault("success_file","") + fileName+",");
                    query_values.add("('"+idx+"', '"+idx+"', '"+orgName+"', '"+fileName+"', '"+part.getSize()+"')");
                } catch (Exception e) {
                    if (fileName == "") {
                        if(jsonObject.getOrDefault("result","").equals("success")) {
                            jsonObject.put("result", "half");
                        }else{
                            jsonObject.put("result","fail");
                        }
                        jsonObject.put("fail_file", "파일이 없습니다.");
                    } else {
                        jsonObject.put("fail_file",jsonObject.getOrDefault("fail_file","") + fileName+ ",");
                    }
                    e.printStackTrace();
                }
                //===================e:파일 저장===================


            }//e:if(part.getName().equals("file"))
        }//e:for(Part part : parts)

        //====================DB 업로드====================
        //query 설정
        query = "insert into tboard_file (" +
                "FIDX, " +
                "FBOARDIDX, " +
                "FFILENAME, " +
                "FSAVENAME, " +
                "FFILESIZE " +
                ") values ";
        for(String value : query_values) {
            query += value + ",";
        }
        query = query.substring(0, query.length()-1)+";";

        System.out.println(query);
        bbs.addFile(query);
        //====================e:DB 업로드====================

        return jsonObject;
    }//e:uploadFile(Collection<Part> parts)

}
