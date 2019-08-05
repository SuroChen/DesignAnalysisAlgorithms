package com.suro.algorithm;

public class Hanoi {
    private static int count = 0;

    public static void hanoi(char[] current, int n, char A, char B, char C) {
        if (n == 1) {
            int i = pickTopDisk(current, A);
            current[i] = C;
            count++;
            System.out.println("move " + count + " disk " + (i + 1) + ":" + A + "->" + C);
            return;
        }
        hanoi(current, n - 1, A, C, B);
        current[n - 1] = C;
        count++;
        System.out.println("move " + count + " disk " + n + ":" + A + "->" + C);
        hanoi(current, n - 1, B, A, C);
    }

    private static int pickTopDisk(char[] current, char x) {
        int i = 0;
        while (current[i] != x)
            i++;
        return i;
    }
}
