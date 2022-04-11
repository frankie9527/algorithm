package com.jyh.algorithm.nkHw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ36 {
    public static void main() {
        Scanner sc = new Scanner("nihao\n" +
                "ni");
        while (sc.hasNext()) {
            String key = sc.nextLine();
            String data = sc.nextLine();

            String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String s1 = s2.toLowerCase();


            List<String> list = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                list.add(s1.charAt(i)+"");
            }

            String str= "";
            for (int i = 0; i < key.length(); i++) {
                if (!(str.contains(key.charAt(i)+""))) {
                    str += key.charAt(i);
                }
            }
            String aa=str;
            //2.删一个添一个
            for (int i = 0; i < str.length(); i++) {
                list.remove(str.charAt(i)+"");
                list.add(i, str.charAt(i)+"");
            }

            for (int i = 0; i < data.length(); i++) {
                System.out.print(list.get(s1.indexOf(data.charAt(i))));
            }
            System.out.println();

        }
        sc.close();

    }
}
