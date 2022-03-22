package com.company.design.search;

import java.util.*;

public class DFS {
    public DFS() {
    }

    public ArrayList<String> funcFirst(HashMap<String, ArrayList<String>> graph, String startNode){

        int count = 0;
        ArrayList<String> needVisit = new ArrayList<>();
        ArrayList<String> visited = new ArrayList<>();

        needVisit.add(startNode);

        while(needVisit.size()>0){
            count+=1;
            String node = needVisit.remove(needVisit.size()-1);
            if (!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        System.out.println("count : " + count);

        return visited;

    }
    public List<String> funcSecond(HashMap<String, ArrayList<String>> graph, String startNode){

        int count = 0;
        Stack<String> needVisit = new Stack<>();
        List<String> visited = new LinkedList<>();

        needVisit.add(startNode);

        while(needVisit.size()>0){
            count+=1;
            String node = needVisit.pop();
            if (!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        System.out.println("count : " + count);

        return visited;

    }


}
