package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//HJ81 字符串字符匹配
public class HJ81 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String s =in.nextLine();
            String l =in.nextLine();
            boolean flag = true;
            for(int i=0;i<s.length();i++){
                if(l.contains(String.valueOf(s.charAt(i)))){
                    continue;
                } else {
                    flag = false;
                }
            }
            System.out.println(flag);
        }
    }
}
