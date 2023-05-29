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


}
