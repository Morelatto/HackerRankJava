package com.br.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Bubble sort
        String temp;
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j] != null && s[j + 1] != null) {
                    if (new BigDecimal(s[j]).compareTo(new BigDecimal(s[j + 1])) < 0) {
                        temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
