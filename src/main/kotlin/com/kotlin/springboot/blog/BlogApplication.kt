package com.kotlin.springboot.blog

import org.jetbrains.exposed.sql.Database
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
    Database.connect(
        "jdbc:mysql://localhost:3306/kotlinBlog",
        driver = "org.mysql.jdbc.Driver",
        user = "root",
        password = "grit123!@#"
    )
    runApplication<BlogApplication>(*args)
}
