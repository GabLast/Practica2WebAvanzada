package edu.pucmm.practica2webadvanced.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/")
    public String index() { return "redirect:/home"; }

    @GetMapping("/home")
    public String home(Model model, Locale locale){

        model.addAttribute("title", messageSource.getMessage("title", null, locale));

        return "/Home";
    }
}
