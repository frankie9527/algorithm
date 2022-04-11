package com.jyh.algorithm.nkHw;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/exam/oj/ta?tpId=37
 * 华为机试题入口
 * 输入一个字符串已空格分割，求最后一个字符串长度
 * example
 * 输入：hello nowcoder
 * 输出： 8
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] dataStr = str.split(" ");
        System.out.println(dataStr[dataStr.length - 1].length());
    }
}
