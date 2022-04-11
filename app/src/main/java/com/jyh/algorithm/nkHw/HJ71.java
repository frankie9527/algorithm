package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//HJ71 字符串通配符
public class HJ71 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String regx = scanner.nextLine();
            String str = scanner.nextLine();
            regx=regx.replace("\\?"," ");
            regx=regx.replace("\\*"," ");
            regx=regx.replace("\\."," ");
            if (regx.split(" ").length>1){
                System.out.println(false);
                return;
            }
            boolean isOK=str.contains(regx.split(" ")[0]);
            System.out.println(isOK);
        }
    }
}

