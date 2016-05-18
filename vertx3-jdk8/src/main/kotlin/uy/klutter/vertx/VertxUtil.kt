package uy.klutter.vertx

import io.vertx.core.json.Json
import uy.klutter.json.jackson.jdk8.addJacksonJdk8ModulesToMapper

/**
 * Tell the Vert.x and Hazelcast logging facades to log through SLF4j, this must be called very early in your application
 * before the logging systems are activated.
 */
fun setupVertxLoggingToSlf4j() {
    // must be called before anything in Vertx
    System.setProperty("vertx.logger-delegate-factory-class-name", "io.vertx.core.logging.SLF4JLogDelegateFactory")
    System.setProperty("hazelcast.logging.type", "slf4j")
}

/**
 * Setup the Vert.x singleton for Jackson ObjectMapper to support Kotlin and JDK 8 types.  This should be called very early
 * in your application lifecycle.
 */
fun setupVertxJsonForKotlin() {
    addJacksonJdk8ModulesToMapper(Json.mapper)
    addJacksonJdk8ModulesToMapper(Json.prettyMapper)
}

