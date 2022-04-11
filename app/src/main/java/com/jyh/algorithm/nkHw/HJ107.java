package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//求立方根
public class HJ107 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        double data=scanner.nextDouble();
        double currentNum=1.0f;
        while (currentNum*currentNum*currentNum<data){
            currentNum+=0.1f;
        }
        System.out.printf("%.1f",currentNum);
    }


}
