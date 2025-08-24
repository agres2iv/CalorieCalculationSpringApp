package com.example.demo.Controllers;

import com.example.demo.Entity.Product;
import com.example.demo.repo.JournalRepository;
import com.example.demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

/**
 * TODO Для форматирования использовать reformatCode
 */
@Controller
    public class ProductController {

        @Autowired
        private ProductRepository productRepository;

        private final JournalRepository journalRepository;

        public ProductController(JournalRepository journalRepository) {
            this.journalRepository = journalRepository;
        }

    //TODO Исправить путь на /product
    @GetMapping("/journal")
    public String productMain(Model model) {
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("productMain", products);
        return "/journal";
    }

    //TODO Исправить путь на product/add
        @PostMapping("/add-product")
        public String addProduct(@RequestParam String title, Double Kcal, String Commentary,  Model model) {
            Product product = new Product(title, Kcal, Commentary);
            productRepository.save(product);
            return "redirect:/journal";
        }

    //TODO Исправить путь на product/{id}
        @GetMapping("/journal/{id}")
    public String productDetails(@PathVariable(value = "id") Long id, Model model) {
            Optional<Product> product = productRepository.findById(id);
            ArrayList<Product> res = new ArrayList<>(); //Зачем коллекция?
            product.ifPresent(res::add);
            model.addAttribute("productD", res);
            return "product-details";
        }

    //TODO Исправить путь на product/{id}/edit
    @GetMapping("/journal/{id}/edit")
    public String productEdit(@PathVariable(value = "id") Long id, Model model) {
        if(!productRepository.existsById(id)) {
            return "redirect:/journal";
        }
        Optional<Product> product = productRepository.findById(id);
        ArrayList<Product> res = new ArrayList<>(); //Зачем коллекция?
        product.ifPresent(res::add);
        model.addAttribute("productD", res);
        return "product-edit";
    }

    //TODO Исправить путь на product/{id}/edit
    @PostMapping("/journal/{id}/edit")
    public String productUpdate(@PathVariable(value = "id") Long id, @RequestParam String title, Double Kcal, String Commentary,  Model model) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setProductName(title);
        product.setKcal(Kcal);
        product.setProductCommentary(Commentary);
        productRepository.save(product);
        return "redirect:/journal";
    }

    //TODO Исправить путь на product/{id}/remove
    @PostMapping("/journal/{id}/remove")
    public String productDelete(@PathVariable(value = "id") Long id,  Model model) {
        Product product = productRepository.findById(id).orElseThrow();
        productRepository.delete(product);
        return "redirect:/journal";
    }

    }

//TODO Писать заметки вверху класса
//TODO Сделать удаление
//TODO Создать кнопку на отмену добавления нового продукта, путем редиректа в журнал