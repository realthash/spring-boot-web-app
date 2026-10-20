package com.thash.webapp.Controller;

import com.thash.webapp.Repository.Product;
import com.thash.webapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService ps;

    @Autowired
    public void setPs(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/cart")
    public List<Product> getProducts(){
            return ps.getProductsList();
    }
    @GetMapping( "/cart/{id}")
    public Product getProductById(@PathVariable int id){
        return ps.getProductById(id);
    }

    @PostMapping( "/cart")
    public void addProduct(@RequestBody Product body){
        System.out.println(body);
        ps.addProduct(body);

    }

    @PutMapping("/cart")
    public void updateProduct(@RequestBody Product product){
        ps.updateProduct(product);
    }

}
