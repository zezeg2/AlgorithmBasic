package com.company.design.reculsive;

public class OneTwoThree {
    public OneTwoThree() {
    }

    public int reculsive(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;


        return reculsive(n-1) + reculsive(n-2) + reculsive(n-3);
    }
}
