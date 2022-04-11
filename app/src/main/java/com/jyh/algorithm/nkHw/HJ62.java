package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ62 {
    public static void  main(){
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNext()){
            String  str= Integer.toBinaryString( scanner.nextInt());
            int count=str.length()-(str.replace("1","").length());
            System.out.println(count);
        }
    }
}
