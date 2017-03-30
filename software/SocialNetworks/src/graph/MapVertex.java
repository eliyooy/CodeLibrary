package graph;

import java.util.ArrayList;

/**
 * Created by eliyahudorsky on 6/22/16.
 */
public class MapVertex {

    private int vertexNumber;
    private ArrayList<MapEdge> edges;

    public MapVertex(int vertexNumber) {
        this.vertexNumber = vertexNumber;
        edges = new ArrayList<>();
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public ArrayList<MapEdge> getEdges() {
        return edges;
    }

    public void addEdges(MapEdge edge) {
        edges.add(edge);
    }
}
