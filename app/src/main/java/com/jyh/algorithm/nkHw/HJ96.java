package com.jyh.algorithm.nkHw;

import java.util.Scanner;

//表示数字
//*7*SL*4*jRz*0*E*11*t*5*neyeLgWr*7*RUI*976*k*3*zVZz*1*yh*8
//*7*SL*4*jRz*0*E*11*t*5*neyeLgWr*7*RUI*976*k*3*zVZz*1*yh*8*
public class HJ96 {
    public static   void  main(){
        Scanner scanner=new Scanner("Jkdi234klowe90a3");
        while (scanner.hasNext()){
            char [] str=scanner.nextLine().toCharArray();
            boolean flag=false;
            int lastNumPosition=-1;
            for (int i=0;i<str.length;i++){
                 if (Character.isDigit(str[i])){
                       if (!flag){
                           System.out.print("*"+str[i]);
                           flag=true;
                       }else {
                           System.out.print(str[i]);
                       }
                     if (i==str.length-1){
                         System.out.print("*");
                     }
                     lastNumPosition=i;
                 }else {
                     flag=false;
                     if (lastNumPosition+1==i&&lastNumPosition!=-1){
                         System.out.print("*"+str[i]);
                     }else {
                         System.out.print(str[i]);
                     }
                 }
            }
            System.out.println();
        }
    }
}
