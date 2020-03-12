package com.br.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] subStrings = new String[s.length() - (k - 1)];

        for (int i = 0; i < subStrings.length; i++) {
            subStrings[i] = s.substring(i, i + k);
        }

        java.util.Arrays.sort(subStrings);
        smallest = subStrings[0];
        largest = subStrings[subStrings.length - 1];
        return smallest + "\n" + largest;
    }

}
