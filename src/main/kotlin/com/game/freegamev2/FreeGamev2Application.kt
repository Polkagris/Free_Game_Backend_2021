package com.game.freegamev2

import com.game.freegamev2.client.FreeGameClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
/*@EnableMongoRepositories(basePackageClasses = FreeGameClient.class)*/
class FreeGamev2Application

fun main(args: Array<String>) {
	runApplication<FreeGamev2Application>(*args)
}
