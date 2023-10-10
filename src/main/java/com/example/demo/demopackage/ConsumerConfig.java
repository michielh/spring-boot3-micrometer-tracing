package com.example.demo.demopackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Configuration
public class ConsumerConfig {

    @Bean(name = "some-consumer")
    public Consumer<Message<SomeEvent>> consumeEventConfig(SomeService someService) {
        return someService::handle;
    }
}
