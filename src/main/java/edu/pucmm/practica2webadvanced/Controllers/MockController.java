package edu.pucmm.practica2webadvanced.Controllers;

import edu.pucmm.practica2webadvanced.Models.User;
import edu.pucmm.practica2webadvanced.Services.MockServices;
import edu.pucmm.practica2webadvanced.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;

import java.util.Locale;

@Controller
@RequestMapping("/mock")
public class MockController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserServices userServices;

    @Autowired
    private MockServices mockServices;

    @GetMapping("/view")
    public String home(Model model, Locale locale, Authentication auth){

        model.addAttribute("title", messageSource.getMessage("title", null, locale));
        model.addAttribute("inicio", messageSource.getMessage("inicio", null, locale));
        model.addAttribute("manejar-mocks", messageSource.getMessage("manejar-mocks", null, locale));
        model.addAttribute("viewMocks", messageSource.getMessage("viewMocks", null, locale));
        model.addAttribute("crearMock", messageSource.getMessage("crearMock", null, locale));
        model.addAttribute("welcome", messageSource.getMessage("welcome", null, locale));

        model.addAttribute("accessMethod", messageSource.getMessage("accessMethod", null, locale));
        model.addAttribute("charset", messageSource.getMessage("charset", null, locale));
        model.addAttribute("contentType", messageSource.getMessage("contentType", null, locale));
        model.addAttribute("header", messageSource.getMessage("header", null, locale));
        model.addAttribute("mockname", messageSource.getMessage("mockname", null, locale));
        model.addAttribute("statuscode", messageSource.getMessage("statuscode", null, locale));
        model.addAttribute("fechacreate", messageSource.getMessage("fechacreate", null, locale));
        model.addAttribute("fechaexpire", messageSource.getMessage("fechaexpire", null, locale));

        User current = userServices.findByUsername(auth.getPrincipal().toString());

        model.addAttribute("listmocks", mockServices.findAllNotDeletedByUser(current));


        return "/users/ManageMocks";
    }
}
