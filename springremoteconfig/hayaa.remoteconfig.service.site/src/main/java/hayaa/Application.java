package hayaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hsieh
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication app=new SpringApplication(Application.class);
        app.run(args);
    }
}
