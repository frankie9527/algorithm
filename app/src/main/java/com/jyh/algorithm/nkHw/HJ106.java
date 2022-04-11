package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ106 {
    public static void main(String  args){
        Scanner scanner=new Scanner(args);
        String str=scanner.nextLine();
        String [] strDatas=str.split(" ");
        StringBuffer lastStr=new StringBuffer();
        for (int i=strDatas.length-1;i>=0;i--){
            lastStr.append(new StringBuffer(strDatas[i]).reverse()).append(" ");
        }
        System.out.println(lastStr.toString());
    }
}
