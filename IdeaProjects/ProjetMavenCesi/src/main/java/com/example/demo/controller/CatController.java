package com.example.demo.controller;


import com.example.demo.exception.CatNotFoundException;
import com.example.demo.model.CategorieDB;
import com.example.demo.repository.CategorieRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CatController {

    @Autowired
    CategorieRepo catRepository;

    // Get All Notes
    @GetMapping("/categorie")
    public List<CategorieDB> getAllNotes() {
        return catRepository.findAll();
    }

    // Create a new Note
    @PostMapping("/categorie")
    public CategorieDB createNote(@Valid @RequestBody CategorieDB categorie) {
        return catRepository.save(categorie);
    }

    // Get a Single Note
    @GetMapping("/categorie/{id}")
    public CategorieDB getNoteById(@PathVariable(value = "id") Long bookId) throws CatNotFoundException {
        return catRepository.findById(bookId)
                .orElseThrow(() -> new CatNotFoundException(bookId));
    }

    // Update a Note
    @PutMapping("/categorie/{id}")
    public CategorieDB updateNote(@PathVariable(value = "id") Long bookId,
                           @Valid @RequestBody CategorieDB bookDetails) throws CatNotFoundException {

        CategorieDB categorie = catRepository.findById(bookId)
                .orElseThrow(() -> new CatNotFoundException(bookId));


        CategorieDB updatedBook = catRepository.save(categorie);

        return updatedBook;
    }

    // Delete a Note
    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) throws CatNotFoundException {
        CategorieDB categorie = catRepository.findById(bookId)
                .orElseThrow(() -> new CatNotFoundException(bookId));

        catRepository.delete(categorie);

        return ResponseEntity.ok().build();
    }
}