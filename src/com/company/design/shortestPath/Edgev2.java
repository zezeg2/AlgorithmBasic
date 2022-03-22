package com.company.design.shortestPath;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Edgev2 implements Comparable<Edgev2>{
    private int weight;
    private String nodeV;
    private String nodeU;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNodeV() {
        return nodeV;
    }

    public void setNodeV(String nodeV) {
        this.nodeV = nodeV;
    }

    public String getNodeU() {
        return nodeU;
    }

    public void setNodeU(String nodeU) {
        this.nodeU = nodeU;
    }

    @Override
    public String toString() {
        return "Edgev2{" +
                "weight=" + weight +
                ", nodeV='" + nodeV + '\'' +
                ", nodeU='" + nodeU + '\'' +
                '}';
    }

    public Edgev2(int weight, String nodeV, String nodeU) {
        this.weight = weight;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
    }

    @Override
    public int compareTo(Edgev2 o) {
        return this.weight - o.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edgev2 edgev2 = (Edgev2) o;
        return weight == edgev2.weight && nodeV.equals(edgev2.nodeV) && nodeU.equals(edgev2.nodeU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, nodeV, nodeU);
    }
}
