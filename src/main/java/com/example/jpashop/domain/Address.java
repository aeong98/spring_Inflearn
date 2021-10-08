package com.example.jpashop.domain;

import javax.persistence.Embeddable;

import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address () {
    }

    public Address (String city, String street, String zipcode){
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }


}

// 값 타입은 변경 불가능하게 설계해야 한다.
// JPA 스펙상 엔티티나 임베디드 타입은 자바 기본 생성자를 public 또는 proteced 로 설정해야한다.
