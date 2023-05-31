import java.util.List;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();

        Vertex vertexA = new Vertex(1);
        Vertex vertexB = new Vertex(2);
        Vertex vertexC = new Vertex(3);

        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);

        graph.addEdge(vertexA, vertexB, 10);
        graph.addEdge(vertexB, vertexC, 5);
        graph.addEdge(vertexA, vertexC, 8);


        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, vertexA);
        List<Vertex> bfsPath = bfs.pathTo(vertexC);

        if (bfsPath != null) {
            System.out.println("BFS Path: " + bfsPath);
        } else {
            System.out.println("No path found.");
        }




    }
}
