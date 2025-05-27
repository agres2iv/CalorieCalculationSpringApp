package com.example.demo.Controllers;

import com.example.demo.Entity.Energy;
import com.example.demo.repo.EnergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BlogController {

    @Autowired
    private EnergyRepository energyRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {

        Iterable<Energy> energies = energyRepository.findAll();
        model.addAttribute("energies", energies);
        return "blog-main";
    }


}
