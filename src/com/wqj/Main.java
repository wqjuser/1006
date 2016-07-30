package com.wqj;

import java.util.Scanner;

public class Main {
    static String str = "";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int num = 0;

        for (int i = 1; i < 100; i++) {

            String str1 = String.valueOf(N);
            str += str1;
            double c = Double.parseDouble(str);
            //System.out.println(c);
            //System.out.println(str);
            double a = (Double.parseDouble(str) % M);
            //System.out.println(a);
            String str2 = String.valueOf(a);
            String[] b = str2.split("\\.");
            int d = Integer.parseInt(b[0]);
            if (d != 0) {

            } else if (d == 0) {
                System.out.println(str.length());
                break;
            } else if (i == 99) {
                System.out.println(0);

            }


        }
        //System.out.println(num);


    }
}



