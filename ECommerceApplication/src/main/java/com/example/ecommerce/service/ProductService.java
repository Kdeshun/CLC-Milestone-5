package com.example.ecommerce.service;

import com.example.ecommerce.dao.ProductDao;
import com.example.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public void createProduct(Product product) {
        productDao.save(product);
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Product getProductById(Long id) {
        return productDao.findById(id);
    }

    public void updateProduct(Product product) {
        productDao.update(product);
    }

    public void deleteProduct(Long id) {
        productDao.delete(id);
    }
}