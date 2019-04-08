package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Product {
    @Id
    private Long id;

    private String name;

    private Integer price;

    private Date expired;

    private String image;

    private Integer stockCount;
}
