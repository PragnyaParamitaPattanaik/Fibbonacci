package com.practice09;

public class Fibbo {

    static  void printFibonacci(int N){
         int n1=0,n2=1;
         int count=0;
        while(count<N){
            System.out.print(n1+"");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            count=count+1;
        }
    }

    public static void main(String[] args) {
        int N=10;

        printFibonacci(N);

    }
}
