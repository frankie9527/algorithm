package com.jyh.algorithm.nkHw;

import java.util.Scanner;
/**
 * 输入一个字符串，按照8拆分，长度如果不是8的倍数字符串后面用0补齐
 * example
 * 输入 abc
 * 输出 abc00000
 * */
public class HJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine() + "00000000";
            for (int i = 8; i < str.length(); i += 8) {
                System.out.println(str.substring(i - 8, i));
            }
        }
    }
}
