package com.example.demo.Controllers;

import com.example.demo.Entity.Energy;
import com.example.demo.Entity.Product;
import com.example.demo.Service.EnergyService;
import com.example.demo.repo.EnergyRepository;
import com.example.demo.repo.JournalRepository;
import com.example.demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

/**
 * TODO Для форматирования использовать reformatCode
 */
@Controller
public class ProductController {

    private final JournalRepository journalRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private EnergyRepository energyRepository;
    @Autowired
    private EnergyService energyService;

    public ProductController(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    //TODO Исправить путь на /product
    @GetMapping("/product")
    public String productMain(Model model) {
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("productMain", products);
        return "product";
    }

    //TODO Исправить путь на product/add
    @PostMapping("/add-product")
    public String addProduct(@RequestParam String title, String Commentary, Double protein, Double carbs, Double fat, Model model) {
        Energy energy = energyService.createEnergy(protein, carbs, fat);
        Product product = new Product(title, Commentary);
        product.setEnergy(energy);
        productRepository.save(product);
        return "redirect:/product";
        /*
           private Long id;
    private Double protein;
    private Double fat;
    private Double carbs;
    private Double fibers;
    private Double calories;
         */
    }

    //TODO Исправить путь на product/{id}
    @GetMapping("/product/{id}")
    public String productDetails(@PathVariable(value = "id") Long id, Model model) {
        Optional<Product> product = productRepository.findById(id);
        ArrayList<Product> res = new ArrayList<>(); //Зачем коллекция?
        product.ifPresent(res::add);
        model.addAttribute("productD", res);

        return "product-details";
    }

    //TODO Исправить путь на product/{id}/edit
    @GetMapping("/product/{id}/edit")
    public String productEdit(@PathVariable(value = "id") Long id, Model model) {
        if (!productRepository.existsById(id)) {
            return "redirect:/product";
        }
        Optional<Product> product = productRepository.findById(id);
        ArrayList<Product> res = new ArrayList<>(); //Зачем коллекция?
        product.ifPresent(res::add);
        model.addAttribute("productD", res);
        return "product-edit";
    }

    //TODO Исправить путь на product/{id}/edit
    @PostMapping("/product/{id}/edit")
    public String productUpdate(@PathVariable(value = "id") Long id, @RequestParam String title, Double Kcal, String Commentary, Model model) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setProductName(title);
        product.setProductCommentary(Commentary);
        productRepository.save(product);
        return "redirect:/product";
    }

    //TODO Исправить путь на product/{id}/remove
    @PostMapping("/product/{id}/remove")
    public String productDelete(@PathVariable(value = "id") Long id, Model model) {
        Product product = productRepository.findById(id).orElseThrow();
        productRepository.delete(product);
        return "redirect:/product";
    }

}

//TODO Писать заметки вверху класса
