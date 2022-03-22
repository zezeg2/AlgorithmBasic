package com.company.design.shortestPath;

public class Edgev1 implements Comparable<Edgev1>{
    private Integer distance;
    private String vertex;

    public Edgev1(Integer distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    public Edgev1() {
    }

    @Override
    public int compareTo(Edgev1 o) {
        return this.distance - o.distance;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "distance=" + distance +
                ", vertex='" + vertex + '\'' +
                '}';
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getVertex() {
        return vertex;
    }

    public void setVertex(String vertex) {
        this.vertex = vertex;
    }
}
