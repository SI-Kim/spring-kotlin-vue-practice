package com.example.kotlinvuepractice.controller

import org.apache.logging.log4j.LogManager
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Level

@RestController
@RequestMapping("/api")
class HelloController {
    val log = LoggerFactory.getLogger(javaClass)
    val log2 = LogManager.getLogger()

    @GetMapping("/hello")
    fun hello(args: String?): String {

        log2.info("hello $args")
        log2.warn("hello $args")
        log2.error("hello $args")
        return "hello $args"
    }
    @GetMapping("/helloLog4j")
    fun helloLog4j(args: String?): String {

        log.info("hello $args")
        log.warn("hello $args")
        log.error("hello $args")

        return "hello $args"
    }
    @GetMapping("/helloSlf4j")
    fun helloSlf4j(args: String?): String {

        log.info("hello $args")
        log.warn("hello $args")
        log.error("hello $args")

        log2.info("hello $args")
        log2.warn("hello $args")
        log2.error("hello $args")
        return "hello $args"
    }
}