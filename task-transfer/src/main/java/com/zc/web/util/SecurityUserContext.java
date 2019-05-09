package com.zc.web.util;


import com.zc.api.model.common.UserSecurityEntity;

import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUserContext {
    public static String getCurrentUsername() {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  
        if (principal instanceof UserSecurityEntity) {
  
           return ((UserSecurityEntity) principal).getUsername();
  
        }
  
        return "";
  
     }


     public static String getCurrentUserid() {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  
        if (principal instanceof UserSecurityEntity) {
  
           return ((UserSecurityEntity) principal).getUsername();
  
        }
        return "";
  
     }
}