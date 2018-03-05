package com.ly.filter;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

@Component
@ServletComponentScan
@WebFilter(urlPatterns = {"/meeting/*", "/manager/*"}, filterName = "loginFilter")
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        if (!check(servletRequest)) {
            httpResponse.sendRedirect("/login");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public boolean check(ServletRequest servletRequest) {
        Cookie[] cookies = ((HttpServletRequest) servletRequest).getCookies();
        if (cookies == null) {
            return false;
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("login")) {
                    if (cookie.getValue().equals("success")) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public void destroy() {

    }
}
