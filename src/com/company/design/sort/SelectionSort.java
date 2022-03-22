package com.company.design.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public SelectionSort() {
    }
    public ArrayList<Integer> sort(ArrayList<Integer> list){
        int min;
        for(int i =0; i < list.size() - 1; i++){
            min = i;
            for(int j = i+1; j < list.size(); j++){
                if (list.get(min) > list.get(j)) min = j;
            }
            Collections.swap(list,min,i);
        }
        return list;
    }
}
