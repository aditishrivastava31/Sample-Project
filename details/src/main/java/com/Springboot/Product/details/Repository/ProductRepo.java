package com.Springboot.Product.details.Repository;

import com.Springboot.Product.details.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
//    public Optional<Product> fetchAllProduct(String category);
}
