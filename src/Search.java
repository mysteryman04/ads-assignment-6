import java.util.List;

public interface Search {
    boolean hasPathTo(Vertex destination);
    List<Vertex> pathTo(Vertex destination);
}
