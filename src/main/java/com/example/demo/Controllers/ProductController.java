package com.example.demo.Controllers;

import com.example.demo.Entity.Product;
import com.example.demo.repo.JournalRepository;
import com.example.demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

    @Controller
    public class ProductController {

        @Autowired
        private ProductRepository productRepository;

        private final JournalRepository journalRepository;

        public ProductController(JournalRepository journalRepository) {
            this.journalRepository = journalRepository;
        }


        @GetMapping("/add-product")
        public String showAddProductForm() {
            return "add-product"; // название HTML файла в templates
        }

        @PostMapping("/add-product")
        public String addProduct(@RequestParam String title, Double Kcal, String Commentary,  Model model) {
            Product product = new Product(title, Kcal, Commentary);
            productRepository.save(product);
            return "redirect:/journal";
        }
    }

//TODO Доделать добавление
//TODO Сделать удаление
//TODO Создать кнопку на отмену добавления нового продукта, путем редиректа в журнал