package com.company.design.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public void func(Integer[][] list, double capacity){
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return  (o2[1]/o2[0]) - (o1[1]/o1[0]);
            }
        });

        for (int i = 0; i < list.length; i++){
            if (capacity - (double)list[i][0] > 0){
                capacity -= (double) list[i][0];
                totalValue += (double) list[i][1];
                System.out.println("weight : " + list[i][0] +" , " + "value : " + list[i][1]);
            }
            else{
                fraction = capacity / (double) list[i][0];
                totalValue += (double) list[i][1];
                System.out.println("weight : " + list[i][0] +" , " + "value : " + list[i][1]);
                break;

            }
        }
        System.out.println("total Value : " + totalValue);
    }
}
