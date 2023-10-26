package at.tugraz.oop2;
public class MapApplication {
    public static void main(String[] args) {
        String port = "JMAP_MIDDLEWARE_PORT";
        String target = "JMAP_BACKEND_TARGET";
        String JMAP_MIDDLEWARE_PORT_String = System.getenv().getOrDefault(port, "8010");
        String JMAP_BACKEND_TARGET_String = System.getenv().getOrDefault(target, "localhost:8020");

        int JMAP_MIDDLEWARE_PORT;
        try {
            JMAP_MIDDLEWARE_PORT = Integer.parseInt(JMAP_MIDDLEWARE_PORT_String);
        }
        catch(NumberFormatException e) {
            JMAP_MIDDLEWARE_PORT = 8010;
        }

        MapLogger.middlewareStartup(JMAP_MIDDLEWARE_PORT, JMAP_BACKEND_TARGET_String);

        //System.out.println(JMAP_MIDDLEWARE_PORT);
    }
}