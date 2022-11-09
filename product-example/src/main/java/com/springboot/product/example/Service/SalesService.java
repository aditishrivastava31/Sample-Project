package com.springboot.product.example.Service;

import com.springboot.product.example.entity.Sales;

import java.util.List;

public interface SalesService {
    public List<Sales> maxSales();

    public List<Sales> minSales();
}
