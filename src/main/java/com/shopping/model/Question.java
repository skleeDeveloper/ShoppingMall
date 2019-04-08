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
//질문
public class Question {
    @Id
    private Long id;
    @OneToMany(mappedBy = "question")
    private List<Comment> comments;
}
