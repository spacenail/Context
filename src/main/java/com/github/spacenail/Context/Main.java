package com.github.spacenail.Context;

import com.github.spacenail.Context.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Cart cart1 = context.getBean(Cart.class);
        cart1.addToCart(1);
        cart1.addToCart(2);
        System.out.println(cart1);
        Cart cart2 = context.getBean(Cart.class);
        cart2.addToCart(5);
        cart2.addToCart(1);
        cart2.deleteFromCart(5);
        System.out.println(cart2);
    }
}
