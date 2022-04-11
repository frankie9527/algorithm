package com.jyh.algorithm.nkHw;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


//找出字符串中第一个只出现一次的字符
public class HJ59 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            TreeMap<Character,Integer> map=new TreeMap<>();
            for (int i=0;i<str.length();i++){
//                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);

                if(map.get(str.charAt(i))==null){
                    map.put(str.charAt(i),1);
                }else{
                    Integer ss=map.get(str.charAt(i))+1;
                    map.put(str.charAt(i),ss);
                }
            }
            int count=0;
            for (Character s:map.keySet()){
                int v=map.get(s);
                if (v==1){
                    System.out.print(s);
                    count++;
                    break;

                }

            }
            if (count==0){
                System.out.print("-1");
            }
            System.out.println();
        }
    }
}

