package org.academiadecodigo.summarizer.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/presentation")
public class Presentation {

    @RequestMapping(method = RequestMethod.GET, value = {"", "/"})
    public String startingPoint(){

        return "/presentation/start";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/next")
    public String pageOne(){

        return "/presentation/next";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/modal")
    public String modalStuff(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("failure", "Well... guys, I think we should focus on the good stuff now... right? Guys...? Houston we have a problem...");

        return "redirect:/presentation/dostuff";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dostuff")
    public String doStuffNow(){

        return "/presentation/modal";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/exception")
    public String trollExceptions(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("lastAction", "Last Action.. you heard this before, right? Guys?... Last Action this!");

        return "redirect:/presentation/exceptions";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/exceptions")
    public String realExceptions(){

        return "/presentation/exceptions";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/aop")
    public String theAOP(){

        return "/presentation/aop";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/finish")
    public String theFinale(){

        return "/presentation/thankyou";
    }


}
