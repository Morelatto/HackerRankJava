package com.br.strings;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s == null || s.trim().length() == 0)
            System.out.println("0");
        else if (s.length() > 400000)
            return;
        else {
            String[] result = s.trim().split("[^A-Za-z]+");
            System.out.println(result.length);
            for (String value : result) {
                System.out.println(value);
            }
        }
        scan.close();
    }

}
