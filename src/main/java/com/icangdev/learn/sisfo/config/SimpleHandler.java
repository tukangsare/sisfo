package com.icangdev.learn.sisfo.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class SimpleHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
    for(GrantedAuthority auth:authentication.getAuthorities())
    {
        if ("admin".equals(auth.getAuthority()))
        {
            httpServletResponse.sendRedirect("/admin/home");
        }
        if ("dosen".equals(auth.getAuthority()))
        {
            httpServletResponse.sendRedirect("dosen/home");
        }
        if  ("mahasiswa".equals(auth.getAuthority()))
        {
            httpServletResponse.sendRedirect("mahasiswa/home");
        }
    }
    }
}
