package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("src/main/java/app/entity")
//@EntityScan(basePackages = {"app.entity"})
//@EnableJpaRepositories(basePackages = {"app.repository"})
@EntityScan("app.entity")
@EnableJpaRepositories("app.repository")
public class WhistleblowerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WhistleblowerApplication.class, args);
    }
}