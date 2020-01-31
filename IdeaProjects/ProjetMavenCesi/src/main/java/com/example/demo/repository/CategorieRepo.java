package com.example.demo.repository;
import com.example.demo.model.CategorieDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepo extends JpaRepository<CategorieDB, Long>{


}
