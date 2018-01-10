package com.createam.heroku.thymeleaf

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.createam.heroku.thymeleaf"])
class ThymeleafConfig {

    private val logger = LoggerFactory.getLogger(ThymeleafConfig::class.java)

    @Bean
    @ConditionalOnProperty(prefix = "heroku.thymeleaf.enabled", havingValue = "true")
    fun httpsEnforcer(): HttpsEnforcer {
        logger.info("Heroku https enforce is enable")
        return HttpsEnforcer()
    }
}

