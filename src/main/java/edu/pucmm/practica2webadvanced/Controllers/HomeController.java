package edu.pucmm.practica2webadvanced.Controllers;

import edu.pucmm.practica2webadvanced.Models.User;
import edu.pucmm.practica2webadvanced.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
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

    @Autowired private UserServices userServices;

    @GetMapping("/")
    public String index() { return "redirect:/home"; }

    @GetMapping("/home")
    public String home(Authentication auth, Model model, Locale locale){

        model.addAttribute("title", messageSource.getMessage("title", null, locale));
        model.addAttribute("inicio", messageSource.getMessage("inicio", null, locale));
        model.addAttribute("manejarmocks", messageSource.getMessage("manejarmocks", null, locale));
        model.addAttribute("viewMocks", messageSource.getMessage("viewMocks", null, locale));
        model.addAttribute("crearMock", messageSource.getMessage("crearMock", null, locale));
        model.addAttribute("welcome", messageSource.getMessage("welcome", null, locale));
        model.addAttribute("gestionmocks", messageSource.getMessage("gestionmocks", null, locale));
        model.addAttribute("signup", messageSource.getMessage("signup", null, locale));
        model.addAttribute("createuser", messageSource.getMessage("createuser", null, locale));
        model.addAttribute("login", messageSource.getMessage("login", null, locale));
        model.addAttribute("logout", messageSource.getMessage("logout", null, locale));
        model.addAttribute("listarusers", messageSource.getMessage("listarusers", null, locale));
        model.addAttribute("admintools", messageSource.getMessage("admintools", null, locale));
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        try{
            User current = userServices.findByUsername(auth.getName());
            model.addAttribute("usuario", current);
            model.addAttribute("admin", current.getRoles().toString().contains("ADMIN"));

        }catch (NullPointerException e)
        {
            System.out.println("No user found");
        }


        return "/Home";
    }
}
