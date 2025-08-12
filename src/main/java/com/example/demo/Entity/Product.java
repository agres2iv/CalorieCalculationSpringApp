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
    private Double Kcal;
    private String productCommentary;

//    @ManyToOne
//    @JoinColumn(name = "energy_id")
//    private Energy energy;

    public Product() {
    }


    public Product(String productName, Double kcal, String productCommentary) {
        this.productName = productName;
        Kcal = kcal;
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

    public Double getKcal() {
        return Kcal;
    }

    public void setKcal(Double kcal) {
        Kcal = kcal;
    }

    public String getProductCommentary() {
        return productCommentary;
    }

    public void setProductCommentary(String productCommentary) {
        this.productCommentary = productCommentary;
    }
}


