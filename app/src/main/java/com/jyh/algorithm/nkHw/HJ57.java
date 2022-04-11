package com.jyh.algorithm.nkHw;

import java.math.BigInteger;
import java.util.Scanner;

public class HJ57 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            BigInteger a=new BigInteger(scanner.nextLine());
            BigInteger b=new BigInteger(scanner.nextLine());
            System.out.println(a.add(b));
        }
    }
}
