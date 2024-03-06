package com.digitalhouse.checkoutservice.service;

import com.digitalhouse.checkoutservice.model.Checkout;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService implements ICheckoutService{

    private IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public Checkout buildCheckout(List<String> productIds) {
        Double total = 0.0;
        for(String id: productIds){
            Product product
        }
    }
}
