package com.company.design.shortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraPath {
    public DijkstraPath() {
    }
    public HashMap<String, Integer> func(HashMap<String, ArrayList<Edgev1>> graph, String startNode){
        // 초기화 단계
        Edgev1 polledNode ;
        Integer currentDistance, weight ;
        String currentNode, adjacentNode;

        ArrayList<Edgev1> NodeList;
        HashMap<String, Integer> distances = new HashMap<>();
        for (String key : graph.keySet()) distances.put(key, Integer.MAX_VALUE);
        distances.put(startNode,0);

        PriorityQueue<Edgev1> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edgev1(distances.get(startNode), startNode));

        // 알고리즘 작성
        while (priorityQueue.size() > 0){
            polledNode = priorityQueue.poll();
            currentDistance = polledNode.getDistance();
            currentNode = polledNode.getVertex();

            // Priority Queue에 저장된 Distance값이 distances 해시맵에 저장된 값보다 큰 경우 continue;
            if (distances.get(currentNode) < currentDistance) continue;

            NodeList = graph.get(currentNode);
            for (Edgev1 node : NodeList) {
                adjacentNode = node.getVertex();
                weight = node.getDistance();

                if (currentDistance + weight < distances.get(adjacentNode)) {
                    distances.put(adjacentNode, currentDistance + weight);
                    priorityQueue.add(new Edgev1(currentDistance + weight, adjacentNode));
                }
            }
        }

        return distances;
    }
}
