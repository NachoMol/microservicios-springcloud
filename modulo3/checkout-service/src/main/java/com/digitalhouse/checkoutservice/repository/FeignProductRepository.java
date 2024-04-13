package com.digitalhouse.checkoutservice.repository;


import com.digitalhouse.checkoutservice.configuration.LoadBalancerConfiguration;
import com.digitalhouse.checkoutservice.dto.Product;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "products",url = "http://localhost:8081")
public interface FeignProductRepository {

    @RequestMapping(method = RequestMethod.GET,value = "/products")
    Product getProductById(@RequestParam String id, @RequestParam Boolean throwError);


}
