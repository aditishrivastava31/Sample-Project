package com.Springboot.Product.details.Service;

import com.Springboot.Product.details.Repository.ProductRepo;
import com.Springboot.Product.details.entity.Details;
import com.Springboot.Product.details.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Productservice implements Proservice {
    @Autowired
    private ProductRepo productRepo;

    public static void deletePoductById(Long id) {
    }

    @Override
    public Product saveDetails(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> fetchDetails() {
        return productRepo.findAll();
    }

    @Override
    public List<Product> fetchAllProduct(String category) {
        List<Product> l = productRepo.findAll();
        return l.stream().filter(product -> product.getCategory().equals(category)).collect(Collectors.toList());

    }

    @Override
    public String topproduct() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Product> l = productRepo.findAll();
        Details l1 = l.stream().flatMap(product -> product.getDetails().stream()).max(Comparator.comparing(Details::getUnits)).get();
        System.out.println(l1);
        for (Product product : l) {
            String name = product.getName();
            String category = product.getCategory();
            if (product.getDetails().contains(l1)) {
                stringBuilder.append(name).append(" ").append(category).append(" ").append(l1.getUnits());
                System.out.println("oh yes");
            }



        }
   return stringBuilder.toString();
    }
}


