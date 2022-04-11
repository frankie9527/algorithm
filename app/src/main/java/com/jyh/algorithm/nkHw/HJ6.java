package com.jyh.algorithm.nkHw;


import java.util.Scanner;

/**
输入一个数，求这个数字所有的质因素
example
输入 180
输出 2 2 3 3 5
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int inputNum = scanner.nextInt();
            StringBuffer sb = new StringBuffer();
            while (inputNum != -1) {
                inputNum = calculate(inputNum, sb);
            }
            System.out.println(sb.toString());
        }
    }

    public static int calculate(int num, StringBuffer sb) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sb.append(i + " ");
                return num / i;
            }
        }
        sb.append(num + " ");
        return -1;
    }
}
