package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
//상품 카테고리
public class Category {

    @Id
    private Long id;

    @OneToMany(mappedBy = "category")
    //상품
    private List<Product> products;

    //카테고리 명
    private String name;
}
