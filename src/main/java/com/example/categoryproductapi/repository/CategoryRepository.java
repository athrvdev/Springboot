package com.example.categoryproductapi.repository;

import com.example.categoryproductapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}