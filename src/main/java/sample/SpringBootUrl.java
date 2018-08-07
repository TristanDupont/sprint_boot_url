package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

/**
 * @author Tristan Dupont
 */
@SpringBootApplication(scanBasePackages = {
        "sample.controller",
})
public class SpringBootUrl {

    public static void main(final String[] args) {
        SpringApplication.run(SpringBootUrl.class, args);
    }

}
