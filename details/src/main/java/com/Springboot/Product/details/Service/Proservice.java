package com.Springboot.Product.details.Service;

import com.Springboot.Product.details.entity.Product;

import java.util.List;


public interface Proservice {




    public Product saveDetails(Product product);

    public  List<Product> fetchDetails();


   public List<Product> fetchAllProduct(String category);


   public String topproduct();
}
