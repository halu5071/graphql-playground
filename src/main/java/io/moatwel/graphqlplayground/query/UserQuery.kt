package io.moatwel.graphqlplayground.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import io.moatwel.graphqlplayground.dao.UserDao
import io.moatwel.graphqlplayground.model.User
import org.springframework.stereotype.Component

@Component
class UserQuery(
        private val userDao: UserDao) : GraphQLQueryResolver {

    fun getUserById(id: Long): User? {
        return userDao.getUserById(id)
    }

    fun getUsers(): List<User> {
        return userDao.getUsers()
    }
}
