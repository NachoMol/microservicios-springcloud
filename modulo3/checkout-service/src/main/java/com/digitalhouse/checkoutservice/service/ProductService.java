package com.digitalhouse.checkoutservice.service;

import com.digitalhouse.checkoutservice.dto.Product;
import com.digitalhouse.checkoutservice.repository.FeignProductRepository;
import org.springframework.stereotype.Service;


@Service
public class ProductService implements IProductService{

    private FeignProductRepository feignProductRepository;


    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public Product getProduct(String id) {
        return feignProductRepository.getProductById(id);
    }
}
