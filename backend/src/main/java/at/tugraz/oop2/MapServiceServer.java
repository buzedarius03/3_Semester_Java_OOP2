package at.tugraz.oop2;

import java.util.logging.Logger;

public class MapServiceServer {
    private static final Logger logger = Logger.getLogger(MapServiceServer.class.getName());

    public static void main(String[] args) {
        logger.info("Starting backend...");
        String port = "JMAP_BACKEND_PORT";
        String file = "JMAP_BACKEND_OSMFILE";
        String JMAP_BACKEND_OSM_FILE_STRING = System.getenv().getOrDefault(file, "data/styria_reduced.osm");
        String JMAP_BACKEND_PORT_String = System.getenv().getOrDefault(port, "8020");

        int JMAP_BACKEND_PORT;
        try {
            JMAP_BACKEND_PORT = Integer.parseInt(JMAP_BACKEND_PORT_String);
            if(JMAP_BACKEND_PORT < 0 || JMAP_BACKEND_PORT >= 65536)
            {
                JMAP_BACKEND_PORT = 8020;
            }
        }
        catch(NumberFormatException e) {
            JMAP_BACKEND_PORT = 8020;
        }

        MapLogger.backendStartup(JMAP_BACKEND_PORT, JMAP_BACKEND_OSM_FILE_STRING);
        //System.out.println(JMAP_BACKEND_PORT);
    }
}