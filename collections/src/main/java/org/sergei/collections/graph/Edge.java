package org.sergei.collections.graph;

public class Edge {
    private final int id;
    private final Vertex source;
    private final Vertex distention;
    private final int weight;

    public Edge(int id, Vertex source, Vertex distention, int weight) {
        this.id = id;
        this.source = source;
        this.distention = distention;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDistention() {
        return distention;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " " + distention;
    }
}
