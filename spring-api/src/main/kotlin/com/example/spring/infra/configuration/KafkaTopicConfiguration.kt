package com.example.spring.infra.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfiguration {

    @Bean
    fun messageTopic(@Value("\${spring.kafka.template.default-topic}") topic: String) = TopicBuilder.name(topic)
            .partitions(3)
            .replicas(1)
            .build()

}