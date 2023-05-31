# ads-assignment-6

# Graph Algorithms

```java
This project implements graph algorithms for pathfinding using various search techniques. It includes the following classes:

- `Vertex`: Represents a vertex in a graph.
- `WeightedGraph`: Represents a weighted graph with vertices and edges.
- `Search`: An interface defining common methods for graph search algorithms.
- `BreadthFirstSearch`: Implements the breadth-first search algorithm for finding the shortest path in a graph.
- `DijkstraSearch`: Implements Dijkstra's algorithm for finding the shortest path in a weighted graph.
- `Main`: Contains an example usage of the graph algorithms.

## Vertex

The `Vertex` class represents a vertex in a graph. It provides a constructor to create a vertex with an identifier and methods to retrieve and compare vertex identifiers.

## WeightedGraph

The `WeightedGraph` class represents a weighted graph with vertices and edges. It provides methods to add vertices and edges, retrieve adjacent vertices, and get the set of all vertices in the graph.

## Search

The `Search` interface defines the common methods for graph search algorithms. It includes `hasPathTo()` to check if there is a path to a given destination vertex and `pathTo()` to retrieve the path from the source vertex to the destination vertex.

## BreadthFirstSearch

The `BreadthFirstSearch` class implements the breadth-first search algorithm for finding the shortest path in a graph. It uses a queue to traverse the graph in a breadth-first manner and stores the path from the source vertex to each visited vertex.

## DijkstraSearch

The `DijkstraSearch` class implements Dijkstra's algorithm for finding the shortest path in a weighted graph. It uses a priority queue to select the vertex with the smallest distance and updates the distances of adjacent vertices if a shorter path is found. It also maintains the previous vertex for each visited vertex to reconstruct the shortest path.

## Main

The `Main` class contains an example usage of the graph algorithms. It creates a weighted graph, adds vertices and edges, and performs a breadth-first search and Dijkstra's search from a source vertex to a destination vertex. It demonstrates how to retrieve the shortest path using the implemented algorithms.

Example usage:

```java
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

DijkstraSearch dijkstra = new DijkstraSearch(graph, vertexA);
List<Vertex> dijkstraPath = dijkstra.pathTo(vertexC);

if (dijkstraPath != null) {
    System.out.println("Dijkstra Path: " + dijkstraPath);
} else {
    System.out.println("No path found.");
}
```
