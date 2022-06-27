package com.jackyzeng.structure.common.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Order(value = Ordered.HIGHEST_PRECEDENCE)
@Component
public class CustomExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        try {
            httpServletResponse.sendError(520, "My Preferred Exception Message.");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return new ModelAndView();
    }
}
