package ru.gb.HW4_HW4_SPRING.HomeWork_4_Spring.MVC.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.HW4_HW4_SPRING.HomeWork_4_Spring.MVC.models.Visitor;
import ru.gb.HW4_HW4_SPRING.HomeWork_4_Spring.MVC.repository.VisitorsRepository;

@Controller
@AllArgsConstructor
public class ExampleController {
    private final VisitorsRepository visitorsRepository;

    @GetMapping("/visitors")
    public String getVisitors(Model model) {
        model.addAttribute("visitors", visitorsRepository.getVisitors());
        return "visitors";
    }

    @PostMapping("/visitors")
    public String addVisitors(Visitor visitor, Model model){
        visitorsRepository.addVisitors(visitor);
        model.addAttribute("visitors", visitorsRepository.getVisitors());
        return "visitors";
    }
}

