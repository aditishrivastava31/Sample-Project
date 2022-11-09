package com.springboot.product.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Sale")
public class Sales {
     @Id
     @GeneratedValue( strategy= GenerationType.IDENTITY)
//     @Column(name="product_id")
//     private Long ProductId;
@Column(name="product_name")
     private  String ProductName;
//     @Column(name="order_no")
//     private  Long orderno;
//     @Column(name="week_no")
//     private String weekno;
//     @Column(name="Sales_per_week")
//     private Long Salesperweek;
   private Long maxsales;
    // private Long minsales;


}
