package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ46 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        int count=scanner.nextInt();
        String str=st.substring(0,count);
        System.out.println(str);
    }
}
