package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private String productCommentary;

    @ManyToOne
    @JoinColumn(name = "energy_id")
    private Energy energy;

    public Product() {
    }


    public Product(String productName, String productCommentary) {
        this.productName = productName;
        this.productCommentary = productCommentary;
    }

}


