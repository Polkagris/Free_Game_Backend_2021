package com.game.freegamev2.client

import com.game.freegamev2.model.FreeGameModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FreeGameClient : MongoRepository<FreeGameModel, Long> {
}