package com.br.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(); // length of both bit sets
        int m = scanner.nextInt(); // number of operations

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitSets = new BitSet[]{b1, b2};
        for (int i = 0; i < m; i++) {
            String oper = scanner.next();
            int set = scanner.nextInt() - 1;
            int param2 = scanner.nextInt();

            switch (oper) {
                case "AND":
                    bitSets[set].and(bitSets[param2 - 1]);
                    break;
                case "OR":
                    bitSets[set].or(bitSets[param2 - 1]);
                    break;
                case "XOR":
                    bitSets[set].xor(bitSets[param2 - 1]);
                    break;
                case "FLIP":
                    bitSets[set].flip(param2);
                    break;
                case "SET":
                    bitSets[set].set(param2);
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }

}
