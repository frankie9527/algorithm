package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//统计大写字母个数
public class HJ84 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            int count=0;
            for (int i=0;i<str.length();i++){
                if (Character.isUpperCase(str.charAt(i))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
