package com.jyh.algorithm.nkHw;

import java.util.HashMap;
import java.util.Scanner;

public class HJ66 {
    public static void  main(String []args){
        Scanner scanner=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        map.put("reset","reset what");
        map.put("reset board","board fault");
        map.put("board add","where to add");
        map.put("board delete","no board at all");
        map.put("reboot backplane","impossible");
        map.put("backplane abort","install first");
        map.put("he he","unknown command");

        while (scanner.hasNext()){
            String str=scanner.nextLine();
            String cmd=map.get(str);
            if (cmd==null){
                if (map.containsKey(str)){
                    cmd=map.get(str);
                }else {
                    cmd="unknown command";
                }
            }

            System.out.println(cmd);

        }
    }
}
