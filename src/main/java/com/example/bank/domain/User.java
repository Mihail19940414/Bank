package com.example.bank.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usr")
public class User {


    private String firstName;
    private String secondName;



    private String userName=firstName+" "+secondName;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Count> counts;

    private String citizenship;
    public String getUserName() {
        return userName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Count> getCounts() {
        return counts;
    }

    public void setCounts(List count) {
        this.counts = count;
    }


    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
