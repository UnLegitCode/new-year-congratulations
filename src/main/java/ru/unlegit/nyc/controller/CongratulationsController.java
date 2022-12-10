package ru.unlegit.nyc.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.unlegit.nyc.model.Congratulation;
import ru.unlegit.nyc.service.CongratulationService;

@Controller
@AllArgsConstructor
@RequestMapping("/congratulations")
public class CongratulationsController {

    private final CongratulationService service;

    @PostMapping
    public String addCongratulation(Congratulation congratulation) {
        service.save(congratulation);

        return "redirect:/home";
    }
}