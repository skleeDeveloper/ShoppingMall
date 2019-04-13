package com.shopping.model;

import com.shopping.model.enums.QuestionStatus;
import com.shopping.model.enums.Secret;
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
//문의
public class Question {

    @Id
    private Long id;

    @OneToMany(mappedBy = "question")
    //댓글
    private List<Comment> comments;

    //문의글 구분
    private QuestionStatus status;

    //비밀글 구분
    private Secret secret;

    //문의자
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //문의날짜
    @CreatedDate
    private Date created;

    //문의 내용
    private String content;

}
