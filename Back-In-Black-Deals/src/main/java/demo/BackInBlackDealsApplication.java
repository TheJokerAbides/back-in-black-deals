package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BackInBlackDealsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackInBlackDealsApplication.class, args);
    }
}
