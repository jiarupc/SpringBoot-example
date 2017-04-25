package com.example.Controller

import com.example.Dao.AuthorDao
import com.example.Entity.Author
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class AuthorController {
    @Autowired
    private AuthorDao authorDao

    /**
     * 查询列表
     * @return
     */
    @GetMapping("/authors")
    List<Author> listAuthors() {
        return authorDao.findAll()
    }

    /**
     * ID 查询
     * @param id
     * @return
     */
    @GetMapping("/author/{id}")
    Author getAuthorById(@PathVariable("id") Integer id) {
        return authorDao.findOne(id)
    }

    /**
     * 年龄查询
     * @param age
     * @return
     */
    @GetMapping("/author/age/{age}")
    List<Author> getAuthorsByAge(@PathVariable("age") Integer age) {
        return authorDao.findByAge(age)
    }

    /**
     * 添加
     * @param author
     * @return
     */
    @PostMapping("/author/add")
    Author addAuthor(@RequestBody Author author) {
        return authorDao.save(author)
    }

    /**
     * id 更新
     * @param id
     * @param author
     * @return
     */
    @PutMapping("/update/{id}")
    Author updateAuthor(@PathVariable("id") Integer id, @RequestBody Author author) {
        author.setId(id)
        return authorDao.save(author)
    }

    /**
     * id 删除
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    void deleteAuthor(@PathVariable("id") Integer id) {
        authorDao.delete(id)
    }
}
