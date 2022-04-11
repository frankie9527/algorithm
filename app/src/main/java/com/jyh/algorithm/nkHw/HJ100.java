package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ100 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int lastNum=2+3*(n-1);
            int all=(2+lastNum)*n/2;
            System.out.println(all);
        }
    }
}
