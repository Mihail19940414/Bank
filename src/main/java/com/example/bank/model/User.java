package com.example.bank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usr")
public class User {

    private String firstName;
    private String secondName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Float count;
    private Character value;
    private String citizenship;


    public User() {
    }
}
