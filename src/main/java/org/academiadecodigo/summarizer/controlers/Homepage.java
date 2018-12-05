package org.academiadecodigo.summarizer.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/homepage")
public class Homepage {

    @RequestMapping(method = RequestMethod.GET, value = {"", "/"})
    public String homepage(){

        return "/home/home";
    }

    @RequestMapping(method = RequestMethod.GET, value ="/error")
    public String error(RedirectAttributes redirectAttributes){

        redirectAttributes.addFlashAttribute("lastAction", "Hello World");

        return "redirect/homepage";

    }
}
