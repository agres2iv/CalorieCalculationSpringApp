package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Energy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private Double protein;
    @Column(nullable = true)
    private Double fat;
    @Column(nullable = true)
    private Double carbs;
    @Column(nullable = true)
    private Double fibers;
    @Column(nullable = true)
    private Double calories;

}
