package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Journal {

    @Id
    private int id;
    private String date;
    @ManyToOne
    @JoinColumn(name = "ingestion_id")
    private Ingestion ingestion;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private double quantity;
    @ManyToOne
    @JoinColumn(name = "portion_id")
    private Portion portion;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
