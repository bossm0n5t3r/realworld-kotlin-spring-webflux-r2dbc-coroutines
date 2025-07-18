package me.bossm0n5t3r.realworld

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class RealworldApplicationTests {
    @Test
    fun contextLoads() {
    }
}
