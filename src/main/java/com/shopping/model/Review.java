package com.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Review {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User recommand;
}
