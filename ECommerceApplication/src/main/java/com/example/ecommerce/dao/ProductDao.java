package com.example.ecommerce.dao;

import com.example.ecommerce.model.Product;

import java.util.List;

public interface ProductDao {
    void save(Product product);
    List<Product> findAll();
    Product findById(Long id);
    void update(Product product);
    void delete(Long id);
}