package com.kotlin.springboot.blog

import com.kotlin.springboot.blog.database.Article
import com.kotlin.springboot.blog.database.User
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
    Database.connect(
        "jdbc:mysql://localhost:3306/kotlinBlog?useUnicode=yes&characterEncoding=UTF-8&serverTimezone=Asia/Seoul",
        driver = "com.mysql.jdbc.Driver",
        user = "root",
        password = "grit123!@#"
    )
    transaction {
        SchemaUtils.create(User, Article)
    }
    runApplication<BlogApplication>(*args)
}
