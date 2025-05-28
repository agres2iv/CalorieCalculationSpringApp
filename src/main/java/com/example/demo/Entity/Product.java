package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    private int id;
    private String productName;
    @ManyToOne
    @JoinColumn(name = "energy_id")
    private Energy energy;

}
