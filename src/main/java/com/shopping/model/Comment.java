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
//문의 댓글
public class Comment {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    //문의
    private Question question;
}
