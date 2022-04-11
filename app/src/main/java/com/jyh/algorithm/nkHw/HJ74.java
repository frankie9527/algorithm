package com.jyh.algorithm.nkHw;


import java.util.Scanner;

//参数解析
public class HJ74 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            //为了处理双引号中的字符串
            if(s.charAt(i) == '\"'){
                flag = !flag;
                continue;
            }
            if(!flag && ' ' == s.charAt(i)){
                sb.append("\r\n");
                count++;
                continue;
            }
            sb.append(s.charAt(i));
        }
        System.out.println(count+1);
        System.out.print(sb.toString());
    }
}
