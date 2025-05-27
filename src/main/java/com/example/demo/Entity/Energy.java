package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Energy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double protein;
    private double fat;
    private double carbs;
    private double fibers;
    private double calories;

}
