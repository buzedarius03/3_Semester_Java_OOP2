package at.tugraz.oop2;

import org.apache.logging.log4j.util.StringMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Roads {

    private String name;
    private long id;
    private Geometry geom;
    private StringMap tags;
    private String type;

}
