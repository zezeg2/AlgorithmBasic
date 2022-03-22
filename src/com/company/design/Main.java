package com.company.design;

import com.company.design.backtracking.NQueen;
import com.company.design.shortestPath.Edgev1;
import com.company.design.shortestPath.Edgev2;
import com.company.design.shortestPath.KruskalPath;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();

        for(int i = 0; i < 30; i++){
            testData.add((int)(Math.random()*30));
        }
//      Data Structure ------------------------------------------------------------------------------------------------------
//        Heap heap = new Heap();
//        testData.forEach(heap::insertTo);
//        System.out.println(heap);
//        heap.pop();
//        System.out.println(heap);

//      Sort Test ------------------------------------------------------------------------------------------------------

//
//        BubbleSort bubbleSort = new BubbleSort();
//        System.out.println(bubbleSort.sort(testData));
//
//        SelectionSort selectionSort = new SelectionSort();
//        System.out.println(selectionSort.sort(testData));
//
//        InsertionSort insertionSort = new InsertionSort();
//        System.out.println(insertionSort.sort(testData));

//        MergeSort mergeSort = new MergeSort();
//        System.out.println(mergeSort.mergeSplitFunc(testData));

//        QuickSort quickSort = new QuickSort();
//        System.out.println(quickSort.sort(testData));

//      Reculsive Test -------------------------------------------------------------------------------------------------

//        Factorial factorial = new Factorial();
//        factorial.setNum(10);
//        System.out.println(factorial.reculsive());

//        OneTwoThree  oneTwoThree = new OneTwoThree();
//        System.out.println(oneTwoThree.reculsive(4));

//        Fibonacci fibonacci = new Fibonacci();
//        System.out.println(fibonacci.recursive(9));
//        System.out.println(fibonacci.dynamicProgramming(9));

//      Search Test -------------------------------------------------------------------------------------------------

//        Collections.sort(testData);
//        System.out.println(testData);
//        BinarySearch binarySearch = new BinarySearch();
//        System.out.println(binarySearch.search(testData,11));

//      Compare Test -------------------------------------------------------------------------------------------------

//        Edgev1 edgev11 = new Edgev1(12,"A");
//        Edgev1 edgev12 = new Edgev1(5,"B");
//        Edgev1 edgev13 = new Edgev1(8,"C");
//        Edgev1 edgev14 = new Edgev1(87,"X");
//
//        Edgev1[] edgev1s = new Edgev1[]{edgev11, edgev12, edgev13, edgev14};
//        Arrays.sort(edgev1s);
//        System.out.println(Arrays.toString(edgev1s));
//
//        Arrays.sort(edgev1s, new Comparator<Edgev1>() {
//            @Override
//            public int compare(Edgev1 o1, Edgev1 o2) {
//                return o2.getDistance() - o1.getDistance();
//            }
//        });
//        System.out.println(Arrays.toString(edgev1s));

//        KruscalPath Test --------------------------------------------------------------------------------------------
//        ArrayList<String> vetices = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
//        ArrayList<Edgev2> edges = new ArrayList<>();
//        edges.add(new Edgev2(7, "A", "B"));
//        edges.add(new Edgev2(5, "A", "D"));
//        edges.add(new Edgev2(7, "B", "A"));
//        edges.add(new Edgev2(8, "B", "C"));
//        edges.add(new Edgev2(9, "B", "D"));
//        edges.add(new Edgev2(7, "B", "E"));
//        edges.add(new Edgev2(8, "C", "B"));
//        edges.add(new Edgev2(5, "C", "E"));
//        edges.add(new Edgev2(5, "D", "A"));
//        edges.add(new Edgev2(9, "D", "B"));
//        edges.add(new Edgev2(7, "D", "E"));
//        edges.add(new Edgev2(6, "D", "F"));
//        edges.add(new Edgev2(7, "E", "B"));
//        edges.add(new Edgev2(5, "E", "C"));
//        edges.add(new Edgev2(7, "E", "D"));
//        edges.add(new Edgev2(8, "E", "F"));
//        edges.add(new Edgev2(9, "E", "G"));
//        edges.add(new Edgev2(6, "F", "D"));
//        edges.add(new Edgev2(8, "F", "E"));
//        edges.add(new Edgev2(11, "F", "G"));
//        edges.add(new Edgev2(9, "G", "E"));
//        edges.add(new Edgev2(11, "G", "F"));
//
//        KruskalPath kruskalPath = new KruskalPath();
//        ArrayList<Edgev2> result = kruskalPath.func(vetices, edges);
//        System.out.println(result);

//        N Queen Test --------------------------------------------------------------------------------------------

        NQueen nQueen = new NQueen();
        nQueen.dfs(4, 0, new ArrayList<Integer>());
    }
}
