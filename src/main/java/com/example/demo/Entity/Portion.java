package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Portion {
    @Id
    private int id;
    private String portionName;
    private double portionWeight;
    private String product;

}
