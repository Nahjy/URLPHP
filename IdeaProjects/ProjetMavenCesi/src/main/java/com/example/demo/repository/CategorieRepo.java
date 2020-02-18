package com.example.demo.repository;
import com.example.demo.model.CategorieDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategorieRepo extends JpaRepository<CategorieDB, Long>{

    List<CategorieDB> findAll();
    CategorieDB saveCat(CategorieDB cat);
    void delete(CategorieDB cat);
}
