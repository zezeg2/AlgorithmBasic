package com.company.design.shortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PrimPath {
    public ArrayList<Edgev2> primFunc(String startNode, ArrayList<Edgev2> edges) {
        Edgev2 currentEdge, poppedEdge, adjacentEdgeNode;
        ArrayList<Edgev2> currentEdgeList, candidateEdgeList, adjacentEdgeNodes;
        PriorityQueue<Edgev2> priorityQueue;

        ArrayList<String> connectedNodes = new ArrayList<>();
        ArrayList<Edgev2> mst = new ArrayList<>();
        HashMap<String, ArrayList<Edgev2>> adjacentEdges = new HashMap<>();

        for (Edgev2 edge : edges) {

            if (!adjacentEdges.containsKey(edge.getNodeV())) {
                adjacentEdges.put(edge.getNodeV(), new ArrayList<>());
            }
            if (!adjacentEdges.containsKey(edge.getNodeU())) {
                adjacentEdges.put(edge.getNodeU(), new ArrayList<>());
            }
        }

        for (Edgev2 edge : edges) {
            currentEdgeList = adjacentEdges.get(edge.getNodeV());
            currentEdgeList.add(new Edgev2(edge.getWeight(), edge.getNodeV(), edge.getNodeU()));
            currentEdgeList = adjacentEdges.get(edge.getNodeU());
            currentEdgeList.add(new Edgev2(edge.getWeight(), edge.getNodeU(), edge.getNodeV()));
        }

        connectedNodes.add(startNode);
        candidateEdgeList = adjacentEdges.getOrDefault(startNode, new ArrayList<>());
        priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(candidateEdgeList);

        while (priorityQueue.size() > 0) {
            poppedEdge = priorityQueue.poll();
            if (!connectedNodes.contains(poppedEdge.getNodeU())) {
                // 해당 edge 를 mst 에 추가
                connectedNodes.add(poppedEdge.getNodeU());
                mst.add(new Edgev2(poppedEdge.getWeight(), poppedEdge.getNodeV(), poppedEdge.getNodeU()));

                adjacentEdgeNodes = adjacentEdges.getOrDefault(poppedEdge.getNodeU(), new ArrayList<>());
                for (Edgev2 edgeNode : adjacentEdgeNodes) {
                    if (!connectedNodes.contains(edgeNode.getNodeU())) {
                        priorityQueue.add(edgeNode);
                    }
                }
            }
        }
        return mst;

    }
}