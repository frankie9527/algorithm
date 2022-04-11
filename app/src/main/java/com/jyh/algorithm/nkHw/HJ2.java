package com.jyh.algorithm.nkHw;

import java.util.Scanner;
/**
输入2行，第一行字符串，第二行为字符，求第二行字符在第一行字符出现的次数
 example
 输入 ： ABCabc
        A
 输出 ： 2
 */
public class HJ2 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        char [] str=scanner.nextLine().toLowerCase().toCharArray();
        char [] s=scanner.nextLine().toLowerCase().toCharArray();
        int count=0;
        for (char c : str) {
            if (c == s[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
