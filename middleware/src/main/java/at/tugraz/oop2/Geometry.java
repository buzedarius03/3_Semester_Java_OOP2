package at.tugraz.oop2;

import lombok.Getter;
import org.checkerframework.checker.units.qual.C;


@Getter
class Geometry {
    private String type = "point";
    private double[][] coordinates = {{10 ,10}};
    private Crs crs = new Crs();

}
