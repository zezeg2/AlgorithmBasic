package com.company.design.sort;

import java.util.ArrayList;

public class MergeSort {


    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftArr, ArrayList<Integer> rightArr){
        ArrayList<Integer> mergedList = new ArrayList<>();

        int leftPoint = 0;
        int rightPoint = 0;

        while(leftArr.size() > leftPoint && rightArr.size() > rightPoint){
            if (leftArr.get(leftPoint) > rightArr.get(rightPoint)){
                mergedList.add(rightArr.get(rightPoint));
                rightPoint+= 1;
            }else{
                mergedList.add(leftArr.get(leftPoint));
                leftPoint+= 1;
            }
        }

        while(leftArr.size()>leftPoint){
            mergedList.add(leftArr.get(leftPoint));
            leftPoint+= 1;
        }

        while(rightArr.size()>rightPoint){
            mergedList.add(rightArr.get(rightPoint));
            rightPoint += 1;
        }
    return mergedList;
    }

    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> list){
        if (list.size()<=1) return list;
        int mid = list.size()/2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = this.mergeSplitFunc(new ArrayList<Integer>(list.subList(0,mid)));
        rightArr = this.mergeSplitFunc(new ArrayList<Integer>(list.subList(mid,list.size())));

        return mergeFunc(leftArr,rightArr);
    }

}
