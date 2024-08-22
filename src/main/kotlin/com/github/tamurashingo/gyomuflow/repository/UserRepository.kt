package com.github.tamurashingo.gyomuflow.repository

import com.github.tamurashingo.gyomuflow.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>
