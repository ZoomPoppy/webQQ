package com.wm.homework.Interceptor;

import com.wm.homework.Constant.SessionConstant;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zz on 2016-06-20.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{
    private List<String> excludedUrls = Arrays.asList("/login");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUri = request.getRequestURI();
        for (String url : excludedUrls) {
            if (requestUri.endsWith(url)) {
                return true;
            }
        }

        HttpSession session = request.getSession();
        if (session.getAttribute(SessionConstant.USER) == null) {
            throw new Exception();
        } else {
            return true;
        }
    }
}
