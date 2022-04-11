package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//求最大连续bit数
public class HJ86 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            String twoStr=Integer.toBinaryString(Integer.parseInt(str));
           String []data= twoStr.split("0");
           int max=0;
            for (String s:
                 data) {
                if (s.length()>max){
                    max=s.length();
                }
            }
            System.out.println(max);
        }
    }
}
