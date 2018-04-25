package com.springboot.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @auther zhangchy
 * @create 2018/2/24
 */
@Component
@WebFilter(filterName = "initFilter",urlPatterns = "/config/*")
//控制顺序
//控制顺序
//UserLoginFilter.java 和 ApiLog.java 这两个文件里面分别是“用户登录检查过滤器”和“接口日志过滤器”，因为这两个文件的 首字母A排U之前 ，导致每次执行的时候都是先执行“接口日志过滤器”再执行“用户登录检查过滤器”，所以我们现在修改两个文件的名称分别为
//
//        Filter0_UserLogin.java
//
//        Filter1_ApiLog.java
//
//        这样就能先执行“用户登录检查过滤器”再执行“接口日志过滤器”
public class InitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //服务器启动的时候就会初始化..
        System.out.println("filter初始化了。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(1111111);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
