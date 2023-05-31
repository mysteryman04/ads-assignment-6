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
            throw new IllegalArgumentException("Vertices not present in the graph.");

        if (adjacencyMap.get(source) == null)
            adjacencyMap.put(source, new HashMap<>());

        if (adjacencyMap.get(destination) == null)
            adjacencyMap.put(destination, new HashMap<>());

        adjacencyMap.get(source).put(destination, weight);
        adjacencyMap.get(destination).put(source, weight);
    }

    public int getEdgeWeight(Vertex source, Vertex destination) {
        if (!adjacencyMap.containsKey(source) || !adjacencyMap.containsKey(destination))
            throw new IllegalArgumentException("Vertices not present");

        return adjacencyMap.get(source).getOrDefault(destination, Integer.MAX_VALUE);
    }

    public Map<Vertex, Integer> getAdjacentVertices(Vertex vertex) {
        if (!adjacencyMap.containsKey(vertex))
            throw new IllegalArgumentException("Vertex not present");

        return adjacencyMap.get(vertex);
    }

}
