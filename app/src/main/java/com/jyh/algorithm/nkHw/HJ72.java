package com.jyh.algorithm.nkHw;
// 百钱买百鸡问题
public class HJ72 {
    public static void main(String []args){
        for (int x=0;x<=20;x++){
            for (int y=0;y<34;y++){
                int z=100-x-y;
                if (z%3==0&&(5*x+3*y+z/3)==100){
                    System.out.println(x+" "+y+" "+z);
                }
            }
        }
    }
}
