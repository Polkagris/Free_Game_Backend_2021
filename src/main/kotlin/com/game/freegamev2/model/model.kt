package com.game.freegamev2.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "games")
data class FreeGameModel(
        @Id
        val gameId: String,
        val name: String = "Name not available",
        @Field(name = "time_free")
        val timeFree: String = "Time not available",
        @Field(name = "image_url")
        val imageUrl: String = "Image not available"
)