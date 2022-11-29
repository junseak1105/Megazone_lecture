package com.jhk.pkgBoard;

import com.jhk.pkgBoard.BbsDAO;
import com.jhk.pkgBoard.QuestionBoard.QForm;
import org.json.simple.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileSystem_multipart {
    public static final String FILE_PATH = "C:\\DEV\\Github\\Megazone_lecture\\upload_files\\";

    public FileSystem_multipart() {
    }

    /**
     * MultiPartFile 기반 시스템
     *
     * @param files
     * @return
     */
    public JSONObject uploadFile(QForm questionForm) {
        //DB연결
        BbsDAO bbs = new BbsDAO();
        bbs.bbsConnect();
        String query ="";
        ArrayList<String> query_values = new ArrayList<String>();

        List<MultipartFile> files = questionForm.getFile();
        String fileName = "";
        String firstName = "";
        String orgName = "";
        String exName = "";
        int idx = bbs.getGroupIdx("tboard_file","fidx");
        JSONObject jsonObject = new JSONObject();



        for (MultipartFile file : files) {

            if(file.getOriginalFilename().equals("")) {
                jsonObject.put("result", "fail");
                jsonObject.put("fail_file", "파일이 없습니다.");
                return jsonObject;
            }
            orgName = file.getOriginalFilename();
            firstName = orgName.substring(0, orgName.lastIndexOf("."));
            exName = orgName.substring(orgName.lastIndexOf("."));
            String filePath = "C:\\DEV\\Github\\Megazone_lecture\\upload_files";

            //==============파일 중복 체크 후 새 파일명 생성=============
            File file_temp = new File(filePath +"\\"+ orgName);
            fileName = orgName;
            while(file_temp.exists()) {
                long time = System.currentTimeMillis();
                file_temp = new File(filePath +"\\"+ firstName + "_" + time + exName);
                if (!file_temp.exists()) {
                    fileName = firstName + "_" + time + exName;
                    break;
                }

            }
            //디렉토리 없을 경우 생성
            file_temp = new File(filePath);
            if (!file_temp.exists()) {
                file_temp.mkdirs();
            }
            //==============e:파일 중복 체크 후 새 파일명 생성=============

            File dest = new File(filePath+"\\"+fileName);
            try {
                file.transferTo(dest);
                if(jsonObject.getOrDefault("result","").equals("half")) {
                    jsonObject.put("result", "half");
                }else{
                    jsonObject.put("result", "success");
                }
                jsonObject.put("success_file", jsonObject.getOrDefault("success_file","") + fileName+",");
                query_values.add("('"+idx+"', '"+idx+"', '"+orgName+"', '"+fileName+"', '"+file.getSize()+"')");
                idx++;
            } catch (Exception e) {
                if(jsonObject.getOrDefault("result","").equals("success")) {
                        jsonObject.put("result", "half");
                }else{
                        jsonObject.put("result","fail");
                }
                jsonObject.put("fail_file",jsonObject.getOrDefault("fail_file","") + fileName + ",");

                e.printStackTrace();
            }
            //===================e:파일 저장===================

        }//e:for(MultipartFile file : files)

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
    }//e:uploadFile()



}
