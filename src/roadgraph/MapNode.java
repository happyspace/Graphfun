package roadgraph;

import geography.GeographicPoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A map node represents a location in a graph
 * with the associated neighbors to that node.
 */
public class MapNode {
    private final GeographicPoint location;
    private final Set<MapNode> neighbors;

    public MapNode(GeographicPoint location) {
        this.location = location;
        this.neighbors = new HashSet<>();
    }

    public boolean addNeighbor(MapNode neighbor){
        return neighbors.add(neighbor);
    }

    public List<MapNode> getNeighbors() {
        return neighbors.stream().collect(Collectors.toCollection(ArrayList::new));
    }

    public GeographicPoint getLocation() {
        return location;
    }
}
