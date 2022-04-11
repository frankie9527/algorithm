package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ68 {

    public  static void  main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int engCount = 0,kgCount,numCount = 0,otherCount;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                engCount++;
            }
            if (Character.isDigit(str.charAt(i))){
                numCount++;
            }
        }
        kgCount= str.split(" ").length-1;
        otherCount=str.length()-engCount-kgCount-numCount;
        System.out.println(engCount);
        System.out.println(kgCount);
        System.out.println(numCount);
        System.out.println(otherCount);


    }
}
