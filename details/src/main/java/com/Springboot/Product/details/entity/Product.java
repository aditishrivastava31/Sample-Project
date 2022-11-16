package com.Springboot.Product.details.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="product_details")
public class Product {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO )
     @Column(name="prd_id")
     private Long id;
     private String name;
     private String category;
     @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name="fk_did",referencedColumnName = " prd_id")
     private List<Details> details;




}
