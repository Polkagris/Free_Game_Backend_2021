package com.game.freegamev2.resource

import com.game.freegamev2.client.FreeGameClient
import com.game.freegamev2.model.FreeGameModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class FreeGameResource(val repo: FreeGameClient) {

    @GetMapping("/")
    fun getFreeGames(): List<FreeGameModel> = repo.findAll().let {
        println("Free games from database: ${it.map{game -> game.name}}")
        it
    }
}