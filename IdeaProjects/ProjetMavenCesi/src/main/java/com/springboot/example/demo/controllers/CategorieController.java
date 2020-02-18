package com.springboot.example.demo.controllers;

import com.springboot.example.demo.entities.Book;
import com.springboot.example.demo.entities.Categorie;
import com.springboot.example.demo.services.BookService;
import com.springboot.example.demo.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class CategorieController {

    private CategorieService catService;

    @Autowired
    public CategorieController(final CategorieService catsvc){
        this.catService = catsvc;
    }

    @GetMapping(value = "/categorie/{CategorieID}")
    @ResponseBody
    Categorie getBookById(@PathVariable final Integer CategorieID) {
        System.out.println("polop");
        return this.catService.getCategorieById(CategorieID);
    }

    @GetMapping(value = "/categorie")
    @ResponseBody
    List<Categorie> getAllBooks() {
        return this.catService.getAllCategories();
    }

    @PostMapping(value = "/categorie")
    @ResponseStatus(HttpStatus.OK)
    void addBook(@RequestBody Categorie cat){
        this.catService.addCategorie(cat);
    }

}

//ID, Nom