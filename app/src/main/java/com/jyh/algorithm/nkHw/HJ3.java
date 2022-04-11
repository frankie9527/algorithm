package com.jyh.algorithm.nkHw;


import java.util.Scanner;
import java.util.TreeSet;

public class HJ3 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num=scanner.nextInt();
            TreeSet<Integer> set=new TreeSet<>();
            for (int i=0;i<num;i++){
                set.add(scanner.nextInt());
            }
            for (Integer s:
                    set) {
                System.out.println(s);
            }
        }
    }
}
