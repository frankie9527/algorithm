package com.jyh.algorithm.nkHw;

import android.util.Log;

import java.util.Scanner;

public class HJ31 {
    public static void main(String  args){
        Scanner scan = new Scanner(args);
        String input = scan.nextLine();
        String[] str = input.split("[^a-zA-Z]");
        for(int i = str.length - 1; i >= 0; i--){
            System.out.print(str[i] + " ");
        }

        scan.close();
        Log.e("jyh", "data=" +str.toString());
    }


}
