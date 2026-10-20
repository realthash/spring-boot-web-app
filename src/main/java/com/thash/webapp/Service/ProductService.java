package com.thash.webapp.Service;


import com.thash.webapp.Repository.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    public List<Product> getProductsList(){

        return  Arrays.asList(new Product("item1", "car", 100), new Product("item2", "bike", 100), new Product("item3", "ship", 100));


    }
}
