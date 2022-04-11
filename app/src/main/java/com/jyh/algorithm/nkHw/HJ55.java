package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ55 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int inputNum=scanner.nextInt();
            int count=0;
            for (int i=7;i<=inputNum;i++){
                if (i%7==0){
                    count++;
                }else {
                    if (String.valueOf(i).contains("7")){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
