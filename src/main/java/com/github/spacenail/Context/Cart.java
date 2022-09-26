package com.github.spacenail.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class Cart {
    @Autowired
    private ProductRepository productRepository;
    private List<Product> cart;

    public Cart() {
        cart = new ArrayList<>();
    }
    public void addToCart(long id){
        cart.add(productRepository.getProductById(id));
    }

    public void deleteFromCart(long id){
        cart.remove(productRepository.getProductById(id));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }
}
