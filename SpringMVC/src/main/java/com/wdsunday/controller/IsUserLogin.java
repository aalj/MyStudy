package com.wdsunday.controller;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by liangjun on 2016/12/30.
 */
public class IsUserLogin implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");

    }
}
