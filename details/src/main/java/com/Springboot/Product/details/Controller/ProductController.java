package com.Springboot.Product.details.Controller;

import com.Springboot.Product.details.Service.Productservice;
import com.Springboot.Product.details.Service.Proservice;
import com.Springboot.Product.details.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private Proservice proservice;

    @PostMapping("/saveDetails")
    public Product saveDetails(@RequestBody Product product) {
        return proservice.saveDetails(product);
    }

    @GetMapping("/getData")
    public List<Product> fetchDetails() {
        return proservice.fetchDetails();
    }

    @GetMapping("/getdetails/{category}")
    public List<Product> fetchAllProduct(@PathVariable("category") String category) {
        return proservice.fetchAllProduct(category);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductById(@PathVariable("id") Long id) {
        Productservice.deletePoductById(id);
        return "Delete sucessfully";
    }

    @GetMapping("/topp")
    public String topproduct()
    {
        return proservice.topproduct();

    }
}



