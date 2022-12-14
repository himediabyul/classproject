package com.firstcoding.firstapp.filter;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "UTF8Filter", urlPatterns = {"/*"}) // 모든 요청
@Log4j2
public class UTF8Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        log.info("UTF-8 Filter ...");

        // 요청 처리전 처리해야할 코드

        HttpServletRequest req = (HttpServletRequest) request;
        req.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);

        // 응답 처리전 처리해야할 코드
    }
}
