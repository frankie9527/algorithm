package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ105 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int fCount=0;
        int zCount=0;
        int allNum=0;
        while (scanner.hasNext()){
            int num=scanner.nextInt();
            if (num<0){
                fCount++;
            }else {
                zCount++;
                allNum+=num;
            }
        }
        System.out.println(fCount);
        if (allNum==0){
            System.out.println("0.0");
        }else {
            System.out.println(String.format("%.1f",(double)allNum/zCount));
        }
    }
}
