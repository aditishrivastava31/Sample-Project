package com.springboot.product.example.Service;

import com.springboot.product.example.entity.Sales;
import com.springboot.product.example.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesserviceImpl  implements SalesService {
@Autowired
private SalesRepo salesRepo;

    @Override
    public List<Sales> maxSales() {
        return  salesRepo.maxSales();
    }

    @Override
    public List<Sales> minSales() {
        return salesRepo.minSales();
    }
}
