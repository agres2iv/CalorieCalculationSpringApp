package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Portion {
    @Id
    private int id;
    private String portionName;
    private double portionWeight;
    private String product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPortionName() {
        return portionName;
    }

    public void setPortionName(String portionName) {
        this.portionName = portionName;
    }

    public double getPortionWeight() {
        return portionWeight;
    }

    public void setPortionWeight(double portionWeight) {
        this.portionWeight = portionWeight;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
