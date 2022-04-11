package com.jyh.algorithm.nkHw;

import java.util.Scanner;
//字符个数统计
public class HJ10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String lastStr="";
        StringBuffer ss=new StringBuffer();

        for (int i=0;i<str.length();i++){
             if (!lastStr.contains(str.charAt(i)+"")){
                 lastStr+=str.charAt(i);
             }
        }
        System.out.println(lastStr.length());
    }
}
