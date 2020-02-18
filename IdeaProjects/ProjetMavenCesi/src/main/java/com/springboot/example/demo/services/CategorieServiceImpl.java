package com.springboot.example.demo.services;

import com.springboot.example.demo.entities.Book;
import com.springboot.example.demo.entities.Categorie;
import com.springboot.example.demo.repositories.BookRepository;
import com.springboot.example.demo.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository catrepository;

    @Autowired
    public CategorieServiceImpl(final CategorieRepository catrepo){
        this.catrepository = catrepository;
    }

    @Override
    public Categorie getCategorieById(Integer CatID) {
        return this.catrepository.getCategorieById(CatID);
    }

    @Override
    public void addCategorie(Categorie cat) {
        this.catrepository.addCategorie(cat);
    }

    @Override
    public List<Categorie> getAllCategories() {
        return this.catrepository.getAllCategories();
    }
}
