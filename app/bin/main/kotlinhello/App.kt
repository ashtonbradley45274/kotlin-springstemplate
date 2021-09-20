/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotlinhello
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
//import org.springframework.boot.SpringApplication

@EnableAutoConfiguration
@Configuration
@SpringBootApplication
//Scans entire project for components , no need to add beans.
@ComponentScan()
class App

fun main(args: Array<String>) {
    runApplication<App>(*args) {
      //setBannerMode(Banner.Mode.OFF)
    }
}