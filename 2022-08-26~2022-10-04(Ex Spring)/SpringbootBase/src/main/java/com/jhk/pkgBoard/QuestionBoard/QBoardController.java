package com.jhk.pkgBoard.QuestionBoard;

import com.jhk.pkgBoard.BbsDAO;
import com.jhk.pkgBoard.FileSystem_multipart;
import org.json.simple.JSONObject;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/02_board")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024,
        maxRequestSize = 1024 * 1024 * 5 * 5
)
public class QBoardController {


    @RequestMapping("/{path}")
    public String board_02(
            @PathVariable String path,
            HttpServletRequest request
    ) {
        return "/02_board/" + path;
    }

    @RequestMapping("/CW")
    public ModelAndView board_02(
            @ModelAttribute QForm qForm,
            @ModelAttribute QFormGroup qFormGroup,
            HttpServletRequest request
    ) throws ServletException, IOException {
        FileSystem_multipart fileSystem_multipart = new FileSystem_multipart();
        BbsDAO bbs = new BbsDAO();
        ModelAndView mv = new ModelAndView("jsonView");
        JSONObject result = new JSONObject();

        System.out.println(qFormGroup.toString());
        //MultiPartFile 기반 시스템 파일 업로드
        if (qFormGroup.getList() != null) {
            result.put("file", fileSystem_multipart.uploadFile(qForm));
            result.put("board_info", bbs.addBoard(qForm, qFormGroup));
        } else {
            JSONObject json = new JSONObject();
            json.put("idx", 0);
            json.put("group", 0);
            json.put("level", 0);
            json.put("step", 0);
            json.put("num", 0);
            result.put("board_info", json);
        }


        mv.addObject("result", result);
        mv.setViewName("/02_board/write");

        return mv;

// Part 기반 시스템
//        FileSystem_part fileSystem_part = new FileSystem_part();
//        Collection<Part> parts = null;
//        try {
//            parts = request.getParts();
//            result.put("file",fileSystem_part.uploadFile(parts));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
