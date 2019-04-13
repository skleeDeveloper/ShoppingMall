package com.shopping.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EntityListeners(value = {AuditingEntityListener.class})
//카트
public class Cart {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    //상품
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    //사용자
    private User user;

    @CreatedDate
    private Date created;

    //수량
    private int count;

}
