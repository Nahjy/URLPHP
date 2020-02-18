package com.springboot.example.demo.services;

import com.springboot.example.demo.entities.Categorie;

import java.util.List;

public interface CategorieService {
    Categorie getCategorieById(Integer catId);
    void addCategorie(Categorie cat);
    List<Categorie> getAllCategories();
}