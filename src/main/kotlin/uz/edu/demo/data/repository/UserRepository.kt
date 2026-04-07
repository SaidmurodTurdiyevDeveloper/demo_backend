package uz.edu.demo.data.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import uz.edu.demo.data.model.User

@Repository
interface UserRepository : JpaRepository<User, Long>