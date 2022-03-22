package com.company.design.shortestPath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class KruskalPath {

    private  HashMap<String, String> parent = new HashMap<>();

    private  HashMap<String, Integer> rank = new HashMap<>();

    public HashMap<String, String> getParent() {
        return parent;
    }

    public void setParent(HashMap<String, String> parent) {
        this.parent = parent;
    }

    public HashMap<String, Integer> getRank() {
        return rank;
    }

    public void setRank(HashMap<String, Integer> rank) {
        this.rank = rank;
    }




    private String find(String node){

        // Path Compression
        if (!this.parent.get(node).equals(node)) this.parent.put(node, find(parent.get(node)));
        return this.parent.get(node);
    }

    private void union(String nodeV, String nodeU){
        String vRoot = find(nodeV);
        String uRoot = find(nodeU);

        // Union By Rank
        if(this.rank.get(vRoot) > rank.get(uRoot)) this.parent.put(uRoot, vRoot);
        else {
            this.parent.put(vRoot, uRoot);
            if (this.rank.get(vRoot) == rank.get(uRoot)) rank.put(uRoot, rank.get(uRoot)+1);
        }

    }

    private void makeSet(String node){
        this.parent.put(node, node);
        this.rank.put(node ,0);
    }

    public ArrayList<Edgev2> func(ArrayList<String> vertices, ArrayList<Edgev2> edges){
        ArrayList<Edgev2> mst = new ArrayList<>();

        // 초기화
        for (String v : vertices) makeSet(v);
        // 간선 , weight 기반 sorting
        Collections.sort(edges);

        for (Edgev2 e : edges){
            if (!this.find(e.getNodeV()).equals(this.find(e.getNodeU()))){
                this.union(e.getNodeV(), e.getNodeU());
                mst.add(e);
            }
        }

        return mst;

    }


}
