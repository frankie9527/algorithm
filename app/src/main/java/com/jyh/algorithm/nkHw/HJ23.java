package com.jyh.algorithm.nkHw;

import java.util.HashMap;
import java.util.Scanner;

public class HJ23 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            char [] arr=scanner.nextLine().toCharArray();
            HashMap<Character,Integer> map=new HashMap<>();
            for (char c : arr) {
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
            int min=arr.length;
            for (Integer i:
                    map.values()) {
                if (min>i){
                    min=i;
                }
            }
            for (int index=0;index<arr.length;index++) {
                if (map.get(arr[index])!=min){
                    System.out.print(arr[index]);
                }
            }
        }
    }
}
