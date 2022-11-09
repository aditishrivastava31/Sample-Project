package com.springboot.product.example.repository;

import com.springboot.product.example.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface SalesRepo  extends JpaRepository <Sales,Long>{
    @Query(value ="select   product_name,max(TotalSaleAfter2W) maxsales from (Select   product_name ,sum( Sales_per_week) TotalSaleAfter2W from Sale group by  product_name) A",nativeQuery = true)
   // @Query(value = "select * from sale", nativeQuery = true)
    List<Sales>  maxSales();
    @Query(value ="select   product_name,min(TotalSaleAfter2W) minsales from (Select   product_name ,sum( Sales_per_week) TotalSaleAfter2W from Sale group by  product_name) A",nativeQuery = true)
    List<Sales>  minSales();

}

