package ru.unlegit.nyc.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.unlegit.nyc.service.CongratulationService;

@Controller
@AllArgsConstructor
public class HomeController {

    private final CongratulationService service;

    @GetMapping({ "", "/", "/home" })
    public String getHomePage(Model model) {
        model.addAttribute("congratulations", service.getCongratulations(0));

        return "index";
    }
}