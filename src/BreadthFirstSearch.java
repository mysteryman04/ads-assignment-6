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



    @Override
    public boolean hasPathTo(Vertex destination) {
        return false;
    }

    @Override
    public List<Vertex> pathTo(Vertex destination) {
        return null;
    }
}



