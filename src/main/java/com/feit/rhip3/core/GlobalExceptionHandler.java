package com.feit.rhip3.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error1";
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        Map map= new HashMap();
        map.put("aaa",111);
        map.put("success",false);
        return map;
    }
}
