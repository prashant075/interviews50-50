package org.leetcodehard;

public class Reverse {
    public static void main(String[] args) {
        solution(00);
    }
    public static void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if ( N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print == 1) {
                System.out.print(N % 10);
            }

            N = N / 10;
        }
    }
}
