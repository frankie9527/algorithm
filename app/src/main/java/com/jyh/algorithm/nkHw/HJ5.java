package com.jyh.algorithm.nkHw;


import java.util.Scanner;

/**
 * 输入一个16进制数字，要求输出对应的10进制字符串
 * example
 * 输入 ：0XAA
 * 输出 ：170
 * */
public class HJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine().replace("x", "");
            int num = Integer.parseInt(str, 2);
            System.out.println(num);
        }
    }
}
