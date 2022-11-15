package com.moneycare.config.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
open class ConfigServerApp

fun main(args: Array<String>){
    runApplication<ConfigServerApp>(*args)
}