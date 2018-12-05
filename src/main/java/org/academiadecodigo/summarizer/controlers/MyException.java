package org.academiadecodigo.summarizer.controlers;

import org.academiadecodigo.summarizer.exceptions.MyGlobalException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class MyException {

    @RequestMapping("/error")
    public String redirectToHome() throws MyGlobalException {

        throw new MyGlobalException("This is an exception message!");
    }
}
