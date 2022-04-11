package com.jyh.algorithm.nkHw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HJ14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.nextLine());
        }
        Collections.sort(list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
