package com.example.demo.demopackage;

import com.github.tomakehurst.wiremock.WireMockServer;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class WiremockServerRunner implements ApplicationRunner {

    private final WireMockServer wireMockServer = new WireMockServer(1234);

    @Override
    public void run(ApplicationArguments args) {

        wireMockServer.start();
    }

    @PostConstruct
    void destroy() {
        wireMockServer.shutdownServer();
    }
}
