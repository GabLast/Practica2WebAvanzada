package edu.pucmm.practica2webadvanced.Controllers;

import edu.pucmm.practica2webadvanced.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MessageSource messageSource;

    @Autowired private UserServices userServices;

    @GetMapping("/auth")
    public String home(Model model, Locale locale, @RequestParam Optional<String> error){

        model.addAttribute("title", messageSource.getMessage("title", null, locale));
        model.addAttribute("inicio", messageSource.getMessage("inicio", null, locale));
        model.addAttribute("manejar-mocks", messageSource.getMessage("manejar-mocks", null, locale));
        model.addAttribute("viewMocks", messageSource.getMessage("viewMocks", null, locale));
        model.addAttribute("crearMock", messageSource.getMessage("crearMock", null, locale));
        model.addAttribute("welcome", messageSource.getMessage("welcome", null, locale));
        model.addAttribute("username", messageSource.getMessage("username", null, locale));
        model.addAttribute("password", messageSource.getMessage("password", null, locale));
        model.addAttribute("login", messageSource.getMessage("login", null, locale));
        model.addAttribute("noUser", messageSource.getMessage("noUser", null, locale));
        model.addAttribute("error", error);
        model.addAttribute("send", messageSource.getMessage("send", null, locale));

        return "/Login";
    }

}
