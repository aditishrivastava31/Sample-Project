package com.springboot.product.example.Controller;

import com.springboot.product.example.Service.SalesService;
import com.springboot.product.example.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesController {

    @Autowired
    private SalesService salesService;
    @GetMapping("/maxvalue")
    public List<Sales> maxSales(){
        return salesService.maxSales();


    }
    @GetMapping("/minvalue")
    public List<Sales> minSales(){
        return salesService.minSales();
    }


}
