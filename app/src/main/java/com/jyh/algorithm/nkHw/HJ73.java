package com.jyh.algorithm.nkHw;

import java.util.HashMap;
import java.util.Scanner;

//计算日期到天数转换
public class HJ73 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,31);
        map.put(2,28);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);

        while (scanner.hasNext()){
            int year=scanner.nextInt();
            int mouth=scanner.nextInt();
            int day=scanner.nextInt();
            boolean isRun=isRunYear(year);
            int allDay=0;
            if (mouth==1){
                allDay=day;
            }else if (mouth==2){
                allDay=31+day;
            }else {
                for (int i=1;i<mouth;i++){
                    allDay+=map.get(i);
                }
                allDay+=day;
                if (isRun){
                    allDay+=1;
                }
            }
            System.out.print(allDay);

        }
    }
    public static  boolean isRunYear(int year){
        if ((year%4==0&&year%100!=0)||(year%100==0&&year%400==0)){
            return true;
        }
        return false;
    }
}
