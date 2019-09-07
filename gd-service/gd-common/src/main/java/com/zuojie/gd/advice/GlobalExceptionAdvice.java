package com.zuojie.gd.advice;

import com.zuojie.gd.exception.GdException;
import com.zuojie.gd.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * zuojie
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = GdException.class)
    public CommonResponse<String> handlerGbAdvice(HttpServletRequest request, GdException ex){
        CommonResponse<String> response=new CommonResponse<>(-1,"unsuccess error");
        response.setData(ex.getMessage());
        return response;
    }
}
