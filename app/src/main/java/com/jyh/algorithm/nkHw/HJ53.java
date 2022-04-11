package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//杨辉三角变形
public class HJ53 {
    public static  void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(computer(n));
        };

    }
    public static int computer(int n){
        if (n==1||n==2){
            return -1;
        }
        //是奇数行
        if (n%2==0){
            return 2;
        }
        // 是偶数行
        if (n%4==0){
            return 3;
        }
        if (n%4==2){
            return 4;
        }
        return -1;
    }
}
