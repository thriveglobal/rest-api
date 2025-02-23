package com.thrive

import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/hello") {
            call.respondText(
                text = "Hello World!",
                contentType = ContentType.Text.Plain,
                status = HttpStatusCode.OK
            )
        }
    }
}
