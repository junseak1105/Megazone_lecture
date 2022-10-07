package com.jhk.BeanEx;

import com.jhk.pkgBoard.BbsDAO;
import com.jhk.pkgBoard.FileSystem_multipart;
import com.jhk.pkgBoard.QuestionBoard.QForm;
import com.jhk.pkgBoard.QuestionBoard.QFormGroup;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/beanEx")
public class BeanController {


    @RequestMapping("/{path}")
    public String Beanurl(@PathVariable String path) {
        return "/beanEx/" + path;
    }

    @RequestMapping("/login")
    public ModelAndView login(
            @ModelAttribute BeanEx beanEx,
            HttpServletRequest request
    ) throws ServletException, IOException {
        ModelAndView mv = new ModelAndView();
        if (beanEx.getUserId().equals("admin") && beanEx.getUserPw().equals("1234")) {
            HttpSession session = request.getSession();
//            System.out.println(beanEx.getUserId()+"="+beanEx.getUserPw());
            session.setAttribute("sessName", beanEx.getUserName());
            session.setAttribute("sessId", beanEx.getUserId());
            session.setAttribute("sessPw", beanEx.getUserPw());
            mv.setViewName("/beanEx/join");
        }else{
            mv.setViewName("/beanEx/BeanEx1");
        }

        return mv;
    }
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "/beanEx/BeanEx";
    }
}
