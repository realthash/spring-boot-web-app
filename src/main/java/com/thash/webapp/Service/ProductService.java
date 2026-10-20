package com.thash.webapp.Service;


import com.thash.webapp.Repository.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> list = new ArrayList<>(Arrays.asList(
            new Product(1, "car", 100),
            new Product(2, "bike", 100),
            new Product(3, "ship", 100)));

    public List<Product> getProductsList(){

        return list;

    }

    public Product getProductById(int productId){
            System.out.println(productId);
        return list.stream().filter(n-> n.getProductId() == productId).findFirst().orElse(new Product( 5, "dj",500));
    }
}
