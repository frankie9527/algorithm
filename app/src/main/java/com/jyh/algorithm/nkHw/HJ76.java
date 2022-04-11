package com.jyh.algorithm.nkHw;

import java.util.Scanner;

public class HJ76 {
    public  static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int num=scanner.nextInt();
            StringBuffer sb=new StringBuffer();
            int firstNum=num*num-num+1;

            for (int i=1;i<=num;i++ ){
                int x=firstNum+2*(i-1);
                if (i==num){
                    sb.append(x);
                }else {
                    sb.append(firstNum+"+");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
