package com.jyh.algorithm.nkHw;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//字符统计
public class HJ102 {

    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            char [] str=scanner.nextLine().toCharArray();
            TreeMap<Character,Integer> map=new TreeMap<>();
            for (int i=0;i<str.length;i++){
                map.put(str[i],map.getOrDefault(str[i],0)+1);
            }
            ArrayList<Map.Entry> list=new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry>() {
                @Override
                public int compare(Map.Entry o1, Map.Entry o2) {
                    return (int)o2.getValue()-(int)o1.getValue();
                }
            });
            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i).getKey());
            }
            System.out.println();
        }
    }

}
