package com.jhk.pkgDB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/pkgDB")
public class pkgDBcontroller {
    @RequestMapping("/{path}")
    public ModelAndView Basedo(@PathVariable String path, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/pkgDB/" + path);
        return mv;
    }
}
