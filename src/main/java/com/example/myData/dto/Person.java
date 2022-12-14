package com.example.myData.dto;

import javax.persistence.*;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long Id;

    @Column(name = "person_name")
    private String name;

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
