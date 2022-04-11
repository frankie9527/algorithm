package com.jyh.algorithm.nkHw;

import android.util.Log;

//最小公倍数
public class HJ108 {
    public static void main() {

        int a= 5;
        int b= 7;
        int sum=a*b;
        if(a>b){
            int n = a;
            a = b;
            b = n;
        }
        while (b != 0) {
            int x = a%b;
            a = b;
            b = x;
        }
        System.out.println(sum/a);
    }
}
