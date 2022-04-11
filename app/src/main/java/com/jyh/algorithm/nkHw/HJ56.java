package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//HJ56 完全数计算
public class HJ56 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int count =0;
            int n=scanner.nextInt();
            for (int i=1;i<n;i++){
                if (isPerNum(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isPerNum(int num){
        int all=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                all+=i;
            }
        }
        return all == num;
    }
}
