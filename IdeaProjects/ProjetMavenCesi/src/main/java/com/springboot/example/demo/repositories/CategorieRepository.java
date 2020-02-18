package com.springboot.example.demo.repositories;

import com.springboot.example.demo.entities.Book;
import com.springboot.example.demo.entities.Categorie;

import java.util.List;

public interface CategorieRepository {
    Categorie getCategorieById(Integer catId);
    void addCategorie(Categorie cat);
    List<Categorie> getAllCategories();
}
