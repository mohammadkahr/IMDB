package com.example.imdb_deadlygray.data

class UserRepository(val dao : UserDao) {
    val users = dao.getAllUsers()

    suspend fun insert(user: User){
        dao.insertUser(user)
    }

    suspend fun update(user: User){
        dao.updateUser(user)
    }

    suspend fun delete(user: User){
        dao.deleteUser(user)
    }
}