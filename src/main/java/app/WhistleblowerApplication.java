package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("src/main/java/app/entity")
public class WhistleblowerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WhistleblowerApplication.class, args);
    }
}