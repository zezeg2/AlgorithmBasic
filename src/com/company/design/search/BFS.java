package com.company.design.search;

import java.util.ArrayList;
import java.util.HashMap;

public class BFS {
    public BFS() {
    }
    public ArrayList<String> func(HashMap<String, ArrayList<String>> graph, String startNode){
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();
        int count = 0;

        needVisit.add(startNode);

        while(needVisit.size()>0){
            count+=1;
            String node = needVisit.remove(0);
            if (!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        System.out.println("count : " + count);

        return visited;

    }
}
