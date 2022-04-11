package com.jyh.algorithm.nkHw;

import java.util.*;
public class HJ65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String ss1 = in.nextLine();
            String ss2 = in.nextLine();
            String s1 = ss1.length()<ss2.length() ? ss1:ss2;  // 短的字符串
            String s2 = ss1.length()<ss2.length() ? ss2:ss1;  // 长的字符串
            int n = 0;
            String str="";
            for(int i=0;i<s1.length();i++){              // 头指针从第一位开始递增
                for(int j=s1.length();j>i;j--){          // 尾指针从最后一位开始缩减
                    if(s2.contains(s1.substring(i,j))){  // 第一次发现合集的长度一定是最大的
                        if (j-i>n){
                            n=j-i;
                            str=s1.substring(i,j);
                        }

                    }
                }
            }
            System.out.println(str);
        }

    }
}