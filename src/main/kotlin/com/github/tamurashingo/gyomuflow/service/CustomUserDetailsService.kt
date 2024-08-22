package com.github.tamurashingo.gyomuflow.service

import com.github.tamurashingo.gyomuflow.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(private val userRepository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(email: String) : UserDetails {
        val user = userRepository.findByEmail(email) ?: throw UsernameNotFoundException("user not found")
        return org.springframework.security.core.userdetails.User(user.email, user.password, emptyList())
    }
}
