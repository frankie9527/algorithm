package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ38 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double h = scanner.nextDouble();
            double last = h / Math.pow(2, 5);
            double allH = h;
            for (int i = 0; i < 4; i++) {
                allH += h / Math.pow(2, i);
            }
            System.out.println(allH + "");
            System.out.println(last + "");
        }
    }
}
