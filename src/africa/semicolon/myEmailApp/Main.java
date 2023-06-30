package africa.semicolon.myEmailApp;

import jdk.jfr.Timestamp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@SpringBootApplication
@Timestamp
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
