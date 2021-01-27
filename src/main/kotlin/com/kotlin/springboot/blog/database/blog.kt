package com.kotlin.springboot.blog.database

import org.jetbrains.exposed.dao.id.IntIdTable

object User : IntIdTable() {
    val name = varchar("name", length = 30)
}

object Article : IntIdTable() {
    val title = varchar("title", length = 100).uniqueIndex()
    val content = varchar("content", length = 100)
    val author = integer("user_id").references(User.id)
}
