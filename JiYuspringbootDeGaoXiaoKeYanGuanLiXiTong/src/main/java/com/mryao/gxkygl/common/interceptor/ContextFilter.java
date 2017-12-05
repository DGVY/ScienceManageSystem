package com.mryao.gxkygl.common.interceptor;

import com.mryao.gxkygl.common.context.ContextData;
import com.mryao.gxkygl.common.context.ContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/15 21:59
 * @Description: 上下文拦截器
 * @Version: 1.0
 */
@WebFilter(urlPatterns = "/*")
@Order(1)
@Component
public class ContextFilter implements Filter{

    private static final Logger logger = LoggerFactory.getLogger(ContextFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse rep = (HttpServletResponse) response;
        logger.info("sessionId:" + req.getSession().getId());
        ContextData contextData = new ContextData();
        contextData.setRequest(req);
        contextData.setResponse(rep);
        ContextUtils.setContexeData(contextData);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
