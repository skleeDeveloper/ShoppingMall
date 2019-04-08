package com.shopping.model;

import com.shopping.model.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@EntityListeners(value = {AuditingEntityListener.class})
//사용자
public class User {
    @Id
    private Long id;

    private String userId;

    private String password;

    private String address;

    private Gender gender;

    private String name;

    private Date birthDate;

    @CreatedDate
    private Date created;

    private int point;

    //lombok geter, setter 소스 코드 내부적으로 생성
    //@CreatedDate
    //1. 해당 컬럼에 @CreatedDate 작성
    //2. @EntityListeners(value = {AuditingEntityListener.class})
    //3. main class에 @EnableJpaAuditing 추가
    //4. ctrl + shift + a > Annotation Processors > Enable Annotation Processing check




}
