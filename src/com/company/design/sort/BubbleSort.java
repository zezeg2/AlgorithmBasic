package com.company.design.sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public BubbleSort() {
    }

    public ArrayList<Integer> sort(ArrayList<Integer> list){

        for(int i = 0; i < list.size() - 1; i++){
            boolean swaped = false;
            for(int j = 0; j < list.size()-1; j++){
                if (list.get(j) > list.get(j+1)){
                    Collections.swap(list, j, j+1);
                    swaped = true;
                }
            }
            if (!swaped) break;
        }

        return list;
    }
}
