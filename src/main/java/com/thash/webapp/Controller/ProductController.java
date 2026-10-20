package com.thash.webapp.Controller;

import com.thash.webapp.Repository.Product;
import com.thash.webapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService ps;

    @Autowired
    public void setPs(ProductService ps) {
        this.ps = ps;
    }

    @RequestMapping("/cart")
    public List<Product> getProducts(){
            return ps.getProductsList();
        }


}
