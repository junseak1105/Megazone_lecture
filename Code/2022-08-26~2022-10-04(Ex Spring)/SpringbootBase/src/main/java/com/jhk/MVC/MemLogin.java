package com.jhk.MVC;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemLogin {
    public static ModelAndView chkLogin(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");
        String userName = request.getParameter("userName");
        if (userId.equals("admin") && userPw.equals("1234")) {
            HttpSession session = request.getSession();
//            System.out.println(beanEx.getUserId()+"="+beanEx.getUserPw());
            session.setAttribute("sessName", userId);
            session.setAttribute("sessId", userPw);
            session.setAttribute("sessPw", userName);
            mv.setViewName("/MVC/join");
        }else{
            mv.setViewName("/MVC/login_fail");
        }

        return mv;
    }
    public static ModelAndView chkLogout(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        session.invalidate();
        mv.setViewName("/MVC/login");
        return mv;
    }
}
