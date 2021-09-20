package kotlinhello

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/hello")
class HelloController {

  @GetMapping("/")
  fun hello() = 42
  
  @GetMapping("/hello2")
  fun hello2(): Int {
   return 42
  }

  @RequestMapping("/user")
  fun getUser() : User {
      val user = User(
              username = "Test",
              screenName = "Test2",
              email = "a@gmail.com",
      )
      return user
  }

}