package com.br.datastructures;

import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt(); // total number of integers
        int m = in.nextInt(); // size of the subarray

        Set<Integer> known = new HashSet<>(m);
        int unique = 1;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            known.add(num);

            if (deque.size() == m) {
                unique = Math.max(known.size(), unique);
                Integer pop = deque.pop();
                if (!deque.contains(pop)) known.remove(pop);
            }
        }
        System.out.println(unique);
    }

}
