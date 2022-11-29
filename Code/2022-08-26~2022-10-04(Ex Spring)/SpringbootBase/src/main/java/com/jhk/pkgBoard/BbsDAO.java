package com.jhk.pkgBoard;

import com.jhk.pkgBoard.QuestionBoard.QForm;
import com.jhk.pkgBoard.QuestionBoard.QFormGroup;
import org.json.simple.JSONObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BbsDAO {
    private Connection conn;
    private ResultSet rs;

    public void bbsConnect() {
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

    public int getGroupIdx(String tableName, String col) {
        int groupIdx = 0;
        try {
            String sql = "SELECT IFNULL(MAX(" + col + ")+1,1) aidx FROM " + tableName;
            rs = conn.createStatement().executeQuery(sql);
            if (rs.next()) {
                groupIdx = rs.getInt("aidx");
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return groupIdx;
    }

    public int addFile(String SQL) {
        try {
            int rst=0;
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            rst = pstmt.executeUpdate();
            return rst;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    public JSONObject addBoard(QForm qForm, QFormGroup qFormGroup) {
        String SQL = "";
        bbsConnect();
        try {
            int rst =0;

            int idx=0,num=0,group=0,level=0,step=0;
            int qidx;

            SQL = "SELECT IFNULL(MAX(fidx)+1,1) idx,IFNULL(MAX(fnum)+1,1) num FROM tboard;";
//            System.out.println(SQL);

            rs = conn.createStatement().executeQuery(SQL);

            if (rs.next()) {
                idx = rs.getInt("idx"); //질문은 fidx fgroup 동일
                num = rs.getInt("num"); //목록번호(질문은 최대값 +1, 답변은 0)
                group = idx;
            }
            rs.close();

            SQL ="";
            if(Integer.parseInt(qFormGroup.getList())>0) {//답변(add)
                num=0;
                group=Integer.parseInt(qFormGroup.getGroup());
                level=Integer.parseInt(qFormGroup.getLevel())+1;
                step=Integer.parseInt(qFormGroup.getStep());
                // 나보다 큰 level1증가
                SQL = "UPDATE tboard SET fstep=fstep+1 " +
                        "WHERE fgroup="+group+" AND fstep>="+step;
                PreparedStatement pstmt = conn.prepareStatement(SQL);
                rst = pstmt.executeUpdate();
            }else{//질문(new)

            }

            //=============================질문 등록================================
            SQL = "";
            SQL += "insert into tboard(" +
                    "fidx, fnum, fgroup, flevel, fstep, " +
                    "ftop, fheader, fsubject, fcontent, " +
                    "fid, fname, fpassw, " +
                    "fhit, fdeleted, fdate" +
                    ")\n" +
                    "values('" + idx + "', '" + num + "', '" + group + "', '" + level + "', '" + step + "'" +
                    ", '" + (qForm.getTop()==null ? "NO" : "YES") + "', '" + qForm.getHeader() + "', '" + qForm.getSubject() + "', '" + qForm.getContent() + "', " +
                    "'', '" + qForm.getWriter() + "', '" + qForm.getPassword() + "', 0, 'NO', SYSDATE());";

//            System.out.println(SQL);
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            rst = pstmt.executeUpdate();

            if(rst>0) {
                JSONObject json = new JSONObject();
                json.put("idx", idx);
                json.put("group", group);
                json.put("level", level);
                json.put("step", step);
                json.put("num", num);
                return json;
            }else{
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
