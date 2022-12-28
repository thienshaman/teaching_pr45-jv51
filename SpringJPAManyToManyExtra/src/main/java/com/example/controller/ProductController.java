package com.example.controller;

import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public Object getAll() {
        return productService.getProducts();
    }

}
