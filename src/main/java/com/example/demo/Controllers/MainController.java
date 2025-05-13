package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //<html xmlns:th="http://www.thymeleaf.org">  - шаблонизатор на странице
    //Каждый метод обрабатывает определенный URL адрес.

    @GetMapping("/") // Для обработки главной страницы указываем просто "/"
    public String home(Model model) {
        model.addAttribute("tittle", "Главная страница, толстячок...");
        return "home"; // "HTML шаблон - при переходе на главную страницу будет вызываться именно он"
    }

    @GetMapping("/support")
    public String about(Model model) {
        model.addAttribute("support", "Поддержка");
        return "support";
    }

}

