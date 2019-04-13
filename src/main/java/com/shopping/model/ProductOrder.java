package com.shopping.model;

import com.shopping.model.enums.OrderStatus;
import com.shopping.model.enums.Paymethod;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@EntityListeners(value = {AuditingEntityListener.class})
//주문
public class ProductOrder {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    //주문상품
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    //주문자
    private User user;

    @CreatedDate
    //주문일
    private Date created;

    @LastModifiedDate
    //주문수정일
    private Date modified;

    //주문상태
    private OrderStatus status;

    //주문방법
    private Paymethod paymethod;

    //수량
    private int count;

    //가격
    private int price;

}
