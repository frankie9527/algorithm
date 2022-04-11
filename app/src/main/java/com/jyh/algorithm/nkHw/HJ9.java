package com.jyh.algorithm.nkHw;

import android.util.Log;

import java.util.Map;
import java.util.Scanner;

//提取不重复的整数
public class HJ9 {
    public static void main(String  arg){


        Scanner sc=new Scanner(arg);
        String str=sc.nextLine();
        StringBuilder lastStr= new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            int currentNum=Integer.parseInt(str.charAt(i)+"");
            if (i==0&&currentNum==0){
                break;
            }
            if (!lastStr.toString().contains(currentNum + "")){
                lastStr.append(currentNum);
            }

        }

        System.out.println(Integer.parseInt(lastStr.toString()));
        Log.e("jyh", "data=" +lastStr.toString());
    }
}
