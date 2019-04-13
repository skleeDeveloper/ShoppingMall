package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
//상품
public class Product {
    @Id
    private Long id;

    //상품명
    private String name;

    //가격
    private Integer price;

    //상품 만료일
    private Date expired;

    //상품 이미지 경로
    private String image;

    //재고 수
    private Integer stockCount;

    //상품 카테고리
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
