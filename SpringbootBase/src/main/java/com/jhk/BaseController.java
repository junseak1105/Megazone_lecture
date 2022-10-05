package com.jhk;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseController {
    @RequestMapping("/{path}")
    public String Baseurl(@PathVariable String path) {
        return path;
    }



}
