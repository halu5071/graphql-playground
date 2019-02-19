package io.moatwel.graphqlplayground.dao

import io.moatwel.graphqlplayground.model.User
import org.springframework.stereotype.Component

@Component
class UserDao {

    private val userList = mutableListOf(
            User(1, "Yasunori Horii", "https://sample.org/icon1.png"),
            User(2, "Saburo Kawakami", "https://sample.org/icon2.png"),
            User(3, "Jiro Nakayama", "https://sample.org/icon3.png"),
            User(4, "Yuriko Wajima", "https://sample.org/icon4.png"),
            User(5, "Chiho Takei", "https://sample.org/icon5.png"),
            User(6, "Kanako Sakurai", "https://sample.org/icon6.png"),
            User(7, "Sakura Ojima", "https://sample.org/icon7.png")
    )

    fun getUserById(id: Long): User? {
        return userList.firstOrNull { user -> user.id == id }
    }

    fun getUsers(): List<User> {
        return userList
    }
}
