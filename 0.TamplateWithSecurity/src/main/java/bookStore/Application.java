package bookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by mariababan on 15/04/2017.
 */

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"bookStore.repository"})
@PropertySource(value = "classpath:application.properties")
public class Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
