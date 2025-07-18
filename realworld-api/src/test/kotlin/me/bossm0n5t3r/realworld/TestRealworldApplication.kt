package me.bossm0n5t3r.realworld

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
    fromApplication<RealworldApplication>().with(TestcontainersConfiguration::class).run(*args)
}
