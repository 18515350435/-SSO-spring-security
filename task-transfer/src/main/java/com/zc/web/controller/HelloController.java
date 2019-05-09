package com.zc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@Controller
public class HelloController {
 
    @RequestMapping("/goLogin")
    public void goLogin(HttpServletResponse res,String callback) throws IOException {

        res.sendRedirect("logintest.html?callback="+callback);
    }
}