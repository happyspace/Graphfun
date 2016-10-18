package roadgraph;

import geography.GeographicPoint;

/**
 * MapEdge class unites a collection of attributes that define an edge.
 *
 * MapEdge uses builder pattern with constructor for required fields and
 * and builders for optional fields.
 */
public class MapEdge {
    // require attributes which are immutable
    private final GeographicPoint start;
    private final GeographicPoint end;
    // optional attributes
    private String name;
    private double distance;
    private String type;

    public MapEdge(GeographicPoint start, GeographicPoint end) {
        this.start = start;
        this.end = end;
    }

    public MapEdge name(String name) {
        this.name = name;
        return this;
    }

    public MapEdge distance(double distance) {
        this.distance = distance;
        return this;
    }

    public MapEdge type(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public String getType() {
        return type;
    }


}
