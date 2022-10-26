package com.mercado.mercadocj.services;

import com.mercado.mercadocj.entities.Category;
import com.mercado.mercadocj.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/categories")
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> findAll(){
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}