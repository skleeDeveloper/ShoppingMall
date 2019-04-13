package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


//찜
@Entity
@Getter
@Setter
public class Own {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    //유저
    private User user;

    //상품
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
