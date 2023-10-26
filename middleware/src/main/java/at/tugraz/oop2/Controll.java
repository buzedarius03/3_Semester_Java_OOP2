package at.tugraz.oop2;

import org.springframework.web.bind.annotation.GetMapping;
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




}
