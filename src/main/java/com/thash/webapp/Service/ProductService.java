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

    public void addProduct(Product product){
        list.add(product);
    }

    public void updateProduct(Product product){
        int index = -1;

        System.out.println(product);

        for (int i = 0; i < list.size(); i++) {
            if(product.getProductId()==list.get(i).getProductId()){
                index=i;
            }
        }

        if (index!= -1){
            list.set(index, product);
        }else{
            System.out.println("item not found");
        }
    }

    public void deleteProduct(int id) {
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getProductId() == id){
                index = i;
            }
        }
        if (index != -1){
            list.remove(index);
        }else{
            System.out.println("Item " + id + " not found.");
        }
    }
}
