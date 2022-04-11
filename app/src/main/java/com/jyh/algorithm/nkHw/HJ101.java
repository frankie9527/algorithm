package com.jyh.algorithm.nkHw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HJ101 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int num=scanner.nextInt();
            scanner.nextLine();
            int [] intDada=new int[num];

            String [] dataStr=scanner.nextLine().split(" ");
            for (int i=0;i<num;i++){
                intDada[i]=Integer.parseInt(dataStr[i]);
            }
            int type=scanner.nextInt();
            sortData(intDada,type);
        }
    }
    public static void sortData(int []data,int type){
        Arrays.sort(data);
        if (type==0){
            for (int datum : data) {
                System.out.print(datum + " ");
            }
        }else {
            for (int i=data.length-1;i>=0;i--){
                System.out.print(data[i]+" ");
            }
        }
    }
}
