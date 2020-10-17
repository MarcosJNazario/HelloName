package br.edu.usj.ads.lpii.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class helloname {
    
    @PostMapping(value="name")
    public ModelAndView postHelloName(@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView("helloname");
        
        String bemVindo = "Welcome, " + name + "!";

        modelAndView.addObject("mensagem", bemVindo);

        return modelAndView;
    }
    
}
