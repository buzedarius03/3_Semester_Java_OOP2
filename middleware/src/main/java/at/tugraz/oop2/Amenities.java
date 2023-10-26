package at.tugraz.oop2;

import org.apache.logging.log4j.util.StringMap;

import java.util.Map;
import static java.util.Map.entry;
import lombok.Getter;

@Getter
public class Amenities {

    private String name = "Dummy_name";
    private long id = 20603;
    private Geometry geom = new Geometry();
    private Map<String, String> tags = Map.ofEntries(entry("Dummy", "entry"), entry("Dummy2", "entry2"));
    private String type = "restaurant";

    public Amenities()
    {

    }
    public Amenities(long id)
    {
        this.id = id;
    }

    public Amenities(String name, long id, Geometry geom, Map<String, String> tags, String type) {
        this.name = name;
        this.id = id;
        this.geom = geom;
        this.tags = tags;
        this.type = type;
    }
}


