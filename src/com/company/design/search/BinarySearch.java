package com.company.design.search;

import java.util.ArrayList;

public class BinarySearch {
    public boolean search(ArrayList<Integer> list, Integer item){
        if (list.size() == 1 && item == list.get(0)) return true;
        if (list.size() == 1 && item != list.get(0)) return false;
        if (list.size()==0) return  false;

        int mid = list.size()/2;

        if (item == list.get(mid)) return true;
        else {
            if (item > list.get(mid)) return this.search(new ArrayList<Integer>(list.subList(mid, list.size())), item);
            else return this.search(new ArrayList<Integer>(list.subList(0, mid)), item);
        }
    }
}
