package com.br.datastructures;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> set = new HashSet<>(t);
        for (int i = 0; i < t; i++) {
            String key = pair_left[i] + "/" + pair_right[i];
            set.add(key);
            System.out.println(set.size());
        }
    }

}
