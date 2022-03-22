package com.company.design.reculsive;

public class Fibonacci {
    public Fibonacci() {
    }

    public int recursive(int n){
        if (n<=1) return n;
        return recursive(n-1)+ recursive(n-2);
    }

    public int dynamicProgramming(int n){
        Integer[] cache = new Integer[n+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < n+1; i++) cache[i] = cache[i-1] + cache[i-2];
        return cache[n];
    }
}
