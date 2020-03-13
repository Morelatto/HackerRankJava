package com.br.introduction;

import java.util.Scanner;

// byte  8-bit signed integer.
// short 16-bit signed integer.
// int   32-bit signed integer.
// long  64-bit signed integer.
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte"); // 1 byte
                if (x >= -32768 && x <= 32767) System.out.println("* short"); // 2 bytes
                if (x >= -2147483648 && x <= 2147483647) System.out.println("* int"); // 4 bytes
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long"); // 8 bytes
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
