import java.util.HashMap;
import java.util.Map;

public class WeightedGraph {
    private Map<Vertex, Map<Vertex, Integer>> adjacencyMap;

    public WeightedGraph() {
        this.adjacencyMap = new HashMap<>();
    }
    public void addVertex(Vertex vertex) {
        adjacencyMap.put(vertex, new HashMap<>());
    }
    public void addEdge(Vertex source, Vertex destination, int weight) {
        if (!adjacencyMap.containsKey(source) || !adjacencyMap.containsKey(destination))
            throw new IllegalArgumentException("Vertices not present");

        adjacencyMap.get(source).put(destination, weight);
        adjacencyMap.get(destination).put(source, weight);
    }


}
