package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//汽水瓶
public class HJ22 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        int count=0;
        while (scanner.hasNext()){
            int inputNum=scanner.nextInt();
            if (inputNum>=2){
                count=inputNum/2;
                System.out.println(count);
            }

        }
    }
}
