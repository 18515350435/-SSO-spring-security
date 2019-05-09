package com.zc.web.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zc.api.model.common.UserSecurityEntity;
import com.zc.api.model.req.user.MyUser;
import com.zc.web.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JWTLoginFilter extends UsernamePasswordAuthenticationFilter {

    
    private AuthenticationManager authenticationManager;
    public JWTLoginFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req,HttpServletResponse res) throws AuthenticationException {
        return authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        req.getParameter("username"),
                        req.getParameter("password"),
                        new ArrayList<>())
        );
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest req,HttpServletResponse res,FilterChain chain,Authentication auth) throws IOException, ServletException {
         try {
            UserSecurityEntity user=((UserSecurityEntity) auth.getPrincipal());
            Map<String, Object> claims = new HashMap<String, Object>();//创建payload的私有声明（根据特定的业务需要添加，如果要拿这个做验证，一般是需要和jwt的接收方提前沟通好验证方式的）
            claims.put("company", "zccninfo");
            claims.put("team","HBGROUP");
            int exptime = 2*60*60;//超时时间为2小时
            String Authorization = JwtUtil.createJWT(user.getUserid(), user.getUsername(),claims, exptime*1000);
            req.getSession().setAttribute("Authorization",Authorization);
            req.getSession().setMaxInactiveInterval(exptime);
//            res.addHeader("Authorization", "Bearer " + token);
            String callback = req.getParameter("callback");
            if(callback==null||callback.equals("")){
                res.sendRedirect("nocallback.html");
            }
            res.sendRedirect(callback+"?Authorization="+"Bearer " + Authorization);
         } catch (Exception e) {
             //TODO: handle exception
         }  
    }

}