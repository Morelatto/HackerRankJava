package com.br.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input) ? "true" : "false");
        }
    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (Character c : input.toCharArray()) {
            if (isClosing(c)) {
                if (stack.size() == 0 || !popMatches(stack.pop(), c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;

    }

    private static boolean isClosing(Character c) {
        return ')' == c || '}' == c || ']' == c;
    }

    private static boolean popMatches(Character pop, Character c) {
        return '(' == pop && ')' == c ||
                '{' == pop && '}' == c ||
                '[' == pop && ']' == c;
    }

}
