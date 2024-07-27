package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphOps {
    //build graph ops here
    //add vertices
    //add edges

    /*
    use map to store the vertices. we use adjacency list to store the relationship
     */
    Map<Graph, List<Graph>> map = new HashMap<>();

    void addVertices(String name){
        Graph graph = new Graph(name);
        map.computeIfAbsent(graph, (key) -> new ArrayList<>());
//        System.out.println("Hashcode "+graph.hashCode()+" map hashcode "+map.get(graph).hashCode()
//                +" IdentityHashcode "+System.identityHashCode(graph)+" map identity hashcode "+System.identityHashCode(map.get(graph)));
    }
    void removeVertices(String name){
            Graph graph = new Graph(name);
            map.remove(graph);
    }

    public static void main(String[] args) {
        GraphOps gp = new GraphOps();
        gp.addVertices("John");
        gp.addVertices("John");
        gp.addVertices("Kay");
        gp.addVertices("Kay");
        gp.addVertices("Weed");
        gp.addVertices("Weed");
        gp.addVertices("john");
        gp.addVertices("john");
        gp.addVertices("JOHN");
        gp.addVertices("JOHN");
        System.out.println("DEBUG");
    }
}
