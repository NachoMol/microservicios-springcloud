package com.digitalhouse.checkoutservice.service;

import com.digitalhouse.checkoutservice.dto.Product;
import com.digitalhouse.checkoutservice.repository.FeignProductRepository;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
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
    @Retry(name="product")
    public Product getProduct(String id) {
        log.info("Intentando obtener el producto con ID:" + id);
        return feignProductRepository.getProductById(id,true);
    }

    public Product getProductFallbackMethod(String id, CallNotPermittedException exception){
        log.error("Circuit Breaker en estado Open");
        return new Product();
    }

}
