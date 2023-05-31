import java.util.*;

public class DijkstraSearch implements Search {
    private Map<Vertex, Integer> distTo;
    private Map<Vertex, Vertex> edgeTo;
    private PriorityQueue<Vertex> minHeap;
    private Vertex source;

    public DijkstraSearch(WeightedGraph graph, Vertex source) {
        this.source = source;
        distTo = new HashMap<>();
        edgeTo = new HashMap<>();
        minHeap = new PriorityQueue<>(Comparator.comparingInt(distTo::get));

        for (Vertex vertex : graph.getVertices()) {
            distTo.put(vertex, Integer.MAX_VALUE);
        }

        distTo.put(source, 0);
        minHeap.offer(source);

        while (!minHeap.isEmpty()) {
            Vertex currentVertex = minHeap.poll();
            for (Map.Entry<Vertex, Integer> entry : graph.getAdjacentVertices(currentVertex).entrySet()) {
                Vertex neighbor = entry.getKey();
                int edgeWeight = entry.getValue();
                int newDistance = distTo.get(currentVertex) + edgeWeight;

                if (newDistance < distTo.get(neighbor)) {
                    distTo.put(neighbor, newDistance);
                    edgeTo.put(neighbor, currentVertex);
                    minHeap.offer(neighbor);
                }
            }
        }
    }

    @Override
    public boolean hasPathTo(Vertex destination) {
        return distTo.get(destination) < Integer.MAX_VALUE;
    }

    @Override
    public List<Vertex> pathTo(Vertex destination) {
        if (!hasPathTo(destination))
            return null;

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
