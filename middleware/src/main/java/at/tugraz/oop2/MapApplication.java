package at.tugraz.oop2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class MapApplication {
    public static void main(String[] args) {
        String port = "JMAP_MIDDLEWARE_PORT";
        String target = "JMAP_BACKEND_TARGET";
        String JMAP_MIDDLEWARE_PORT_String = System.getenv().getOrDefault(port, "8010");
        String JMAP_BACKEND_TARGET_String = System.getenv().getOrDefault(target, "localhost:8020");
        int JMAP_MIDDLEWARE_PORT;
        try {
            JMAP_MIDDLEWARE_PORT = Integer.parseInt(JMAP_MIDDLEWARE_PORT_String);
            if(JMAP_MIDDLEWARE_PORT < 0 || JMAP_MIDDLEWARE_PORT >= 65536)
            {
                JMAP_MIDDLEWARE_PORT = 8010;
            }
        }
        catch(NumberFormatException e) {
            JMAP_MIDDLEWARE_PORT = 8010;
        }

        MapLogger.middlewareStartup(8010, "localhost:8020");
        var app = new SpringApplication(MapApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", 8010));
        app.run();


        //System.out.println(JMAP_MIDDLEWARE_PORT);
    }
}