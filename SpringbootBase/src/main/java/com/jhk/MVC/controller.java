package com.jhk.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/MVC")
public class controller {
    @RequestMapping("/{path}.do")
    public ModelAndView Basedo(@PathVariable String path, HttpServletRequest request) {
        switch (path) {
            case "join":
                return MemLogin.chkLogin(request);
            case "login":
                return new ModelAndView("/MVC/login");
            case "logout":
                return MemLogin.chkLogout(request);
            default:
                return null;
        }
    }
}
