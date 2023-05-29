import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final int id;
    private List<Vertex> neighbors;

    public Vertex(int id) {
        this.id = id;
        this.neighbors = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void addNeighbor(Vertex neighbor) {
        neighbors.add(neighbor);
    }

}
