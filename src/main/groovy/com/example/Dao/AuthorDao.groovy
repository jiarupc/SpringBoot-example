package com.example.Dao

import com.example.Entity.Author
import org.springframework.data.jpa.repository.JpaRepository


interface AuthorDao extends JpaRepository<Author, Integer> {
    List<Author> findByAge(Integer age)
}
