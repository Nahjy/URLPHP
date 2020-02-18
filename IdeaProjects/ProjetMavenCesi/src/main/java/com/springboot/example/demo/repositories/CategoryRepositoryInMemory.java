package com.springboot.example.demo.repositories;

import com.springboot.example.demo.entities.Book;
import com.springboot.example.demo.entities.Categorie;
import jdk.jfr.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryInMemory implements CategorieRepository {
    private ArrayList<Categorie> category;

    public CategoryRepositoryInMemory() {
        this.category = new ArrayList<>();
    }

    public Categorie getCategorieById(Integer catId) {
        for(Categorie b : this.category){
            if(b.getId() == catId) return b;
        }

        return null;
    }

    public void addCategorie(Categorie cat) {
        this.category.add(cat);
    }

    public List<Categorie> getAllCategories() {
        return this.category;
    }
}
