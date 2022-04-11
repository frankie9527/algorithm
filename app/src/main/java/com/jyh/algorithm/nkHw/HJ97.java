package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ97 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int num=scanner.nextInt();
           String [] str=  scanner.nextLine().split(" ");
           int all=0;
           int fCount=0;
           for (int i=0;i<num;i++){
               if (Integer.parseInt(str[i])<0){
                   fCount++;
               }
               all+=Integer.parseInt(str[i]);
           }
           System.out.println(fCount+" "+String.format("%.1f", all));
        }
    }
}
