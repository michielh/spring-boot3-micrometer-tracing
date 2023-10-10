package com.example.demo.demopackage;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeService {

    private final RestTemplate restTemplate;

    public SomeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void handle(Message<SomeEvent> event) {
        restTemplate.getForObject("http://localhost:1234/some-endpoint/", Void.class);
    }
}

