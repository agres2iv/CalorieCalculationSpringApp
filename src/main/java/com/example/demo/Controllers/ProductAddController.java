package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class ProductAddController {

    //TODO Изменить путь на /product/add
    //TODO перенести в ProductController
    //Сама страница с кнопкой
    @GetMapping("journal/product-add")
    public String addJournal(Model model) {
        return "add-product";
    }
}
