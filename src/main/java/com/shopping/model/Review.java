package com.shopping.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@EntityListeners(value = {AuditingEntityListener.class})
//리뷰
public class Review {
    @Id
    private Long id;

    //추천
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User recommand;

    //상품 점수
    private Byte productScore;

    //배송 점수
    private Byte deliveryScore;

    //상품명
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product name;

    @CreatedDate
    //작성일
    private Date created;

    //리뷰 평
    private String comment;



}
