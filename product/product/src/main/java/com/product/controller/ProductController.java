package com.product.controller;

import com.product.dto.ProductRequest;
import com.product.dto.ProductResponse;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/create")
    public ResponseEntity<ProductResponse> placeProduct(@RequestBody ProductRequest productRequest)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.placeProduct(productRequest));
    }
}
