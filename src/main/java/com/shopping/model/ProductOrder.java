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
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date modified;

    private OrderStatus status;

    private Paymethod paymethod;

    private int count;

    private int price;
}
