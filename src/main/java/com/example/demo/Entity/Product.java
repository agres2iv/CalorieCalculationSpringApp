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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getProductCommentary() {
        return productCommentary;
    }

    public void setProductCommentary(String productCommentary) {
        this.productCommentary = productCommentary;
    }
}


