package org.academiadecodigo.summarizer.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle(Exception ex){
        return "error";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = MyGlobalException.class)
    public ModelAndView handleClientErrors(HttpServletRequest request, MyGlobalException exception) {

        ModelAndView model = new ModelAndView("/exceptions/error");

        model.addObject("message", exception.getMessage());
        model.addObject("path", request.getContextPath());
        model.addObject("time", new Date(request.getSession().getLastAccessedTime()));
        return  model;
    }
}
