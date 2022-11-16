package com.Springboot.Product.details.Repository;

import com.Springboot.Product.details.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepo extends JpaRepository<Details,Long> {
}
