package com.jyh.algorithm.nkHw;


import java.util.Scanner;
import java.util.TreeMap;


//合并表记录
public class HJ8 {
    public static void main() {
        Scanner sc = new Scanner("3\n" +
                "0 1\n" +
                "0 2\n" +
                "11111111 8");
        TreeMap<Integer, Integer> map = new TreeMap<>(); // 输出结果要求有序！
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; ++i) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (map.get(a) == null) {
                    map.put(a, b);
                } else {
                    Integer ss = map.get(a) + b;
                    map.put(a, ss);
                }

            }
        }
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
