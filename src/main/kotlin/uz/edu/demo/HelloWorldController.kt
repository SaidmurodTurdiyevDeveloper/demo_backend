package uz.edu.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import uz.edu.demo.data.model.User
import uz.edu.demo.data.repository.UserRepository

@RestController
class HelloWorldController (private val userRepository: UserRepository){

    @GetMapping("/getAll")
    fun helloWorld():List<User> =  userRepository.findAll()
}