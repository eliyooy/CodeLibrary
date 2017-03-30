package graph;

/**
 * Created by eliyahudorsky on 6/22/16.
 */
public class MapEdge {

    private int from;
    private int to;

    public MapEdge(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
