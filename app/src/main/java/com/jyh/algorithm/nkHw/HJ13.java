package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//句子逆序
public class HJ13 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String [] str=scanner.nextLine().split(" ");
            for (int i=str.length-1;i>=0;i--){
                System.out.print(str[i]+" ");
            }
            System.out.println("");
        }
    }
}
