package edu.pucmm.practica2webadvanced.Controllers;

import edu.pucmm.practica2webadvanced.Models.User;
import edu.pucmm.practica2webadvanced.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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
    @Autowired
    private CharsetServices charsetServices;
    @Autowired
    private HTTPStatusCodeServices httpStatusCodeServices;
    @Autowired
    private ContentTypeServices contentTypeServices;
    @Autowired
    private AccessMethodServices accessMethodServices;

    @GetMapping("/manage")
    public String manage(Model model, Locale locale, Authentication auth){

        model.addAttribute("title", messageSource.getMessage("title", null, locale));
        model.addAttribute("inicio", messageSource.getMessage("inicio", null, locale));
        model.addAttribute("manejar-mocks", messageSource.getMessage("manejarmocks", null, locale));
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

    @GetMapping("/create")
    public String createGet(Model model, Locale locale, Authentication auth){

        model.addAttribute("title", messageSource.getMessage("title", null, locale));
        model.addAttribute("inicio", messageSource.getMessage("inicio", null, locale));
        model.addAttribute("manejar-mocks", messageSource.getMessage("manejarmocks", null, locale));
        model.addAttribute("viewMocks", messageSource.getMessage("viewMocks", null, locale));
        model.addAttribute("crearMock", messageSource.getMessage("crearMock", null, locale));
        model.addAttribute("welcome", messageSource.getMessage("welcome", null, locale));
        model.addAttribute("gestionmocks", messageSource.getMessage("gestionmocks", null, locale));

        model.addAttribute("accessMethod", messageSource.getMessage("accessMethod", null, locale));
        model.addAttribute("charset", messageSource.getMessage("charset", null, locale));
        model.addAttribute("contentType", messageSource.getMessage("contentType", null, locale));
        model.addAttribute("header", messageSource.getMessage("header", null, locale));
        model.addAttribute("mockname", messageSource.getMessage("mockname", null, locale));
        model.addAttribute("statuscode", messageSource.getMessage("statuscode", null, locale));
        model.addAttribute("fechaexpire", messageSource.getMessage("fechaexpire", null, locale));
        model.addAttribute("createMock", messageSource.getMessage("createMock", null, locale));
        model.addAttribute("create", messageSource.getMessage("create", null, locale));
        model.addAttribute("name", messageSource.getMessage("name", null, locale));
        model.addAttribute("body", messageSource.getMessage("body", null, locale));
        model.addAttribute("jsonFormat", messageSource.getMessage("jsonFormat", null, locale));

        model.addAttribute("hora", messageSource.getMessage("hora", null, locale));
        model.addAttribute("dia", messageSource.getMessage("dia", null, locale));
        model.addAttribute("semana", messageSource.getMessage("semana", null, locale));
        model.addAttribute("mes", messageSource.getMessage("mes", null, locale));

        model.addAttribute("listCodes", httpStatusCodeServices.findAll());
        model.addAttribute("listCharset", charsetServices.findAll());
        model.addAttribute("listContentType", contentTypeServices.findAll());
        model.addAttribute("listAccessMethod", accessMethodServices.findAll());


        return "/users/CreateMock";
    }
}
