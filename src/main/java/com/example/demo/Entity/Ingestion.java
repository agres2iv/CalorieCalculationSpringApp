package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Ingestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ingestionName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngestionName() {
        return ingestionName;
    }

    public void setIngestionName(String ingestionName) {
        this.ingestionName = ingestionName;
    }
}
