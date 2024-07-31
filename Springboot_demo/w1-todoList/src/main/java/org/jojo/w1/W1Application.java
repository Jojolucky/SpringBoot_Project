package org.jojo.w1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // start for the springboot app
// it is the combination of @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan(scan  @Component、@Service、@Repository, @Controller)
public class W1Application {
    public static void main(String[] args) {
        SpringApplication.run(W1Application.class, args);
    }

}
