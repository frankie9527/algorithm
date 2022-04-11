package com.jyh.algorithm.nkHw;

import java.util.Scanner;
//计每个月兔子的总数
public class HJ37 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int m=scanner.nextInt();
            System.out.println(sum(m));
        }
    }
    public static int sum(int month){
        int sum=0;

        if(month==1){
            sum=1;
        }else if(month==2){
            sum=1;
        }else if(month==3){
            sum=2;
        }
        else{
            sum=sum(month-1)+sum(month-2);
        }

        return sum;


    };
}
