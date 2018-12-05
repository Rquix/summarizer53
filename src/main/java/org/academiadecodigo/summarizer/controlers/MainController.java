package org.academiadecodigo.summarizer.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @RequestMapping("/")
    public String redirectToHome(){
        return "main";
    }
}
