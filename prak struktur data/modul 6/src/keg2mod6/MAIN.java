package keg2mod6;

public class MAIN {
    public static void main(String[] args) {
        Graph graph = new Graph(12);

        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,1);
        graph.addEdge(2,5);
        graph.addEdge(4,6);
        graph.addEdge(5,2);
        graph.addEdge(5,3);
        graph.addEdge(5,7);
        graph.addEdge(5,9);
        graph.addEdge(6,7);
        graph.addEdge(7,6);
        graph.addEdge(7,11);
        graph.addEdge(8,9);
        graph.addEdge(8,11);
        graph.addEdge(9,5);
        graph.addEdge(9,8);
        graph.addEdge(11,7);
        graph.addEdge(11,10);


        System.out.println("Graph Breadth First Search(BFS) : ");
        graph.BFS(1);
        System.out.println("\nGraph Depth First Search(DFS) : ");
        graph.DFS(1);

    }
}
