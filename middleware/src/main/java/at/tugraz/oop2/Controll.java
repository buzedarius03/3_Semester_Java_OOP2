package at.tugraz.oop2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

import static java.util.Map.entry;

@RestController
public class Controll {
    @GetMapping("/amenities")
    public Map<String, Object> returnAmenitiesRequest()
    {   Amenities Amenity = new Amenities();
        Map<String, Integer> paging_entry = Map.ofEntries(entry("skip", 0), entry("take", 1), entry("total", 6));
        return Map.ofEntries(entry("entries",  new Amenities[]{Amenity}), entry("paging", paging_entry));
    }

    @GetMapping("/amenities/{amenity_id}")
    public Amenities returnAmenitiesById(@PathVariable("amenity_id") long amenity_id)
    {
        Amenities amenity_by_ID = new Amenities(amenity_id);
        return amenity_by_ID;
    }

    @GetMapping("/roads")
    public Map<String, Object> returnRoadsRequest()
    {   Roads Road = new Roads();
        Map<String, Integer> paging_entry = Map.ofEntries(entry("skip", 0), entry("take", 1), entry("total", 6));
        return Map.ofEntries(entry("entries",  new Roads[]{Road}), entry("paging", paging_entry));
    }

    @GetMapping("/roads/{road_id}")
    public Roads returnRoadsById(@PathVariable("road_id") long road_id)
    {
        Roads road_by_ID = new Roads(road_id);
        return road_by_ID;
    }







}
