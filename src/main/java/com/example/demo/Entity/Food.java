package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Food {

    @Id
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "energy_id")
    private Energy energy;
}

