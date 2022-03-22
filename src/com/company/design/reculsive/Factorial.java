package com.company.design.reculsive;

public class Factorial {

    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public Factorial() {
    }

    public int reculsive(){
        if(this.num > 1){
            this.num--;
            return (num+1)*reculsive();
        }
        return 1;
    }


}
