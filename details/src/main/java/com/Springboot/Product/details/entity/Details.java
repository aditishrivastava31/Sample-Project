package com.Springboot.Product.details.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="details")


public class Details {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name="d_id")
     private Long did;
     private String colour;
     private Long units;


}
