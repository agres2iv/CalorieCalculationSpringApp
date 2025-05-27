package com.example.demo.Entity;


import jakarta.persistence.*;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Ingestion getIngestion() {
        return ingestion;
    }

    public void setIngestion(Ingestion ingestion) {
        this.ingestion = ingestion;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
