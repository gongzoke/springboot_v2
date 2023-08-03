package bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootstrapTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapTestApplication.class, args);
    }
}
