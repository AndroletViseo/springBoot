package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Toto {

    @Id
    @GeneratedValue
    long id;

    String tata;

    public Toto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTata() {
        return tata;
    }

    public void setTata(String tata) {
        this.tata = tata;
    }
}
