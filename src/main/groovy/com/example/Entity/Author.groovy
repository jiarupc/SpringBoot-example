package com.example.Entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Author {
    @Id
    @GeneratedValue
    private Integer id
    private String name
    private Integer age

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }
}
