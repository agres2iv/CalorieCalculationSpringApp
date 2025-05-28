package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {

    @Id
    private int id;
    private String userLogin;
    private String userPassword;
}
