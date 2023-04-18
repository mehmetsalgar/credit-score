package org.salgar.akka.fsm.foureyes.creditscore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@Slf4j
public class CreditScoreApplication {
    public static void main(String[] args) {
        log.info("Credit Score Application is starting! Ahsoka Tano!!!!!");
        new SpringApplicationBuilder(CreditScoreApplication.class)
                .registerShutdownHook(true)
                .run(args);
    }
}