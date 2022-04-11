package com.jyh.algorithm.nkHw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//https://blog.csdn.net/i_wave?t=1
//HJ26 字符串排序
public class HJ26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String string = scanner.nextLine();
            char[] ch = string.toCharArray();
            List<Character> list = new ArrayList<>();
            for(Character c:ch){
                if(Character.isLetter(c)){
                    list.add(c);
                }
            }
            //使用Collections.sort()进行排序，实现重写compare方法;
            Collections.sort(list, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1)-Character.toLowerCase(o2);
                }
            });
            int temp = 0;
            for(Character c:ch){
                if(Character.isLetter(c)){
                    System.out.print(list.get(temp));
                    temp++;
                }else{
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

}
