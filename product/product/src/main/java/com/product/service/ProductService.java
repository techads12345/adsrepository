package com.product.service;

import com.product.dto.ProductRequest;
import com.product.dto.ProductResponse;
import com.product.model.Product;
import com.product.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductResponse placeProduct(ProductRequest productRequest)
    {
        Product product=new Product();
        BeanUtils.copyProperties(productRequest,product);
        Product prodctResp=productRepository.save(product);
        ProductResponse productResponse=new ProductResponse();
        BeanUtils.copyProperties(prodctResp,productResponse);
        return productResponse;
    }
}
