package com.jyh.algorithm.nkHw;

import java.util.Scanner;
// 自守数  625 25
public class HJ99 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int maxNum=sc.nextInt();
        int hasNum=0;
        String s1,s2,s3;
        for (int i=0;i<maxNum;i++){
             s1=String.valueOf(i*i);
             s2=String.valueOf(i);
             s3=s1.substring(s1.length()-s2.length(),s1.length());

            if (s3.equals(s2)){
                hasNum++;
            }
        }
        System.out.println(hasNum);
    }
}
