package com.github.spacenail.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    private void init(){
        productList = new ArrayList<>();
        productList.add(new Product(1L,"Milk",100));
        productList.add(new Product(2L,"Bread",40));
        productList.add(new Product(3L,"Eggs",100));
        productList.add(new Product(4L,"Butter",300));
        productList.add(new Product(5L,"Cheese",200));
    }

    public List<Product> getProductList(){
        return productList;
    }

    public Product getProductById(long id){
        return productList.stream().filter(product -> product.getId()==id).findFirst().get();
    }
}
