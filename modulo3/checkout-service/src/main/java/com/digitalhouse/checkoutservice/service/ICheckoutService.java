package com.digitalhouse.checkoutservice.service;

import com.digitalhouse.checkoutservice.model.Checkout;

import java.util.List;

public interface ICheckoutService {

    public Checkout buildCheckout(List<String> productIds);
}
