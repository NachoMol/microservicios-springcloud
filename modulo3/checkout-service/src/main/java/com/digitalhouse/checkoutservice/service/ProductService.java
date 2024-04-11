package com.digitalhouse.checkoutservice.service;

import com.digitalhouse.checkoutservice.dto.Product;
import com.digitalhouse.checkoutservice.repository.FeignProductRepository;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ProductService implements IProductService{

    private FeignProductRepository feignProductRepository;


    Logger log = LoggerFactory.getLogger(ProductService.class);

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    @CircuitBreaker(name="product",fallbackMethod ="getProductFallbackMethod")
    public Product getProduct(String id) {

        return feignProductRepository.getProductById(id);
    }

    public Product getProductFallbackMethod(String id, CallNotPermittedException exception){
        log.error("Circuit Breaker en estado Open");
        return new Product();
    }

}
