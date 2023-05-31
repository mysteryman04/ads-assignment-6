import java.util.*;

public class BreadthFirstSearch implements Search {
    private Map<Vertex, Boolean> visited;
    private Map<Vertex, Vertex> edgeTo;
    private Vertex source;

    public BreadthFirstSearch(WeightedGraph graph, Vertex source) {
        this.source = source;
        visited = new HashMap<>();
        edgeTo = new HashMap<>();
        bfs(graph, source);
    }
    private void bfs(WeightedGraph graph, Vertex source) {
        Queue<Vertex> queue = new LinkedList<>();
        visited.put(source, true);
        queue.offer(source);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            for (Map.Entry<Vertex, Integer> entry : graph.getAdjacentVertices(currentVertex).entrySet()) {
                Vertex neighbor = entry.getKey();
                // Rest of the code
                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, true);
                    edgeTo.put(neighbor, currentVertex);
                    queue.offer(neighbor);
                }
            }
        }
    }


    @Override
    public boolean hasPathTo(Vertex destination) {
        return visited.containsKey(destination);
    }

    @Override
    public List<Vertex> pathTo(Vertex destination) {
        if (!hasPathTo(destination)) {
            return null;
        }

        List<Vertex> path = new ArrayList<>();
        Vertex currentVertex = destination;
        while (!currentVertex.equals(source)) {
            path.add(currentVertex);
            currentVertex = edgeTo.get(currentVertex);
        }
        path.add(source);
        Collections.reverse(path);

        return path;
    }
}



