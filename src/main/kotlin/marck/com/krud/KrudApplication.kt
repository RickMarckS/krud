package marck.com.krud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KrudApplication

fun main(args: Array<String>) {
	runApplication<KrudApplication>(*args)
}
