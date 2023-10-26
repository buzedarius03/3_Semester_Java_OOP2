package at.tugraz.oop2;

import lombok.Getter;
import org.apache.logging.log4j.util.StringMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static java.util.Map.entry;

@Getter
public class Roads {

    private String name = "Dummy_name";
    private long id = 20603;
    private Geometry geom = new Geometry();
    private Map<String, String> tags = Map.ofEntries(entry("Dummy", "entry"), entry("Dummy2", "entry2"));
    private String type = "motorway";
    private double[] child_ids = {10 ,10};

    public Roads()
    {

    }
    public Roads(long id)
    {
        this.id = id;
    }

    public Roads(String name, long id, Geometry geom, Map<String, String> tags, String type, double[] child_ids) {
        this.name = name;
        this.id = id;
        this.geom = geom;
        this.tags = tags;
        this.type = type;
        this.child_ids = child_ids;
    }

}
