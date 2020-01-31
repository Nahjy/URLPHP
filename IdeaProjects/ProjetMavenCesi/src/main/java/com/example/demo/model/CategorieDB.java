package com.example.demo.model;

import javax.validation.constraints.NotBlank;
import javax.persistence.*;
@Entity
@Table(name = "categorie")
public class CategorieDB {
    @Id
    @GeneratedValue
    private Long id;
    //@NotBlank
    //private String book_name;

    public CategorieDB(){
        this((long) 0);
    }
    public CategorieDB(Long id) {
        super();
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}