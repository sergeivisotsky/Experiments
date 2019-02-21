package org.sergei.collections.graph;

import java.util.Objects;

public class Vertex {
    private final int id;
    private final String name;

    public Vertex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;
        Vertex vertex = (Vertex) o;
        return id == vertex.id &&
                Objects.equals(name, vertex.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
